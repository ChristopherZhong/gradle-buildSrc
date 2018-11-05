import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Kotlin {
    const val id = "org.jetbrains.kotlin"
    const val version = "1.3.0"
    const val jvm = "$id.jvm"
    const val kapt = "$id.kapt"
}

inline val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec
    get() = kotlin("jvm") version Kotlin.version
inline val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec
    get() = kotlin("kapt") version Kotlin.version
