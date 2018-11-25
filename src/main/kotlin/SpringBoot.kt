import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.springframework.boot.SpringBoot

fun PluginDependenciesSpec.`spring-boot`(
    version: String = SpringBoot.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(SpringBoot.GROUP)
    return if (includeVersion) id version version else id
}
