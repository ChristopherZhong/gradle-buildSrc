@file:Suppress("ObjectPropertyName", "FunctionName", "SpellCheckingInspection")

import Versions.BEN_MANES
import Versions.BINTRAY
import Versions.DETEKT
import Versions.DOKKA
import Versions.KOTLIN
import Versions.NEBULA_PUBLISH
import Versions.NEBULA_RELEASE
import Versions.SHADOW_JAR
import Versions.SHIPKIT
import Versions.SPRING_BOOT
import Versions.SPRING_DEPENDENCY_MANAGEMENT
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.bintray: PluginDependencySpec get() = id("com.jfrog.bintray")
fun PluginDependenciesSpec.bintray(version: String = BINTRAY): PluginDependencySpec = bintray.version(version)
val PluginDependenciesSpec.detekt: PluginDependencySpec get() = id("io.gitlab.arturbosch.detekt")
fun PluginDependenciesSpec.detekt(version: String = DETEKT): PluginDependencySpec = detekt.version(version)
val PluginDependenciesSpec.dokka: PluginDependencySpec get() = id("org.jetbrains.dokka")
fun PluginDependenciesSpec.dokka(version: String = DOKKA): PluginDependencySpec = dokka.version(version)
val PluginDependenciesSpec.`gradle-versions-plugin`: PluginDependencySpec get() = id("com.github.ben-manes.versions")
fun PluginDependenciesSpec.`gradle-versions-plugin`(version: String = BEN_MANES): PluginDependencySpec = `gradle-versions-plugin`.version(version)
val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec get() = id("org.jetbrains.kotlin.jvm")
fun PluginDependenciesSpec.`kotlin-jvm`(version: String = KOTLIN): PluginDependencySpec = `kotlin-jvm`.version(version)
val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec get() = id("org.jetbrains.kotlin.kapt")
fun PluginDependenciesSpec.`kotlin-kapt`(version: String = KOTLIN): PluginDependencySpec = `kotlin-kapt`.version(version)
val PluginDependenciesSpec.`nebula-kotlin`: PluginDependencySpec get() = id("nebula.kotlin")
fun PluginDependenciesSpec.`nebula-kotlin`(version: String = KOTLIN): PluginDependencySpec = `nebula-kotlin`.version(version)
val PluginDependenciesSpec.`nebula-javadoc-jar`: PluginDependencySpec get() = id("nebula.javadoc-jar")
fun PluginDependenciesSpec.`nebula-javadoc-jar`(version: String = NEBULA_PUBLISH): PluginDependencySpec = `nebula-javadoc-jar`.version(version)
val PluginDependenciesSpec.`nebula-maven-publish`: PluginDependencySpec get() = id("nebula.maven-publish")
fun PluginDependenciesSpec.`nebula-maven-publish`(version: String = NEBULA_PUBLISH): PluginDependencySpec = `nebula-maven-publish`.version(version)
val PluginDependenciesSpec.`nebula-publish-verification`: PluginDependencySpec get() = id("nebula.publish-verification")
fun PluginDependenciesSpec.`nebula-publish-verification`(version: String = NEBULA_PUBLISH): PluginDependencySpec = `nebula-publish-verification`.version(version)
val PluginDependenciesSpec.`nebula-release`: PluginDependencySpec get() = id("nebula.release")
fun PluginDependenciesSpec.`nebula-release`(version: String = NEBULA_RELEASE): PluginDependencySpec = `nebula-release`.version(version)
val PluginDependenciesSpec.`nebula-source-jar`: PluginDependencySpec get() = id("nebula.source-jar")
fun PluginDependenciesSpec.`nebula-source-jar`(version: String = NEBULA_PUBLISH): PluginDependencySpec = `nebula-source-jar`.version(version)
val PluginDependenciesSpec.`shadow-jar`: PluginDependencySpec get() = id("com.github.johnrengelman.shadow")
fun PluginDependenciesSpec.`shadow-jar`(version: String = SHADOW_JAR): PluginDependencySpec = `shadow-jar`.version(version)
val PluginDependenciesSpec.`shipkit-java`: PluginDependencySpec get() = id("org.shipkit.java")
fun PluginDependenciesSpec.`shipkit-java`(version: String = SHIPKIT): PluginDependencySpec = `shipkit-java`.version(version)
val PluginDependenciesSpec.`spring-boot`: PluginDependencySpec get() = id("org.springframework.boot")
fun PluginDependenciesSpec.`spring-boot`(version: String = SPRING_BOOT): PluginDependencySpec = `spring-boot`.version(version)
val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec get() = id("io.spring.dependency-management")
fun PluginDependenciesSpec.`spring-dependency-management`(version: String = SPRING_DEPENDENCY_MANAGEMENT): PluginDependencySpec = `spring-dependency-management`.version(version)
