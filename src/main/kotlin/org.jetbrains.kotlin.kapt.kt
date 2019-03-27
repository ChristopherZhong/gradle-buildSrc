@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec
    get() = `kotlin-kapt`(Kotlin.VERSION)

fun PluginDependenciesSpec.`kotlin-kapt`(version: String? = null): PluginDependencySpec =
    id("${Kotlin.GROUP}.kapt").applyVersion(version)
