import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.jetbrains.dokka.Dokka

fun PluginDependenciesSpec.dokka(
    version: String = Dokka.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Dokka.ID)
    return if (includeVersion) id version version else id
}
