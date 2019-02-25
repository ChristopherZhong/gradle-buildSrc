import org.gradle.api.artifacts.dsl.DependencyHandler

object Mockito {
    const val GROUP = "org.mockito"
    const val VERSION = "2.24.0"

    internal object Dependency {
        const val CORE = "mockito-core"
        const val JUNIT_JUPITER = "mockito-junit-jupiter"
    }
}

val DependencyHandler.`mockito-core`: String
    get() = "${Mockito.GROUP}:${Mockito.Dependency.CORE}:${Mockito.VERSION}"
val DependencyHandler.`mockito-junit-jupiter`: String
    get() = "${Mockito.GROUP}:${Mockito.Dependency.JUNIT_JUPITER}:${Mockito.VERSION}"
