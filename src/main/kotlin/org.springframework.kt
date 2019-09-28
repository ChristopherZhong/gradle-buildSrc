@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object SpringFramework {
    const val VERSION = "5.1.5.RELEASE"
}

val DependencyHandler.`spring-context`: String
    get() = "org.springframework:spring-context:${SpringFramework.VERSION}"
