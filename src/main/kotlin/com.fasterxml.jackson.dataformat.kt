@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object JacksonDataFormat {
    const val GROUP = "${Jackson.GROUP}.dataformat"

    internal object Dependencies {
        const val YAML = "jackson-dataformat-yaml"
    }
}

val DependencyHandler.`jackson-dataformat-yaml`: String
    get() = "${JacksonDataFormat.GROUP}:${JacksonDataFormat.Dependencies.YAML}:${Jackson.VERSION}"
