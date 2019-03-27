@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5Vintage {
    const val GROUP = "${JUnit5.GROUP}.vintage"
}

val DependencyHandler.`junit-vintage-engine`: String
    get() = "${JUnit5Vintage.GROUP}:${JUnit5.JUNIT}-vintage-engine:${JUnit5.VERSION}"
