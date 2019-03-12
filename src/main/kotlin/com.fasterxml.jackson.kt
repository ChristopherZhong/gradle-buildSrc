@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Jackson {
    const val GROUP = "com.fasterxml.jackson"
    const val VERSION = "2.9.8"
}

val DependencyHandler.`jackson-bom`: String
    get() = "${Jackson.GROUP}:jackson-bom:${Jackson.VERSION}"
