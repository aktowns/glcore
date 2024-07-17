plugins {
    kotlin("jvm") version "2.0.0"
}

group = "au.ikx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project(":glcore"))
    implementation("com.squareup:kotlinpoet:1.18.0")
    implementation("com.github.javaparser:javaparser-symbol-solver-core:3.26.1")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
}
