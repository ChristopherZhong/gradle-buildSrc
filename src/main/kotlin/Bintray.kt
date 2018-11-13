import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.jfrog.bintray.Bintray

inline val PluginDependenciesSpec.bintray: PluginDependencySpec
    get() = id(Bintray.ID)
inline val PluginDependenciesSpec.`bintray-version`: PluginDependencySpec
    get() = bintray version Bintray.VERSION
