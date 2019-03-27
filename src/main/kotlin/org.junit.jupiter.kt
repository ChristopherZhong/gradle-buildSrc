@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5Jupiter {
    const val GROUP = "${JUnit5.GROUP}.jupiter"

    const val JUPITER = "${JUnit5.JUNIT}-jupiter"
}

val DependencyHandler.`junit-jupiter-api`: String
    get() = "${JUnit5Jupiter.GROUP}:${JUnit5Jupiter.JUPITER}-api:${JUnit5.VERSION}"
val DependencyHandler.`junit-jupiter-engine`: String
    get() = "${JUnit5Jupiter.GROUP}:${JUnit5Jupiter.JUPITER}-engine:${JUnit5.VERSION}"
val DependencyHandler.`junit-jupiter-params`: String
    get() = "${JUnit5Jupiter.GROUP}:${JUnit5Jupiter.JUPITER}-params:${JUnit5.VERSION}"
