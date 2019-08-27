@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.`slf4j-api`: String
    get() = "org.slf4j:slf4j-api:1.7.25"
