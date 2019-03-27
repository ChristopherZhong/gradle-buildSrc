@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.`stripe-java`: String
    get() = "com.stripe:stripe-java:7.0.0"
