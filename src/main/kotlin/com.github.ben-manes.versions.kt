@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object BenManesVersions

val DependencyHandler.`gradle-versions-plugin`: String
    get() = "com.github.ben-manes.versions:gradle-versions-plugin:0.22.0"
