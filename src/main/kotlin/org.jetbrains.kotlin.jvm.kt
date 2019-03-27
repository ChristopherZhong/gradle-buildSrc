@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object KotlinJvm {
    const val GROUP = "${Kotlin.GROUP}.jvm"
}

val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec
    get() = `kotlin-jvm`(Kotlin.VERSION)

fun PluginDependenciesSpec.`kotlin-jvm`(version: String? = null): PluginDependencySpec =
    id(KotlinJvm.GROUP).applyVersion(version)
