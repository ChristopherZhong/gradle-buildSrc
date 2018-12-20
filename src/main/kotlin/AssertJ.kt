import org.gradle.kotlin.dsl.DependencyHandlerScope

object AssertJ {
    const val GROUP = "org.assertj"
    const val VERSION = "3.11.1"

    internal object Dependencies {
        const val CORE = "assertj-core"
    }
}

val DependencyHandlerScope.`assertj-core`: String
    get() = "${AssertJ.GROUP}:${AssertJ.Dependencies.CORE}:${AssertJ.VERSION}"
