import org.gradle.kotlin.dsl.DependencyHandlerScope

object Mockito {
    const val GROUP = "org.mockito"
    const val VERSION = "2.23.4"

    internal object Dependencies {
        const val CORE = "mockito-core"
        const val JUNIT_JUPITER = "mockito-junit-jupiter"
    }
}

val DependencyHandlerScope.`mockito-core`: String
    get() = "${Mockito.GROUP}:${Mockito.Dependencies.CORE}:${Mockito.VERSION}"
val DependencyHandlerScope.`mockito-junit-jupiter`: String
    get() = "${Mockito.GROUP}:${Mockito.Dependencies.JUNIT_JUPITER}:${Mockito.VERSION}"
