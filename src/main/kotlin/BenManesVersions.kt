import com.github.`ben-manes`.versions.Versions
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.`gradle-versions-plugin`(
    version: String = Versions.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Versions.ID)
    return if (includeVersion) id version version else id
}
