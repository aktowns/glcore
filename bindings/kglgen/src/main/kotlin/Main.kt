import com.github.javaparser.JavaParser
import com.github.javaparser.ParserConfiguration
import com.github.javaparser.StaticJavaParser
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration
import com.github.javaparser.ast.body.Parameter
import com.squareup.kotlinpoet.*
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun typeMapper(inp: String): ClassName {
    return when (inp) {
        "int" -> INT
        "double" -> DOUBLE
        "byte" -> BYTE
        "float" -> FLOAT
        "long" -> LONG
        "short" -> SHORT
        "void" -> UNIT
        "MemorySegment" -> ClassName("java.lang.foreign", "MemorySegment")
        else -> error("Unhandled $inp")
    }
}

fun valueMapper(inp: String): String {
    return when (inp) {
        "val" -> "`val`"
        else -> inp
    }
}

fun main() {
    val cfg = ParserConfiguration()
    cfg.languageLevel = ParserConfiguration.LanguageLevel.JAVA_21
    val parser = JavaParser(cfg)

    val fnfiles = Files.find(Paths.get("glcore", "src", "main", "java"), 5,
        { p, bfa ->
            bfa.isRegularFile && p.fileName.toString().startsWith("PFN")
        }).toList()

    val files = Files.find(Paths.get("glcore", "src", "main", "java"), 5,
        { p, bfa ->
            bfa.isRegularFile && p.fileName.toString().startsWith("GLCore")
        }).toList()

    val fnMap: MutableMap<String, Pair<List<Parameter>, String>> = mutableMapOf()

    fnfiles.toList().map { path ->
        val cu = StaticJavaParser.parse(path)

        cu.findAll(ClassOrInterfaceDeclaration::class.java).toList().map { klass ->
            val methods = klass.getMethodsByName("invoke")
            methods.toList().map { meth ->
                fnMap.put(klass.name.toString(), Pair(meth.parameters.toList(), meth.typeAsString))
            }
        }
    }

    val fb = TypeSpec.objectBuilder("GL")

    val k = files.toList().fold(fb) { fbb, path ->
        val cu = parser.parse(path).result.get()

        val methods = cu.findAll(ClassOrInterfaceDeclaration::class.java).toList().flatMap { klass ->
            klass.methods
                .filter { method ->
                    method.name.toString().startsWith("glad_debug_")
                            && !method.name.toString().contains("$")
                }
                .distinctBy { it.name.toString().removePrefix("glad_debug_") }
                .map { method ->
                    val nname = method.name.toString().removePrefix("glad_debug_")
                    val tryMatch = "PFN${nname.uppercase()}PROC"

                    val (rparams, rty) = fnMap[tryMatch]!!

                    val params: List<Parameter> = rparams.drop(1)

                    val withParams: FunSpec.Builder = params.fold(FunSpec.builder(nname)) { builder, param ->
                        val klsParam = typeMapper(param.typeAsString)
                        builder.addParameter(param.nameAsString, klsParam)
                    }

                    val pformat: String = params.map { valueMapper(it.nameAsString) }.joinToString()

                    withParams
                        .returns(typeMapper(rty))
                        .addStatement("return $tryMatch.invoke(GLCore.${method.name}(), $pformat)")
                        .addModifiers(KModifier.INLINE)
                        .build()
                }
        }

        fbb.addFunctions(methods)
    }.build()

    val klass = FileSpec
        .builder("au.ikx.glcore", "GL")
        .addType(k)
        .build()

    klass.writeTo(Path.of("kglcore", "src", "main", "kotlin"))
    println(klass)
}
