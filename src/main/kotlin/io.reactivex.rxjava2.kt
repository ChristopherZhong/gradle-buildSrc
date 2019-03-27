@file:Suppress("unused")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.rxjava: String
    get() = "io.reactivex.rxjava2:rxjava:2.2.4"
