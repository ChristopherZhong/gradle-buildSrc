import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Bintray {
    const val GROUP = "com.jfrog.bintray"
    const val VERSION = "1.8.4"
}

fun PluginDependenciesSpec.bintray(
    version: String = Bintray.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Bintray.GROUP)
    return if (includeVersion) id version version else id
}
