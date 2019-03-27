@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object SpringBoot {
    const val GROUP = "org.springframework.boot"
    const val VERSION = "2.1.3.RELEASE"

    internal object Dependency {
        const val NAME = "spring-boot"
    }
}

val PluginDependenciesSpec.`spring-boot`: PluginDependencySpec
    get() = `spring-boot`(SpringBoot.VERSION)

fun PluginDependenciesSpec.`spring-boot`(version: String? = null): PluginDependencySpec =
    id(SpringBoot.GROUP).applyVersion(version)

val DependencyHandler.`spring-boot`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependency.NAME}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-actuator`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependency.NAME}-actuator:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-autoconfigure`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependency.NAME}-autoconfigure:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-configuration-processor`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependency.NAME}-configuration-processor:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-devtools`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependency.NAME}-devtools:${SpringBoot.VERSION}"

object SpringBootStarter {
    object Dependency {
        const val NAME = "${SpringBoot.Dependency.NAME}-starter"
        const val LOGGING = "${SpringBootStarter.Dependency.NAME}-logging"
    }
}

val DependencyHandler.`spring-boot-starter`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-activemq`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-activemq:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-aop`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-aop:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-actuator`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-actuator:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-json`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-json:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-log4j2`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-log4j2:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-logging`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.LOGGING}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-mail`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-mail:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-parent`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-parent:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-security`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-security:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-test`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-test:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-web`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-web:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-websocket`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependency.NAME}-websocket:${SpringBoot.VERSION}"

object SpringBootStarterData {
    internal object Dependency {
        const val NAME = "${SpringBootStarter.Dependency.NAME}-data"
    }
}

val DependencyHandler.`spring-boot-starter-data-jpa`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarterData.Dependency.NAME}-jpa:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-data-mongodb`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarterData.Dependency.NAME}-mongodb:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-data-rest`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarterData.Dependency.NAME}-rest:${SpringBoot.VERSION}"
