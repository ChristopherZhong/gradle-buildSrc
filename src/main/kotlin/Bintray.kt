import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.jfrog.bintray.Bintray

fun PluginDependenciesSpec.bintray(
    version: String = Bintray.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Bintray.ID)
    return if (includeVersion) id version version else id
}
