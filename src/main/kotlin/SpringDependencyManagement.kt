import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object SpringDependencyManagement {
        const val id = "io.spring.dependency-management"
        const val version = "1.0.6.RELEASE"
}

inline val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec
    get() = id(SpringDependencyManagement.id) version SpringDependencyManagement.version
