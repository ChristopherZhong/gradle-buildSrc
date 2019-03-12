@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JacksonDataFormat {
    const val GROUP = "${Jackson.GROUP}.dataformat"
}

val DependencyHandler.`jackson-dataformat-yaml`: String
    get() = "${JacksonDataFormat.GROUP}:jackson-dataformat-yaml:${Jackson.VERSION}"
