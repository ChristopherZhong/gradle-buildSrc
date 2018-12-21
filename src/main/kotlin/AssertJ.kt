import org.gradle.api.artifacts.dsl.DependencyHandler

object AssertJ {
    const val GROUP = "org.assertj"
    const val VERSION = "3.11.1"

    internal object Dependencies {
        const val CORE = "assertj-core"
    }
}

val DependencyHandler.`assertj-core`: String
    get() = "${AssertJ.GROUP}:${AssertJ.Dependencies.CORE}:${AssertJ.VERSION}"
