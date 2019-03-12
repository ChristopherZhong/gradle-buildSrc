@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object BenManesVersions {
    const val GROUP = "com.github.ben-manes.versions"
    const val VERSION = "0.20.0"
}

val PluginDependenciesSpec.`gradle-versions-plugin`: PluginDependencySpec
    get() = `gradle-versions-plugin`()

fun PluginDependenciesSpec.`gradle-versions-plugin`(
        version: String = BenManesVersions.VERSION,
        includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(BenManesVersions.GROUP)
    return if (includeVersion) id version version else id
}

val DependencyHandler.`gradle-versions-plugin`: String
    get() = "${BenManesVersions.GROUP}:gradle-versions-plugin:${BenManesVersions.VERSION}"
