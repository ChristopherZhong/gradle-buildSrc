@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec
    get() = `kotlin-jvm`(Kotlin.VERSION)

fun PluginDependenciesSpec.`kotlin-jvm`(version: String? = null): PluginDependencySpec =
    id("${Kotlin.GROUP}.jvm").applyVersion(version)
