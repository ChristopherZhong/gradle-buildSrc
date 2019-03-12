@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Kotlin {
    const val GROUP = "org.jetbrains.kotlin"
    const val VERSION = "1.3.21"

    internal object Dependencies {
        const val STDLIB = "kotlin-stdlib"
        const val TEST = "kotlin-test"
    }
}

val DependencyHandler.`kotlin-reflect`: String
    get() = "${Kotlin.GROUP}:kotlin-reflect:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-stdlib`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.STDLIB}:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-stdlib-jdk8`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.STDLIB}-jdk8:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-test`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.TEST}:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-test-junit5`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.TEST}-junit5:${Kotlin.VERSION}"
