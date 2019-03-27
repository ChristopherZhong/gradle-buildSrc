@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Commons {
    const val GROUP = "org.apache.commons"
}

val DependencyHandler.`commons-csv`: String
    get() = "${Commons.GROUP}:commons-csv:1.6"
val DependencyHandler.`commons-net`: String
    get() = "commons-net:commons-net:3.6"
