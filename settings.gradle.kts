rootProject.name = "azure-service-bus"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

include(":app")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}