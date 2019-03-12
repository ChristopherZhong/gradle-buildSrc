@file:Suppress("unused")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Lombok {
    const val GROUP = "org.projectlombok"
    const val VERSION = "1.18.4"
}

val DependencyHandler.lombok: String
    get() = "${Lombok.GROUP}:lombok:${Lombok.VERSION}"
