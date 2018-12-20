import org.gradle.kotlin.dsl.DependencyHandlerScope

object JUnit5 {
    const val GROUP = "org.junit"
    const val VERSION = "5.3.2"

    internal object Dependencies {
        const val BOM = "junit-bom"
    }
}

val DependencyHandlerScope.`junit-bom`: String
    get() = "${JUnit5.GROUP}:${JUnit5.Dependencies.BOM}:${JUnit5.VERSION}"

object JUnit5_Jupiter {
    const val GROUP = "${JUnit5.GROUP}.jupiter"

    internal object Dependencies {
        const val API = "junit-jupiter-api"
        const val ENGINE = "junit-jupiter-engine"
        const val PARAMS = "junit-jupiter-params"
    }
}

val DependencyHandlerScope.`junit-jupiter-api`: String
    get() = "${JUnit5_Jupiter.GROUP}:${JUnit5_Jupiter.Dependencies.API}:${JUnit5.VERSION}"
val DependencyHandlerScope.`junit-jupiter-engine`: String
    get() = "${JUnit5_Jupiter.GROUP}:${JUnit5_Jupiter.Dependencies.ENGINE}:${JUnit5.VERSION}"
val DependencyHandlerScope.`junit-jupiter-params`: String
    get() = "${JUnit5_Jupiter.GROUP}:${JUnit5_Jupiter.Dependencies.PARAMS}:${JUnit5.VERSION}"

object JUnit5_Vintage {
    const val GROUP = "${JUnit5.GROUP}.vintage"

    internal object Dependencies {
        const val ENGINE = "junit-vintage-engine"
    }
}

val DependencyHandlerScope.`junit-vintage-engine`: String
    get() = "${JUnit5_Vintage.GROUP}:${JUnit5_Vintage.Dependencies.ENGINE}:${JUnit5.VERSION}"
