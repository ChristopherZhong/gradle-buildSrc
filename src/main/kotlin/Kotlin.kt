import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.jetbrains.kotlin.Kotlin

fun PluginDependenciesSpec.`kotlin-jvm`(
    version: String = Kotlin.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = kotlin("jvm")
    return if (includeVersion) id version version else id
}

fun PluginDependenciesSpec.`kotlin-kapt`(
    version: String = Kotlin.VERSION,
    includeVersion: Boolean = true
): PluginDependencySpec {
    val id = kotlin("kapt")
    return if (includeVersion) id version version else id
}
