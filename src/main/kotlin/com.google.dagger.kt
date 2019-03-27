@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Dagger {
    const val GROUP = "com.google.dagger"
    const val VERSION = "2.19"
    const val DAGGER = "dagger"
}

val DependencyHandler.dagger: String
    get() = "${Dagger.GROUP}:${Dagger.DAGGER}:${Dagger.VERSION}"
val DependencyHandler.`dagger-compiler`: String
    get() = "${Dagger.GROUP}:${Dagger.DAGGER}-compiler:${Dagger.VERSION}"
