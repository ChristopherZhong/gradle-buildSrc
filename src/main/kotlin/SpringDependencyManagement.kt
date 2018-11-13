import io.spring.DependencyManagement
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

inline val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec
    get() = id(DependencyManagement.ID)
inline val PluginDependenciesSpec.`spring-dependency-management-version`: PluginDependencySpec
    get() = `spring-dependency-management` version DependencyManagement.VERSION
