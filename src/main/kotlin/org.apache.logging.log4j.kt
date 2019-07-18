@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Log4j {
    const val GROUP = "org.apache.logging.log4j"
    const val VERSION = "2.11.2"
}

val DependencyHandler.`log4j-1_2-api`: String
    get() = "${Log4j.GROUP}:log4j-1.2-api:${Log4j.VERSION}"
val DependencyHandler.`log4j-api`: String
    get() = "${Log4j.GROUP}:log4j-api:${Log4j.VERSION}"
val DependencyHandler.`log4j-api-kotlin`: String
    get() = "${Log4j.GROUP}:log4j-api-kotlin:1.0.0"
val DependencyHandler.`log4j-bom`: String
    get() = "${Log4j.GROUP}:log4j-bom:${Log4j.VERSION}"
val DependencyHandler.`log4j-core`: String
    get() = "${Log4j.GROUP}:log4j-core:${Log4j.VERSION}"
val DependencyHandler.`log4j-jcl`: String
    get() = "${Log4j.GROUP}:log4j-jcl:${Log4j.VERSION}"
val DependencyHandler.`log4j-slf4j-impl`: String
    get() = "${Log4j.GROUP}:log4j-slf4j-impl:${Log4j.VERSION}"
