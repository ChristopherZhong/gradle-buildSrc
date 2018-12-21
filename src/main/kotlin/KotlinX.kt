import org.gradle.api.artifacts.dsl.DependencyHandler

object KotlinX {
    const val GROUP = "org.jetbrains.kotlinx"
    const val VERSION = "1.0.1"

    internal object Dependencies {
        const val COROUTINES_CORE = "kotlinx-coroutines-core"
        const val COROUTINES_CORE_COMMON = "kotlinx-coroutines-core-common"
        const val COROUTINES_JAVAFX = "kotlinx-coroutines-javafx"
        const val COROUTINES_JDK8 = "kotlinx-coroutines-jdk8"
    }
}

val DependencyHandler.`kotlinx-coroutines-core`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.COROUTINES_CORE}:${KotlinX.VERSION}"
val DependencyHandler.`kotlinx-coroutines-core-common`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.COROUTINES_CORE_COMMON}:${KotlinX.VERSION}"
val DependencyHandler.`kotlinx-coroutines-javafx`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.COROUTINES_JAVAFX}:${KotlinX.VERSION}"
val DependencyHandler.`kotlinx-coroutines-jdk8`: String
    get() = "${KotlinX.GROUP}:${KotlinX.Dependencies.COROUTINES_JDK8}:${KotlinX.VERSION}"
