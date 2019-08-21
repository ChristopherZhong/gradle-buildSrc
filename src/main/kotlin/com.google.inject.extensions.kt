@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object GuiceExtensions {
    const val GROUP = "${Guice.GROUP}.extensions"
}

val DependencyHandler.`guice-assistedinject`: String
    get() = "${GuiceExtensions.GROUP}:guice-assistedinject:4.2.2"
