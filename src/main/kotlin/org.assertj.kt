@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object AssertJ {
    const val GROUP = "org.assertj"
    const val VERSION = "3.12.0"

    internal object Dependency {
        const val CORE = "assertj-core"
    }
}

val DependencyHandler.`assertj-core`: String
    get() = "${AssertJ.GROUP}:${AssertJ.Dependency.CORE}:${AssertJ.VERSION}"
