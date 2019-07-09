@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JacksonModule {
    const val GROUP = "${Jackson.GROUP}.module"
}

val DependencyHandler.`jackson-module-kotlin`: String
    get() = "${JacksonModule.GROUP}:jackson-module-kotlin:${Jackson.VERSION}"
