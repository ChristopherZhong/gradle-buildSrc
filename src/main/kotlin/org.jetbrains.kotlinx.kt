@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object KotlinX {
    const val GROUP = "org.jetbrains.kotlinx"
    const val VERSION = "1.1.1"

    internal object Dependencies {
        const val COROUTINES = "kotlinx-coroutines"
        const val CORE = "${KotlinX.Dependencies.COROUTINES}-core"
    }
}

val DependencyHandler.`kotlinx-coroutines-core`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.CORE}:${KotlinX.VERSION}"
val DependencyHandler.`kotlinx-coroutines-core-common`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.CORE}-common:${KotlinX.VERSION}"
val DependencyHandler.`kotlinx-coroutines-javafx`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.COROUTINES}-javafx:${KotlinX.VERSION}"
val DependencyHandler.`kotlinx-coroutines-jdk8`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.COROUTINES}-jdk8:${KotlinX.VERSION}"
