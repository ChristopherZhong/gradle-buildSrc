import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object SpringDependencyManagement {
    const val ID = "io.spring.dependency-management"
    const val VERSION = "1.0.6.RELEASE"
}

val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec
    get() = `spring-dependency-management`(SpringDependencyManagement.VERSION)

fun PluginDependenciesSpec.`spring-dependency-management`(version: String? = null): PluginDependencySpec =
        id(SpringDependencyManagement.ID).apply {
            if (version != null) {
                return this version version
            }
        }
