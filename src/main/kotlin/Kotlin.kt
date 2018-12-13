import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Kotlin {
    const val GROUP = "org.jetbrains.kotlin"
    const val VERSION = "1.3.11"

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

fun PluginDependenciesSpec.`kotlin-jvm`(
    version: String = Kotlin.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Kotlin.Plugins.JVM)
    return if (includeVersion) id version version else id
}

fun PluginDependenciesSpec.`kotlin-kapt`(
    version: String = Kotlin.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Kotlin.Plugins.KAPT)
    return if (includeVersion) id version version else id
}

const val `kotlin-reflect` = "${Kotlin.GROUP}:${Kotlin.Dependencies.REFLECT}:${Kotlin.VERSION}"
const val `kotlin-stdlib` = "${Kotlin.GROUP}:${Kotlin.Dependencies.STDLIB}:${Kotlin.VERSION}"
const val `kotlin-stdlib-jdk8` = "${Kotlin.GROUP}:${Kotlin.Dependencies.STDLIB_JDK8}:${Kotlin.VERSION}"
const val `kotlin-test` = "${Kotlin.GROUP}:${Kotlin.Dependencies.TEST}:${Kotlin.VERSION}"
const val `kotlin-test-junit5` = "${Kotlin.GROUP}:${Kotlin.Dependencies.TEST_JUNIT5}:${Kotlin.VERSION}"
