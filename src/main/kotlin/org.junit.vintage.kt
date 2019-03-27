@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.`junit-vintage-engine`: String
    get() = "${JUnit5.GROUP}.vintage:${JUnit5.JUNIT}-vintage-engine:${JUnit5.VERSION}"
