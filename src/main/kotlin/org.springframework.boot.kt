@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import SpringBoot.BOOT
import SpringBootStarter.LOGGING
import SpringBootStarter.STARTER
import SpringBootStarterData.DATA
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object SpringBoot {
    const val GROUP = "${SpringFramework.GROUP}.boot"
    const val VERSION = "2.1.6.RELEASE"
    const val BOOT = "spring-boot"
}

val PluginDependenciesSpec.`spring-boot`: PluginDependencySpec
    get() = `spring-boot`(SpringBoot.VERSION)

fun PluginDependenciesSpec.`spring-boot`(version: String? = null): PluginDependencySpec =
    id(SpringBoot.GROUP).applyVersion(version)

val DependencyHandler.`spring-boot`: String
    get() = "${SpringBoot.GROUP}:$BOOT:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-actuator`: String
    get() = "${SpringBoot.GROUP}:$BOOT-actuator:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-autoconfigure`: String
    get() = "${SpringBoot.GROUP}:$BOOT-autoconfigure:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-configuration-processor`: String
    get() = "${SpringBoot.GROUP}:$BOOT-configuration-processor:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-devtools`: String
    get() = "${SpringBoot.GROUP}:$BOOT-devtools:${SpringBoot.VERSION}"

object SpringBootStarter {
    const val STARTER = "$BOOT-starter"
    const val LOGGING = "$STARTER-logging"
}

val DependencyHandler.`spring-boot-starter`: String
    get() = "${SpringBoot.GROUP}:$STARTER:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-activemq`: String
    get() = "${SpringBoot.GROUP}:$STARTER-activemq:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-aop`: String
    get() = "${SpringBoot.GROUP}:$STARTER-aop:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-actuator`: String
    get() = "${SpringBoot.GROUP}:$STARTER-actuator:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-json`: String
    get() = "${SpringBoot.GROUP}:$STARTER-json:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-log4j2`: String
    get() = "${SpringBoot.GROUP}:$STARTER-log4j2:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-logging`: String
    get() = "${SpringBoot.GROUP}:$LOGGING:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-mail`: String
    get() = "${SpringBoot.GROUP}:$STARTER-mail:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-parent`: String
    get() = "${SpringBoot.GROUP}:$STARTER-parent:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-security`: String
    get() = "${SpringBoot.GROUP}:$STARTER-security:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-test`: String
    get() = "${SpringBoot.GROUP}:$STARTER-test:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-web`: String
    get() = "${SpringBoot.GROUP}:$STARTER-web:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-webflux`: String
    get() = "${SpringBoot.GROUP}:$STARTER-webflux:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-websocket`: String
    get() = "${SpringBoot.GROUP}:$STARTER-websocket:${SpringBoot.VERSION}"

object SpringBootStarterData {
    const val DATA = "$STARTER-data"
}

val DependencyHandler.`spring-boot-starter-data-jpa`: String
    get() = "${SpringBoot.GROUP}:$DATA-jpa:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-data-mongodb`: String
    get() = "${SpringBoot.GROUP}:$DATA-mongodb:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-data-rest`: String
    get() = "${SpringBoot.GROUP}:$DATA-rest:${SpringBoot.VERSION}"
