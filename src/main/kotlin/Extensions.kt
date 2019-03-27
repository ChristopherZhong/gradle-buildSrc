import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependencySpec.applyVersion(version: String?): PluginDependencySpec =
    this.apply {
        if (version != null) {
            return this version version
        }
    }
