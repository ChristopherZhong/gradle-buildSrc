import io.spring.DependencyManagement
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

inline val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec
    get() = id(DependencyManagement.ID)
