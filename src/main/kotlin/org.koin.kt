@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Koin {
    const val GROUP = "org.koin"
    const val VERSION = "1.0.2"
}

val DependencyHandler.`koin-core`: String
    get() = "${Koin.GROUP}:koin-core:${Koin.VERSION}"
val DependencyHandler.`koin-core-ext`: String
    get() = "${Koin.GROUP}:koin-core-ext:${Koin.VERSION}"
val DependencyHandler.`koin-java`: String
    get() = "${Koin.GROUP}:koin-java:${Koin.VERSION}"
val DependencyHandler.`koin-test`: String
    get() = "${Koin.GROUP}:koin-test:${Koin.VERSION}"
