import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5Vintage {
    const val GROUP = "${JUnit5.GROUP}.vintage"

    internal object Dependency {
        const val ENGINE = "junit-vintage-engine"
    }
}

val DependencyHandler.`junit-vintage-engine`: String
    get() = "${JUnit5Vintage.GROUP}:${JUnit5Vintage.Dependency.ENGINE}:${JUnit5.VERSION}"
