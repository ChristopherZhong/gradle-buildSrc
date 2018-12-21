import org.gradle.api.artifacts.dsl.DependencyHandler

object Mockito {
    const val GROUP = "org.mockito"
    const val VERSION = "2.23.4"

    internal object Dependencies {
        const val CORE = "mockito-core"
        const val JUNIT_JUPITER = "mockito-junit-jupiter"
    }
}

val DependencyHandler.`mockito-core`: String
    get() = "${Mockito.GROUP}:${Mockito.Dependencies.CORE}:${Mockito.VERSION}"
val DependencyHandler.`mockito-junit-jupiter`: String
    get() = "${Mockito.GROUP}:${Mockito.Dependencies.JUNIT_JUPITER}:${Mockito.VERSION}"
