import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Dokka {
    const val GROUP = "org.jetbrains.dokka"
    const val VERSION = "0.9.17"
}

val PluginDependenciesSpec.dokka: PluginDependencySpec
    get() = dokka(Dokka.VERSION)

fun PluginDependenciesSpec.dokka(version: String? = null): PluginDependencySpec =
    id(Dokka.GROUP).applyVersion(version)
