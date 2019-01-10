import org.gradle.api.artifacts.dsl.DependencyHandler

object HttpComponents {
    const val GROUP = "${Apache.GROUP}.httpcomponents"
    const val VERSION = "4.4.10"

    object Dependencies {
        const val HTTPCORE = "httpcore"
    }
}

val DependencyHandler.httpcore: String
    get() = "${HttpComponents.GROUP}:${HttpComponents.Dependencies.HTTPCORE}:${HttpComponents.VERSION}"
