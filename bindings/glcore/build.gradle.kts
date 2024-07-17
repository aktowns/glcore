plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    `maven-publish`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    runtimeOnly(project(":native"))
}

group = "au.ikx.glcore"
version = "1.0-SNAPSHOT"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "au.ikx.glcore"
            artifactId = "glcore"
            version = "1.0-SNAPSHOT"

            from(components["java"])
        }
    }
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
    withSourcesJar()
    withJavadocJar()
}
