@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object AssertJ {
    const val GROUP = "org.assertj"
    const val VERSION = "3.12.0"
}

val DependencyHandler.`assertj-core`: String
    get() = "${AssertJ.GROUP}:assertj-core:${AssertJ.VERSION}"
