import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.dokka: PluginDependencySpec
    get() = dokka("0.9.18")

fun PluginDependenciesSpec.dokka(version: String? = null): PluginDependencySpec =
    id("org.jetbrains.dokka").applyVersion(version)
