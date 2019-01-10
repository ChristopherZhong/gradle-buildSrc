import org.gradle.api.artifacts.dsl.DependencyHandler

object GuiceExtensions {
    const val GROUP = "${Guice.GROUP}.extensions"

    object Dependencies {
        const val ASSISTEDINJECT = "guice-assistedinject"
    }
}

val DependencyHandler.`guice-assistedinject`: String
    get() = "${GuiceExtensions.GROUP}:${GuiceExtensions.Dependencies.ASSISTEDINJECT}"
