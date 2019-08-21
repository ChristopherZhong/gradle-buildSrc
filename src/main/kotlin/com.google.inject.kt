@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Guice {
    const val GROUP = "com.google.inject"
    const val VERSION = "4.2.2"
}

val DependencyHandler.guice: String
    get() = "${Guice.GROUP}:guice"
val DependencyHandler.`guice-bom`: String
    get() = "${Guice.GROUP}:guice-bom:${Guice.VERSION}"
