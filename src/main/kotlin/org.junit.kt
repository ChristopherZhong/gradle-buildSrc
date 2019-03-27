@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5 {
    const val GROUP = "org.junit"
    const val VERSION = "5.4.0"

    const val JUNIT = "junit"
}


val DependencyHandler.`junit-bom`: String
    get() = "${JUnit5.GROUP}:${JUnit5.JUNIT}-bom:${JUnit5.VERSION}"
