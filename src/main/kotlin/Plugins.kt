@file:Suppress("ObjectPropertyName", "FunctionName")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

internal fun PluginDependencySpec.applyIf(predicate: Boolean, version: String): PluginDependencySpec =
        if (predicate) version(version) else this

val PluginDependenciesSpec.bintray: PluginDependencySpec get() = bintray()
fun PluginDependenciesSpec.bintray(hasVersion: Boolean = false): PluginDependencySpec =
        id("com.jfrog.getBintray").applyIf(hasVersion, "1.8.4")

val PluginDependenciesSpec.detekt: PluginDependencySpec get() = detekt()
fun PluginDependenciesSpec.detekt(hasVersion: Boolean = false): PluginDependencySpec =
        id("io.gitlab.arturbosch.getDetekt").applyIf(hasVersion, "1.0.0-RC12")

val PluginDependenciesSpec.dokka: PluginDependencySpec get() = dokka()
fun PluginDependenciesSpec.dokka(hasVersion: Boolean = false): PluginDependencySpec =
        id("org.jetbrains.dokka").applyIf(hasVersion, "0.9.18")

val PluginDependenciesSpec.`gradle-versions-plugin`: PluginDependencySpec get() = `gradle-versions-plugin`()
fun PluginDependenciesSpec.`gradle-versions-plugin`(hasVersion: Boolean = false): PluginDependencySpec =
        id("com.github.ben-manes.versions").applyIf(hasVersion, "0.22.0")

val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec get() = `kotlin-jvm`()
fun PluginDependenciesSpec.`kotlin-jvm`(hasVersion: Boolean = false): PluginDependencySpec =
        id("org.jetbrains.kotlin.jvm").applyIf(hasVersion, "1.3.41")

val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec get() = `kotlin-kapt`()
fun PluginDependenciesSpec.`kotlin-kapt`(hasVersion: Boolean = false): PluginDependencySpec =
        id("org.jetbrains.kotlin.kapt").applyIf(hasVersion, "1.3.41")

val PluginDependenciesSpec.`nebula-kotlin`: PluginDependencySpec get() = `nebula-kotlin`()
fun PluginDependenciesSpec.`nebula-kotlin`(hasVersion: Boolean = false): PluginDependencySpec =
        id("nebula.kotlin").applyIf(hasVersion, "1.3.41")

val PluginDependenciesSpec.`nebula-javadoc-jar`: PluginDependencySpec get() = `nebula-javadoc-jar`()
fun PluginDependenciesSpec.`nebula-javadoc-jar`(hasVersion: Boolean = false): PluginDependencySpec =
        id("nebula.javadoc-jar").applyIf(hasVersion, "9.4.5")

val PluginDependenciesSpec.`nebula-maven-publish`: PluginDependencySpec get() = `nebula-maven-publish`()
fun PluginDependenciesSpec.`nebula-maven-publish`(hasVersion: Boolean = false): PluginDependencySpec =
        id("nebula.maven-publish").applyIf(hasVersion, "9.4.5")

val PluginDependenciesSpec.`nebula-publish-verification`: PluginDependencySpec get() = `nebula-publish-verification`()
fun PluginDependenciesSpec.`nebula-publish-verification`(hasVersion: Boolean = false): PluginDependencySpec =
        id("nebula.publish-verification").applyIf(hasVersion, "9.4.5")

val PluginDependenciesSpec.`nebula-release`: PluginDependencySpec get() = `nebula-release`()
fun PluginDependenciesSpec.`nebula-release`(hasVersion: Boolean = false): PluginDependencySpec =
        id("nebula.release").applyIf(hasVersion, "9.2.0")

val PluginDependenciesSpec.`nebula-source-jar`: PluginDependencySpec get() = `nebula-source-jar`()
fun PluginDependenciesSpec.`nebula-source-jar`(hasVersion: Boolean = false): PluginDependencySpec =
        id("nebula.source-jar").applyIf(hasVersion, "9.4.5")

val PluginDependenciesSpec.`shipkit-java`: PluginDependencySpec get() = `shipkit-java`()
fun PluginDependenciesSpec.`shipkit-java`(hasVersion: Boolean = false): PluginDependencySpec =
        id("org.shipkit.java").applyIf(hasVersion, "2.2.5")

val PluginDependenciesSpec.`spring-boot`: PluginDependencySpec get() = `spring-boot`()
fun PluginDependenciesSpec.`spring-boot`(hasVersion: Boolean = false): PluginDependencySpec =
        id("org.springframework.boot").applyIf(hasVersion, "2.1.7.RELEASE")

val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec get() = `spring-dependency-management`()
fun PluginDependenciesSpec.`spring-dependency-management`(hasVersion: Boolean = false): PluginDependencySpec =
        id("io.spring.dependency-management").applyIf(hasVersion, "1.0.6.RELEASE")
