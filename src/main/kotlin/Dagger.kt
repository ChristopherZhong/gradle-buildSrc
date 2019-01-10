import org.gradle.api.artifacts.dsl.DependencyHandler

object Dagger {
    const val GROUP = "com.google.dagger"
    const val VERSION = "2.19"

    object Dependencies {
        const val COMPILER = "dagger-compiler"
        const val DAGGER = "dagger"
    }
}

val DependencyHandler.dagger: String
    get() = "${Dagger.GROUP}:${Dagger.Dependencies.DAGGER}:${Dagger.VERSION}"
val DependencyHandler.`dagger-compiler`: String
    get() = "${Dagger.GROUP}:${Dagger.Dependencies.COMPILER}:${Dagger.VERSION}"
