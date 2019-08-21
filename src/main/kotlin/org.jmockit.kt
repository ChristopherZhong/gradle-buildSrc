@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.jmockit
    get() = "org.jmockit:jmockit:1.43"
