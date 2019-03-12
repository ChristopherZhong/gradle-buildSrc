@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5Jupiter {
    const val GROUP = "${JUnit5.GROUP}.jupiter"
}

val DependencyHandler.`junit-jupiter-api`: String
    get() = "${JUnit5Jupiter.GROUP}:junit-jupiter-api:${JUnit5.VERSION}"
val DependencyHandler.`junit-jupiter-engine`: String
    get() = "${JUnit5Jupiter.GROUP}:junit-jupiter-engine:${JUnit5.VERSION}"
val DependencyHandler.`junit-jupiter-params`: String
    get() = "${JUnit5Jupiter.GROUP}:junit-jupiter-params:${JUnit5.VERSION}"
