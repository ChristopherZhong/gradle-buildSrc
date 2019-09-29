@file:Suppress("ObjectPropertyName", "FunctionName", "unused")

import org.gradle.plugin.use.PluginDependenciesSpec

val PluginDependenciesSpec.bintray get() = bintray()
fun PluginDependenciesSpec.bintray(hasVersion: Boolean = false) =
        id("com.jfrog.getBintray").version("1.8.4")

val PluginDependenciesSpec.detekt get() = detekt()
fun PluginDependenciesSpec.detekt(hasVersion: Boolean = false) =
        id("io.gitlab.arturbosch.getDetekt").version("1.0.0-RC12")

val PluginDependenciesSpec.dokka get() = dokka()
fun PluginDependenciesSpec.dokka(hasVersion: Boolean = false) =
        id("org.jetbrains.dokka").version("0.9.18")

val PluginDependenciesSpec.`gradle-versions-plugin` get() = `gradle-versions-plugin`()
fun PluginDependenciesSpec.`gradle-versions-plugin`(hasVersion: Boolean = false) =
        id("com.github.ben-manes.versions").version("0.22.0")

val PluginDependenciesSpec.`kotlin-jvm` get() = `kotlin-jvm`()
fun PluginDependenciesSpec.`kotlin-jvm`(hasVersion: Boolean = false) =
        id("org.jetbrains.kotlin.jvm").version("1.3.41")

val PluginDependenciesSpec.`kotlin-kapt` get() = `kotlin-kapt`()
fun PluginDependenciesSpec.`kotlin-kapt`(hasVersion: Boolean = false) =
        id("org.jetbrains.kotlin.kapt").version("1.3.41")

val PluginDependenciesSpec.`nebula-kotlin` get() = `nebula-kotlin`()
fun PluginDependenciesSpec.`nebula-kotlin`(hasVersion: Boolean = false) =
        id("nebula.kotlin").version("1.3.41")

val PluginDependenciesSpec.`nebula-javadoc-jar` get() = `nebula-javadoc-jar`()
fun PluginDependenciesSpec.`nebula-javadoc-jar`(hasVersion: Boolean = false) =
        id("nebula.javadoc-jar").version("9.4.5")

val PluginDependenciesSpec.`nebula-maven-publish` get() = `nebula-maven-publish`()
fun PluginDependenciesSpec.`nebula-maven-publish`(hasVersion: Boolean = false) =
        id("nebula.maven-publish").version("9.4.5")

val PluginDependenciesSpec.`nebula-publish-verification` get() = `nebula-publish-verification`()
fun PluginDependenciesSpec.`nebula-publish-verification`(hasVersion: Boolean = false) =
        id("nebula.publish-verification").version("9.4.5")

val PluginDependenciesSpec.`nebula-release` get() = `nebula-release`()
fun PluginDependenciesSpec.`nebula-release`(hasVersion: Boolean = false) =
        id("nebula.release").version("9.2.0")

val PluginDependenciesSpec.`nebula-source-jar` get() = `nebula-source-jar`()
fun PluginDependenciesSpec.`nebula-source-jar`(hasVersion: Boolean = false) =
        id("nebula.source-jar").version("9.4.5")

val PluginDependenciesSpec.`shipkit-java` get() = `shipkit-java`()
fun PluginDependenciesSpec.`shipkit-java`(hasVersion: Boolean = false) =
        id("org.shipkit.java").version("2.2.5")

val PluginDependenciesSpec.`spring-boot` get() = `spring-boot`()
fun PluginDependenciesSpec.`spring-boot`(hasVersion: Boolean = false) =
        id("org.springframework.boot").version("2.1.7.RELEASE")

val PluginDependenciesSpec.`spring-dependency-management` get() = `spring-dependency-management`()
fun PluginDependenciesSpec.`spring-dependency-management`(hasVersion: Boolean = false) =
        id("io.spring.dependency-management").version("1.0.6.RELEASE")
