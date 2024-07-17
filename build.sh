../bin/jextract -t au.ikx.glcore --header-class-name STBImage --output ./bindings/glcore/src/main/java -I glad/include /usr/include/stb/stb_image.h
../bin/jextract -l GL -l glfw -t au.ikx.glcore --header-class-name GLCore --output ./bindings/glcore/src/main/java -I glad/include core.h
../bin/jextract -l shaderc -t au.ikx.glcore --header-class-name ShaderC --output ./bindings/glcore/src/main/java -I glad/include /usr/include/shaderc/shaderc.h


