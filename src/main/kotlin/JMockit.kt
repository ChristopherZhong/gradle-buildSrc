import org.gradle.api.artifacts.dsl.DependencyHandler

object JMockit {
    const val GROUP = "org.jmockit"
    const val VERSION = "1.43"

    object Dependencies {
        const val JMOCKIT = "jmockit"
    }
}

val DependencyHandler.jmockit
    get() = "${JMockit.GROUP}:${JMockit.Dependencies.JMOCKIT}:${JMockit.VERSION}"
