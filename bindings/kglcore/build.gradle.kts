plugins {
    kotlin("jvm") version "2.0.0"
    `maven-publish`
}

group = "au.ikx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project(":glcore"))
    runtimeOnly("com.squareup:kotlinpoet:1.18.0")
    runtimeOnly(project(":native"))
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "au.ikx.glcore"
            artifactId = "kglcore"
            version = "1.0-SNAPSHOT"

            from(components["kotlin"])
        }
    }
}
