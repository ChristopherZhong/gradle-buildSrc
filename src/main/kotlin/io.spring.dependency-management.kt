@file:Suppress("ObjectPropertyName", "unused", "FunctionName")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec
    get() = `spring-dependency-management`("1.0.6.RELEASE")

fun PluginDependenciesSpec.`spring-dependency-management`(version: String? = null): PluginDependencySpec =
        id("io.spring.dependency-management").applyVersion(version)
