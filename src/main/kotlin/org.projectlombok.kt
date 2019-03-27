@file:Suppress("unused")

import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.lombok: String
    get() = "org.projectlombok:lombok:1.18.4"
