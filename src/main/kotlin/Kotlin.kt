import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.jetbrains.kotlin.Kotlin

inline val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec
    get() = kotlin("jvm") version Kotlin.VERSION
inline val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec
    get() = kotlin("kapt") version Kotlin.VERSION
