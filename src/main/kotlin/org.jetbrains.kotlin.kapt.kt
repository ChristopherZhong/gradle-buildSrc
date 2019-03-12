@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object KotlinKapt {
    const val GROUP = "${Kotlin.GROUP}.kapt"
}

val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec
    get() = `kotlin-kapt`(Kotlin.VERSION)

fun PluginDependenciesSpec.`kotlin-kapt`(version: String? = null): PluginDependencySpec =
        id(KotlinKapt.GROUP).apply {
            if (version != null) {
                this version version
            }
        }
