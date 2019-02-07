import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Kotlin {
    const val GROUP = "org.jetbrains.kotlin"
    const val VERSION = "1.3.21"

    internal object Plugins {
        const val JVM = "$GROUP.jvm"
        const val KAPT = "$GROUP.kapt"
    }

    internal object Dependencies {
        const val REFLECT = "kotlin-reflect"
        const val STDLIB = "kotlin-stdlib"
        const val STDLIB_JDK8 = "$STDLIB-jdk8"
        const val TEST = "kotlin-test"
        const val TEST_JUNIT5 = "$TEST-junit5"
    }
}

val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec
    get() = `kotlin-jvm`(Kotlin.VERSION)

fun PluginDependenciesSpec.`kotlin-jvm`(version: String? = null): PluginDependencySpec =
        id(Kotlin.Plugins.JVM).apply {
            if (version != null) {
                return this version version
            }
        }

val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec
    get() = `kotlin-kapt`(Kotlin.VERSION)

fun PluginDependenciesSpec.`kotlin-kapt`(version: String? = null): PluginDependencySpec =
        id(Kotlin.Plugins.KAPT).apply {
            if (version != null) {
                this version version
            }
        }

val DependencyHandler.`kotlin-reflect`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.REFLECT}:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-stdlib`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.STDLIB}:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-stdlib-jdk8`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.STDLIB_JDK8}:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-test`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.TEST}:${Kotlin.VERSION}"
val DependencyHandler.`kotlin-test-junit5`: String
    get() = "${Kotlin.GROUP}:${Kotlin.Dependencies.TEST_JUNIT5}:${Kotlin.VERSION}"
