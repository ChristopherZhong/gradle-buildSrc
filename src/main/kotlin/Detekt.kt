import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Detekt {
    const val GROUP = "io.gitlab.arturbosch.detekt"
    const val VERSION = "1.0.0-RC12"
}

val PluginDependenciesSpec.detekt: PluginDependencySpec
    get() = detekt(Detekt.VERSION)

fun PluginDependenciesSpec.detekt(version: String? = null): PluginDependencySpec =
    id(Detekt.GROUP).applyVersion(version)
