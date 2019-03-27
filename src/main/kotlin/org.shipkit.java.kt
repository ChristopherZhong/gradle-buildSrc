@file:Suppress("ObjectPropertyName", "FunctionName")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.`shipkit-java`: PluginDependencySpec
    get() = `shipkit-java`("2.1.3")

fun PluginDependenciesSpec.`shipkit-java`(version: String? = null): PluginDependencySpec =
    id("org.shipkit.java").applyVersion(version)
