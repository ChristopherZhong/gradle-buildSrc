import org.gradle.api.artifacts.dsl.DependencyHandler

object SpringFramework {
    const val GROUP = "org.springframework"
    const val VERSION = "5.1.4.RELEASE"

    object Dependencies {
        const val CONTEXT = "spring-context"
    }
}

val DependencyHandler.`spring-context`: String
    get() = "${SpringFramework.GROUP}:${SpringFramework.Dependencies.CONTEXT}:${SpringFramework.VERSION}"
