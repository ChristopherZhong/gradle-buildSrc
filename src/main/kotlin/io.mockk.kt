@file:Suppress("unused")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.mockk: String
    get() = "io.mockk:mockk:1.9.3"

