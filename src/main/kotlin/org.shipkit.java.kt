@file:Suppress("ObjectPropertyName", "FunctionName", "unused")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.`shipkit-java`: PluginDependencySpec
    get() = `shipkit-java`("2.2.5")

fun PluginDependenciesSpec.`shipkit-java`(version: String? = null): PluginDependencySpec =
    id("org.shipkit.java").applyVersion(version)
