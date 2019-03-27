@file:Suppress("unused")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.httpcore: String
    get() = "org.apache.httpcomponents:httpcore:4.4.10"
