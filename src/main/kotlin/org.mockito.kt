@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Mockito {
    const val GROUP = "org.mockito"
    const val VERSION = "2.25.1"
    const val MOCKITO = "mockito"
}

val DependencyHandler.`mockito-core`: String
    get() = "${Mockito.GROUP}:${Mockito.MOCKITO}-core:${Mockito.VERSION}"
val DependencyHandler.`mockito-junit-jupiter`: String
    get() = "${Mockito.GROUP}:${Mockito.MOCKITO}-junit-jupiter:${Mockito.VERSION}"
