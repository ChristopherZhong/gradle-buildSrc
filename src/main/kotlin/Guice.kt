import org.gradle.api.artifacts.dsl.DependencyHandler

object Guice {
    const val GROUP = "com.google.inject"
    const val VERSION = "4.2.2"

    object Dependencies {
        const val BOM = "guice-bom"
        const val GUICE = "guice"
    }
}

val DependencyHandler.guice: String
    get() = "${Guice.GROUP}:${Guice.Dependencies.GUICE}"
val DependencyHandler.`guice-bom`: String
    get() = "${Guice.GROUP}:${Guice.Dependencies.BOM}:${Guice.VERSION}"
