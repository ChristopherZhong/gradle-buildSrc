@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Mockito {
    const val GROUP = "org.mockito"
    const val VERSION = "2.24.5"
}

val DependencyHandler.`mockito-core`: String
    get() = "${Mockito.GROUP}:mockito-core:${Mockito.VERSION}"
val DependencyHandler.`mockito-junit-jupiter`: String
    get() = "${Mockito.GROUP}:mockito-junit-jupiter:${Mockito.VERSION}"
