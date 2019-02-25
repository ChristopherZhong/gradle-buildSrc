import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5 {
    const val GROUP = "org.junit"
    const val VERSION = "5.4.0"

    internal object Dependency {
        const val BOM = "junit-bom"
    }
}

val DependencyHandler.`junit-bom`: String
    get() = "${JUnit5.GROUP}:${JUnit5.Dependency.BOM}:${JUnit5.VERSION}"

object JUnit5_Vintage {
    const val GROUP = "${JUnit5.GROUP}.vintage"

    internal object Dependencies {
        const val ENGINE = "junit-vintage-engine"
    }
}

val DependencyHandler.`junit-vintage-engine`: String
    get() = "${JUnit5_Vintage.GROUP}:${JUnit5_Vintage.Dependencies.ENGINE}:${JUnit5.VERSION}"
