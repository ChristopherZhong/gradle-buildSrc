import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Shipkit {
    const val ID = "org.shipkit.java"
    const val VERSION = "2.1.3"
}

val PluginDependenciesSpec.`shipkit-java`: PluginDependencySpec
    get() = `shipkit-java`(Shipkit.VERSION)

fun PluginDependenciesSpec.`shipkit-java`(version: String? = null): PluginDependencySpec =
    id(Shipkit.ID).apply {
        if (version != null) {
            return this version version
        }
    }
