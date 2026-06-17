plugins {
    id("org.jetbrains.kotlin.jvm") version "2.3.10"
    id("org.jetbrains.compose") version "1.10.1"
    id("org.jetbrains.kotlin.plugin.compose") version "2.3.10"
    `maven-publish`
}

group = "com.dokar.sonner"
version = "0.3.9-fork"

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation("org.jetbrains.compose.runtime:runtime-desktop:1.10.1")
    implementation("org.jetbrains.compose.foundation:foundation-desktop:1.10.1")
    implementation("org.jetbrains.compose.ui:ui-desktop:1.10.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}