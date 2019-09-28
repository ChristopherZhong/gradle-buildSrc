@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Kotlin {

    internal object Dependencies {
        const val KOTLIN = "kotlin"
        const val STDLIB = "$KOTLIN-stdlib"
        const val TEST = "$KOTLIN-test"
    }
}

val DependencyHandler.`kotlin-reflect`: String
    get() = "org.jetbrains.kotlin:${Kotlin.Dependencies.KOTLIN}-reflect:1.3.41"
val DependencyHandler.`kotlin-stdlib`: String
    get() = "org.jetbrains.kotlin:${Kotlin.Dependencies.STDLIB}:1.3.41"
val DependencyHandler.`kotlin-stdlib-jdk8`: String
    get() = "org.jetbrains.kotlin:${Kotlin.Dependencies.STDLIB}-jdk8:1.3.41"
val DependencyHandler.`kotlin-test`: String
    get() = "org.jetbrains.kotlin:${Kotlin.Dependencies.TEST}:1.3.41"
val DependencyHandler.`kotlin-test-junit5`: String
    get() = "org.jetbrains.kotlin:${Kotlin.Dependencies.TEST}-junit5:1.3.41"
