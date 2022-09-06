import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    application
    id("com.google.devtools.ksp") version "1.6.21-1.0.5"
}

group = "me.admin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // Koin
    implementation("io.insert-koin:koin-core:3.2.0")
    implementation("io.insert-koin:koin-annotations:1.0.1")
    ksp("io.insert-koin:koin-ksp-compiler:1.0.1")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}

// KSP - To use generated sources
sourceSets.main {
    java.srcDirs("build/generated/ksp/main/kotlin")
}









