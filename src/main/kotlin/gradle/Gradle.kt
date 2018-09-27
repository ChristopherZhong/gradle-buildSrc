package drisk

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

const val gradle = "4.10.2"

inline fun DependencyHandler.`assertj-core`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.AssertJ.core)
inline fun DependencyHandler.`guice`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Guice.core)
inline fun DependencyHandler.`guice-assistedinject`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Guice.Extensions.`assisted-inject`)
inline fun DependencyHandler.`guice-bom`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Guice.bom)
inline fun DependencyHandler.`junit-api`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Junit.Jupiter.api)
inline fun DependencyHandler.`junit-bom`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Junit.bom)
inline fun DependencyHandler.`junit-engine`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Junit.Jupiter.engine)
inline fun DependencyHandler.`junit-params`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Junit.Jupiter.params)
inline fun DependencyHandler.`junit-vintage`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.Junit.Vintage.engine)
inline fun DependencyHandler.`spring-boot-bom`(handler: (_: Any) -> Dependency?): Dependency? = handler(Dependencies.SpringBoot.bom)

object Plugins {
    object Bintray {
        const val id = "com.jfrog.bintray"
        const val version = "1.8.4"

        fun use(spec: PluginDependenciesSpec) = spec.id(id)
        fun add(spec: PluginDependenciesSpec) = use(spec) version version
    }

    object Kotlin {
        const val id = "org.jetbrains.kotlin"
        const val version = "1.2.71"
        const val jvm = "$id.jvm:$version"
    }

    object Spring {
        object DependencyManagement {
            const val id = "io.spring.dependency-management"
            const val version = "1.0.6.RELEASE"

            fun use(spec: PluginDependenciesSpec) = spec.id(id)
            fun add(spec: PluginDependenciesSpec) = use(spec) version version
        }
    }
}

object Dependencies {
    object AssertJ {
        const val id = "org.assertj"
        const val version = "3.11.1"
        const val core = "$id:assertj-core:$version"
    }

    object Guice {
        const val id = "com.google.inject"
        const val version = "4.2.0"
        const val bom = "$id:guice-bom:$version"
        const val core = "$id:guice"

        object Extensions {
            const val id = "${Guice.id}.extensions"
            const val `assisted-inject` = "$id:guice-assistedinject"
        }
    }

    object Junit {
        const val id = "org.junit"
        const val version = "5.3.1"
        const val bom = "$id:junit-bom:$version"

        object Jupiter {
            const val id = "${Junit.id}.jupiter"
            const val api = "$id:junit-jupiter-api"
            const val engine = "$id:junit-jupiter-engine"
            const val params = "$id:junit-jupiter-params"
        }

        object Vintage {
            const val id = "${Junit.id}.vintage"
            const val engine = "$id:junit-vintage-engine"
        }
    }

    object Lombok {
        const val id = "org.projectlombok"
        const val version = "1.18.2"
        const val lombok = "$id:lombok:$version"
    }

    object SpringBoot {
        const val id = "org.springframework.boot"
        const val version = "2.0.5.RELEASE"
        const val bom = "$id:spring-boot-starter-parent:$version"
    }
}
