import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object BenManesVersions {
    const val GROUP = "com.github.ben-manes.versions"
    const val VERSION = "0.20.0"
    // libraries below
    const val NAME = "gradle-versions-plugin"
}

fun PluginDependenciesSpec.`gradle-versions-plugin`(
    version: String = BenManesVersions.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(BenManesVersions.GROUP)
    return if (includeVersion) id version version else id
}
