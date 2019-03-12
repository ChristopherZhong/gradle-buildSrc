@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object SpringFramework {
    const val GROUP = "org.springframework"
    const val VERSION = "5.1.5.RELEASE"
}

val DependencyHandler.`spring-context`: String
    get() = "${SpringFramework.GROUP}:spring-context:${SpringFramework.VERSION}"
