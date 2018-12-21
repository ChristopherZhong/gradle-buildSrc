import org.gradle.api.artifacts.dsl.DependencyHandler

object Inject {
    const val GROUP = "javax.inject"
    const val VERSION = "1"

    internal object Dependencies {
        const val INJECT = "javax.inject"
    }
}

val DependencyHandler.`javax_inject`: String
    get() = "${Inject.GROUP}:${Inject.Dependencies.INJECT}:${Inject.VERSION}"
