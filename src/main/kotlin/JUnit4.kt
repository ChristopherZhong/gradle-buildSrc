import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit4 {
    const val GROUP = "junit"
    const val VERSION = "4.12"

    internal object Dependencies {
        const val JUNIT = "junit"
    }
}

val DependencyHandler.junit: String
    get() = "${JUnit4.GROUP}:${JUnit4.Dependencies.JUNIT}:${JUnit4.VERSION}"
