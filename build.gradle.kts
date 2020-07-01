// SPDX-License-Identifier: MIT OR Apache-2.0
@file:Suppress("SpellCheckingInspection")

plugins {
    kotlin("multiplatform") version Kotlin.version apply false
    id("de.undercouch.download") version Download.version apply false
    id("org.jetbrains.dokka") version Dokka.version
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

apply {
    from("dokka.gradle")
}
