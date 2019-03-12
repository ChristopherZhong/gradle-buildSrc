@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object SpringFramework {
    const val GROUP = "org.springframework"
    const val VERSION = "5.1.5.RELEASE"

    object Dependency {
        const val CONTEXT = "spring-context"
    }
}

val DependencyHandler.`spring-context`: String
    get() = "${SpringFramework.GROUP}:${SpringFramework.Dependency.CONTEXT}:${SpringFramework.VERSION}"
