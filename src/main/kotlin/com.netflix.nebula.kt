@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Nebula {
    const val GROUP = "com.netflix.nebula"
    const val NEBULA = "nebula"
}

object NebulaKotlin {
    const val VERSION = "1.3.41"
}

val PluginDependenciesSpec.`nebula-kotlin`: PluginDependencySpec
    get() = `nebula-kotlin`(NebulaKotlin.VERSION)

fun PluginDependenciesSpec.`nebula-kotlin`(version: String? = null): PluginDependencySpec =
    id("${Nebula.NEBULA}.kotlin").applyVersion(version)

object NebulaPublishing {
    const val VERSION = "9.4.5"
}

val PluginDependenciesSpec.`nebula-maven-publish`: PluginDependencySpec
    get() = `nebula-maven-publish`(NebulaPublishing.VERSION)
val PluginDependenciesSpec.`nebula-javadoc-jar`: PluginDependencySpec
    get() = `nebula-javadoc-jar`(NebulaPublishing.VERSION)
val PluginDependenciesSpec.`nebula-source-jar`: PluginDependencySpec
    get() = `nebula-source-jar`(NebulaPublishing.VERSION)
val PluginDependenciesSpec.`nebula-publish-verification`: PluginDependencySpec
    get() = `nebula-publish-verification`(NebulaPublishing.VERSION)

fun PluginDependenciesSpec.`nebula-maven-publish`(version: String? = null): PluginDependencySpec =
    id("${Nebula.NEBULA}.maven-publish").applyVersion(version)

fun PluginDependenciesSpec.`nebula-javadoc-jar`(version: String? = null): PluginDependencySpec =
    id("${Nebula.NEBULA}.javadoc-jar").applyVersion(version)

fun PluginDependenciesSpec.`nebula-source-jar`(version: String? = null): PluginDependencySpec =
    id("${Nebula.NEBULA}.source-jar").applyVersion(version)

fun PluginDependenciesSpec.`nebula-publish-verification`(version: String? = null): PluginDependencySpec =
    id("${Nebula.NEBULA}.publish-verification").applyVersion(version)

object NebulaRelease {
    const val VERSION = "9.2.0"
}

val PluginDependenciesSpec.`nebula-release`: PluginDependencySpec
    get() = `nebula-release`(NebulaRelease.VERSION)

fun PluginDependenciesSpec.`nebula-release`(version: String? = null): PluginDependencySpec =
    id("${Nebula.NEBULA}.release").applyVersion(version)
