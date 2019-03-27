@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object BenManesVersions {
    const val GROUP = "com.github.ben-manes.versions"
    const val VERSION = "0.21.0"
}

val PluginDependenciesSpec.`gradle-versions-plugin`: PluginDependencySpec
    get() = `gradle-versions-plugin`(BenManesVersions.VERSION)

fun PluginDependenciesSpec.`gradle-versions-plugin`(version: String? = null): PluginDependencySpec =
    id(BenManesVersions.GROUP).applyVersion(version)

val DependencyHandler.`gradle-versions-plugin`: String
    get() = "${BenManesVersions.GROUP}:gradle-versions-plugin:${BenManesVersions.VERSION}"
