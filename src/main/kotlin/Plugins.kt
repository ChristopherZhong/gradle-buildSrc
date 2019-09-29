@file:Suppress("ObjectPropertyName", "FunctionName", "unused", "SpellCheckingInspection")

import Versions.BEN_MANES
import Versions.BINTRAY
import Versions.DETEKT
import Versions.DOKKA
import Versions.KOTLIN
import Versions.NEBULA_PUBLISH
import Versions.NEBULA_RELEASE
import Versions.SHIPKIT
import Versions.SPRING_BOOT
import Versions.SPRING_DEPENDENCY_MANAGEMENT
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.bintray: PluginDependencySpec get() = id("com.jfrog.bintray")
fun PluginDependenciesSpec.bintray(): PluginDependencySpec = bintray.version(BINTRAY)
val PluginDependenciesSpec.detekt: PluginDependencySpec get() = id("io.gitlab.arturbosch.detekt")
fun PluginDependenciesSpec.detekt(): PluginDependencySpec = detekt.version(DETEKT)
val PluginDependenciesSpec.dokka: PluginDependencySpec get() = id("org.jetbrains.dokka")
fun PluginDependenciesSpec.dokka(): PluginDependencySpec = dokka.version(DOKKA)
val PluginDependenciesSpec.`gradle-versions-plugin`: PluginDependencySpec get() = id("com.github.ben-manes.versions")
fun PluginDependenciesSpec.`gradle-versions-plugin`(): PluginDependencySpec = `gradle-versions-plugin`.version(BEN_MANES)
val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec get() = id("org.jetbrains.kotlin.jvm")
fun PluginDependenciesSpec.`kotlin-jvm`(): PluginDependencySpec = `kotlin-jvm`.version(KOTLIN)
val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec get() = id("org.jetbrains.kotlin.kapt")
fun PluginDependenciesSpec.`kotlin-kapt`(): PluginDependencySpec = `kotlin-kapt`.version(KOTLIN)
val PluginDependenciesSpec.`nebula-kotlin`: PluginDependencySpec get() = id("nebula.kotlin")
fun PluginDependenciesSpec.`nebula-kotlin`(): PluginDependencySpec = `nebula-kotlin`.version(KOTLIN)
val PluginDependenciesSpec.`nebula-javadoc-jar`: PluginDependencySpec get() = id("nebula.javadoc-jar")
fun PluginDependenciesSpec.`nebula-javadoc-jar`(): PluginDependencySpec = `nebula-javadoc-jar`.version(NEBULA_PUBLISH)
val PluginDependenciesSpec.`nebula-maven-publish`: PluginDependencySpec get() = id("nebula.maven-publish")
fun PluginDependenciesSpec.`nebula-maven-publish`(): PluginDependencySpec = `nebula-maven-publish`.version(NEBULA_PUBLISH)
val PluginDependenciesSpec.`nebula-publish-verification`: PluginDependencySpec get() = id("nebula.publish-verification")
fun PluginDependenciesSpec.`nebula-publish-verification`(): PluginDependencySpec = `nebula-publish-verification`.version(NEBULA_PUBLISH)
val PluginDependenciesSpec.`nebula-release`: PluginDependencySpec get() = id("nebula.release")
fun PluginDependenciesSpec.`nebula-release`(): PluginDependencySpec = `nebula-release`.version(NEBULA_RELEASE)
val PluginDependenciesSpec.`nebula-source-jar`: PluginDependencySpec get() = id("nebula.source-jar")
fun PluginDependenciesSpec.`nebula-source-jar`(): PluginDependencySpec = `nebula-source-jar`.version(NEBULA_PUBLISH)
val PluginDependenciesSpec.`shipkit-java`: PluginDependencySpec get() = id("org.shipkit.java")
fun PluginDependenciesSpec.`shipkit-java`(): PluginDependencySpec = `shipkit-java`.version(SHIPKIT)
val PluginDependenciesSpec.`spring-boot`: PluginDependencySpec get() = id("org.springframework.boot")
fun PluginDependenciesSpec.`spring-boot`(): PluginDependencySpec = `spring-boot`.version(SPRING_BOOT)
val PluginDependenciesSpec.`spring-dependency-management`: PluginDependencySpec get() = id("io.spring.dependency-management")
fun PluginDependenciesSpec.`spring-dependency-management`(): PluginDependencySpec = `spring-dependency-management`.version(SPRING_DEPENDENCY_MANAGEMENT)
