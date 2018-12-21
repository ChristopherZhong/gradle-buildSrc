import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Detekt {
    const val GROUP = "io.gitlab.arturbosch.detekt"
    const val VERSION = "1.0.0-RC12"
}

val PluginDependenciesSpec.detekt: PluginDependencySpec
    get() = detekt()

fun PluginDependenciesSpec.detekt(
    version: String = Detekt.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = id(Detekt.GROUP)
    return if (includeVersion) id version version else id
}
