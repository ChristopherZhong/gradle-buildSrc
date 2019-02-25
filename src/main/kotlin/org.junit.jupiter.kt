import org.gradle.api.artifacts.dsl.DependencyHandler

object JUnit5Jupiter {
    const val GROUP = "${JUnit5.GROUP}.jupiter"

    internal object Dependency {
        const val API = "junit-jupiter-api"
        const val ENGINE = "junit-jupiter-engine"
        const val PARAMS = "junit-jupiter-params"
    }
}

val DependencyHandler.`junit-jupiter-api`: String
    get() = "${JUnit5Jupiter.GROUP}:${JUnit5Jupiter.Dependency.API}:${JUnit5.VERSION}"
val DependencyHandler.`junit-jupiter-engine`: String
    get() = "${JUnit5Jupiter.GROUP}:${JUnit5Jupiter.Dependency.ENGINE}:${JUnit5.VERSION}"
val DependencyHandler.`junit-jupiter-params`: String
    get() = "${JUnit5Jupiter.GROUP}:${JUnit5Jupiter.Dependency.PARAMS}:${JUnit5.VERSION}"
