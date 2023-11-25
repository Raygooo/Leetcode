import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "me.ray"
version = "1.0-SNAPSHOT"

repositories {
    maven{ url = uri("https://maven.aliyun.com/repository/central") }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

// set kotlin java target version to java 17
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}