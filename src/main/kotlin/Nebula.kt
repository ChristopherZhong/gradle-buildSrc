import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object Nebula {
    const val GROUP = "com.netflix.nebula"
}

object NebulaKotlin {
    const val ID = "nebula.kotlin"
    const val VERSION = "1.3.21"
}

val PluginDependenciesSpec.`nebula-kotlin`: PluginDependencySpec
    get() = `nebula-kotlin`(NebulaKotlin.VERSION)

fun PluginDependenciesSpec.`nebula-kotlin`(version: String? = null): PluginDependencySpec =
        id(NebulaKotlin.ID).apply {
            if (version != null) {
                return this version version
            }
        }

object NebulaPublishing {
    const val VERSION = "9.4.5"

    const val MAVEN_BASE_PUBLISH = "nebula.maven-base-publish"
    const val MAVEN_DEPENDENCIES = "nebula.maven-dependencies"
    const val MAVEN_PUBLISH = "nebula.maven-publish"
    const val MAVEN_MANIFEST = "nebula.maven-manifest"
    const val MAVEN_RESOLVED_DEPENDENCIES = "nebula.maven-resolved-dependencies"
    const val MAVEN_SCM = "nebula.maven-scm"

    const val COMPILE_API = "nebula.compile-api"
    const val JAVADOC_JAR = "nebula.javadoc-jar"
    const val SOURCE_JAR = "nebula.source-jar"
    const val PUBLISH_VERIFICATION = "nebula.publish-verification"
}

val PluginDependenciesSpec.`nebula-maven-publish`: PluginDependencySpec
    get() = `nebula-maven-publish`(NebulaPublishing.VERSION)
val PluginDependenciesSpec.`nebula-javadoc-jar`: PluginDependencySpec
    get() = `nebula-javadoc-jar`(NebulaPublishing.VERSION)
val PluginDependenciesSpec.`nebula-source-jar`: PluginDependencySpec
    get() = `nebula-source-jar`(NebulaPublishing.VERSION)
val PluginDependenciesSpec.`nebula-publish-verification`: PluginDependencySpec
    get() = `nebula-publish-verification`(NebulaPublishing.VERSION)

fun PluginDependenciesSpec.`nebula-maven-publish`(version: String? = null): PluginDependencySpec =
        id(NebulaPublishing.MAVEN_PUBLISH).apply {
            if (version != null) {
                return this version version
            }
        }

fun PluginDependenciesSpec.`nebula-javadoc-jar`(version: String? = null): PluginDependencySpec =
        id(NebulaPublishing.JAVADOC_JAR).apply {
            if (version != null) {
                return this version version
            }
        }

fun PluginDependenciesSpec.`nebula-source-jar`(version: String? = null): PluginDependencySpec =
        id(NebulaPublishing.SOURCE_JAR).apply {
            if (version != null) {
                return this version version
            }
        }

fun PluginDependenciesSpec.`nebula-publish-verification`(version: String? = null): PluginDependencySpec =
        id(NebulaPublishing.PUBLISH_VERIFICATION).apply {
            if (version != null) {
                return this version version
            }
        }

object NebulaRelease {
    const val ID = "nebula.release"
    const val VERSION = "9.2.0"
}

val PluginDependenciesSpec.`nebula-release`: PluginDependencySpec
    get() = `nebula-release`(NebulaRelease.VERSION)

fun PluginDependenciesSpec.`nebula-release`(version: String? = null): PluginDependencySpec =
        id(NebulaRelease.ID).apply {
            if (version != null) {
                return this version version
            }
        }
