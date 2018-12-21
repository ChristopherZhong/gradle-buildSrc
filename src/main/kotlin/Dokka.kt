import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Dokka {
    const val GROUP = "org.jetbrains.dokka"
    const val VERSION = "0.9.17"
}

val PluginDependenciesSpec.dokka: PluginDependencySpec
    get() = dokka()

fun PluginDependenciesSpec.dokka(
    version: String = Dokka.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Dokka.GROUP)
    return if (includeVersion) id version version else id
}
