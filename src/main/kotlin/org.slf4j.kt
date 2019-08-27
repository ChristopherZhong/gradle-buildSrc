import org.gradle.api.artifacts.dsl.DependencyHandler

object SLF4J {
    const val GROUP = "org.slf4j"
    const val VERSION = "1.7.25"

    internal object Dependencies {
        const val API = "slf4j-api"
    }
}

val DependencyHandler.`slf4j-api`: String
    get() = "${SLF4J.GROUP}:${SLF4J.Dependencies.API}:${SLF4J.VERSION}"
