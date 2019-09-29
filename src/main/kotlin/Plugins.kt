@file:Suppress("ObjectPropertyName", "FunctionName", "unused")

import org.gradle.plugin.use.PluginDependenciesSpec

val PluginDependenciesSpec.bintray get() = id("com.jfrog.getBintray")
fun PluginDependenciesSpec.bintray(hasVersion: Boolean = false) = bintray.version("1.8.4")

val PluginDependenciesSpec.detekt get() = id("io.gitlab.arturbosch.getDetekt")
fun PluginDependenciesSpec.detekt(hasVersion: Boolean = false) = detekt.version("1.0.0-RC12")

val PluginDependenciesSpec.dokka get() = id("org.jetbrains.dokka")
fun PluginDependenciesSpec.dokka(hasVersion: Boolean = false) = dokka.version("0.9.18")

val PluginDependenciesSpec.`gradle-versions-plugin` get() = id("com.github.ben-manes.versions")
fun PluginDependenciesSpec.`gradle-versions-plugin`(hasVersion: Boolean = false) = `gradle-versions-plugin`.version("0.22.0")

val PluginDependenciesSpec.`kotlin-jvm` get() = id("org.jetbrains.kotlin.jvm")
fun PluginDependenciesSpec.`kotlin-jvm`(hasVersion: Boolean = false) = `kotlin-jvm`.version("1.3.41")

val PluginDependenciesSpec.`kotlin-kapt` get() = id("org.jetbrains.kotlin.kapt")
fun PluginDependenciesSpec.`kotlin-kapt`(hasVersion: Boolean = false) = `kotlin-kapt`.version("1.3.41")

val PluginDependenciesSpec.`nebula-kotlin` get() = id("nebula.kotlin")
fun PluginDependenciesSpec.`nebula-kotlin`(hasVersion: Boolean = false) = `nebula-kotlin`.version("1.3.41")

val PluginDependenciesSpec.`nebula-javadoc-jar` get() = id("nebula.javadoc-jar")
fun PluginDependenciesSpec.`nebula-javadoc-jar`(hasVersion: Boolean = false) = `nebula-javadoc-jar`.version("9.4.5")

val PluginDependenciesSpec.`nebula-maven-publish` get() = id("nebula.maven-publish")
fun PluginDependenciesSpec.`nebula-maven-publish`(hasVersion: Boolean = false) = `nebula-maven-publish`.version("9.4.5")

val PluginDependenciesSpec.`nebula-publish-verification` get() = id("nebula.publish-verification")
fun PluginDependenciesSpec.`nebula-publish-verification`(hasVersion: Boolean = false) = `nebula-publish-verification`.version("9.4.5")

val PluginDependenciesSpec.`nebula-release` get() = id("nebula.release")
fun PluginDependenciesSpec.`nebula-release`(hasVersion: Boolean = false) = `nebula-release`.version("9.2.0")

val PluginDependenciesSpec.`nebula-source-jar` get() = id("nebula.source-jar")
fun PluginDependenciesSpec.`nebula-source-jar`(hasVersion: Boolean = false) = `nebula-source-jar`.version("9.4.5")

val PluginDependenciesSpec.`shipkit-java` get() = id("org.shipkit.java")
fun PluginDependenciesSpec.`shipkit-java`(hasVersion: Boolean = false) = `shipkit-java`.version("2.2.5")

val PluginDependenciesSpec.`spring-boot` get() = id("org.springframework.boot")
fun PluginDependenciesSpec.`spring-boot`(hasVersion: Boolean = false) = `spring-boot`.version("2.1.7.RELEASE")

val PluginDependenciesSpec.`spring-dependency-management` get() = id("io.spring.dependency-management")
fun PluginDependenciesSpec.`spring-dependency-management`(hasVersion: Boolean = false) = `spring-dependency-management`.version("1.0.6.RELEASE")
