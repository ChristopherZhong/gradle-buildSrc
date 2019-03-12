@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5 {
    const val GROUP = "org.junit"
    const val VERSION = "5.4.0"

    internal object Dependency {
        const val BOM = "junit-bom"
    }
}

val DependencyHandler.`junit-bom`: String
    get() = "${JUnit5.GROUP}:${JUnit5.Dependency.BOM}:${JUnit5.VERSION}"
