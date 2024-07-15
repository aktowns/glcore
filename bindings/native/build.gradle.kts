plugins {
    `cpp-library`
    java
    `maven-publish`
}

group = "au.ikx.glcore"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

library {
    targetMachines.add(machines.linux.x86_64) // Add your target machine configurations here
}

val createJar by tasks.registering(Jar::class) {
    dependsOn(":native:linkDebug")

    archiveBaseName.set("native")
    from(fileTree("build/lib/main/debug")) {
        include("**/*.so")
    }
}

tasks {
    build {
        dependsOn(createJar)
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifact(createJar.get()) {
                extension = "jar"
            }
            groupId = "au.ikx.glcore"
            artifactId = "native"
            version = "1.0-SNAPSHOT"

        }
    }

    repositories {
        mavenLocal()
    }
}

tasks.withType<CppCompile> {
    source.from(fileTree("src/main/cpp") {
        include("**/*.c")
    })

    includes.from("include/")
}
