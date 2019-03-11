import org.gradle.api.artifacts.dsl.DependencyHandler

object Jackson {
    const val GROUP = "com.fasterxml.jackson"
    const val VERSION = "2.9.8"

    internal object Dependencies {
        const val BOM = "jackson-bom"
    }
}

val DependencyHandler.`jackson-bom`: String
    get() = "${Jackson.GROUP}:${Jackson.Dependencies.BOM}:${Jackson.VERSION}"
