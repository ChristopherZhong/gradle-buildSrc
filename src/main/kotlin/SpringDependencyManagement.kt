import io.spring.DependencyManagement
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.`spring-dependency-management`(
    version: String = DependencyManagement.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(DependencyManagement.ID)
    return if (includeVersion) id version version else id
}
