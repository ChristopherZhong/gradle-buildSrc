import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Bintray {
    const val GROUP = "com.jfrog.bintray"
    const val VERSION = "1.8.4"
}

val PluginDependenciesSpec.bintray: PluginDependencySpec
    get() = bintray(Bintray.VERSION)

fun PluginDependenciesSpec.bintray(version: String? = null): PluginDependencySpec =
    id(Bintray.GROUP).applyVersion(version)
