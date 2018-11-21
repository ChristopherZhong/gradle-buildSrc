import com.github.`ben-manes`.versions.Versions
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

inline val PluginDependenciesSpec.`gradle-versions-plugin`: PluginDependencySpec
    get() = id(Versions.ID) version Versions.VERSION
