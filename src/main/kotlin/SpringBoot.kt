import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object SpringBoot {
    const val GROUP = "org.springframework.boot"
    const val VERSION = "2.1.1.RELEASE"

    object Dependencies {
        const val NAME = "spring-boot"
        const val ACTUATOR = "$NAME-actuator"
        const val AUTOCONFIGURE = "$NAME-autoconfigure"
        const val CONFIGURATION_PROCESSOR = "$NAME-configuration-processor"
        const val DEVTOOLS = "$NAME-devtools"
    }
}

val PluginDependenciesSpec.`spring-boot`: PluginDependencySpec
    get() = `spring-boot`(SpringBoot.VERSION)

fun PluginDependenciesSpec.`spring-boot`(version: String? = null): PluginDependencySpec =
        id(SpringBoot.GROUP).apply {
            if (version != null) {
                return this version version
            }
        }

val DependencyHandler.`spring-boot`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependencies.NAME}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-actuator`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependencies.ACTUATOR}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-autoconfigure`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependencies.AUTOCONFIGURE}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-configuration-processor`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependencies.CONFIGURATION_PROCESSOR}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-devtools`: String
    get() = "${SpringBoot.GROUP}:${SpringBoot.Dependencies.DEVTOOLS}:${SpringBoot.VERSION}"

object SpringBootStarter {
    object Dependencies {
        const val NAME = "${SpringBoot.Dependencies.NAME}-starter"
        const val ACTIVEMQ = "$NAME-activemq"
        const val AOP = "$NAME-aop"
        const val ACTUATOR = "$NAME-actuator"
        const val JSON = "$NAME-json"
        const val LOG4J2 = "$NAME-log4j2"
        const val LOGGING = "$NAME-logging"
        const val MAIL = "$NAME-mail"
        const val PARENT = "$NAME-parent"
        const val SECURITY = "$NAME-security"
        const val TEST = "$NAME-test"
        const val WEB = "$NAME-web"
        const val WEBSOCKET = "$NAME-websocket"
    }
}

val DependencyHandler.`spring-boot-starter`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.NAME}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-activemq`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.ACTIVEMQ}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-aop`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.AOP}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-actuator`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.ACTUATOR}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-json`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.JSON}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-log4j2`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.LOG4J2}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-logging`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.LOGGING}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-mail`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.MAIL}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-parent`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.PARENT}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-security`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.SECURITY}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-test`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.TEST}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-web`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.WEB}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-websocket`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarter.Dependencies.WEBSOCKET}:${SpringBoot.VERSION}"

object SpringBootStarterData {
    object Dependencies {
        const val NAME = "${SpringBootStarter.Dependencies.NAME}-data"
        const val JPA = "$NAME-jpa"
        const val MONGODB = "$NAME-mongodb"
        const val REST = "$NAME-rest"
    }
}

val DependencyHandler.`spring-boot-starter-data-jpa`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarterData.Dependencies.JPA}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-data-mongodb`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarterData.Dependencies.MONGODB}:${SpringBoot.VERSION}"
val DependencyHandler.`spring-boot-starter-data-rest`: String
    get() = "${SpringBoot.GROUP}:${SpringBootStarterData.Dependencies.REST}:${SpringBoot.VERSION}"
