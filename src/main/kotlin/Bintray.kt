import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Bintray {
    const val id = "com.jfrog.bintray"
    const val version = "1.8.4"
}

inline val PluginDependenciesSpec.bintray: PluginDependencySpec
    get() = id(Bintray.id) version Bintray.version
