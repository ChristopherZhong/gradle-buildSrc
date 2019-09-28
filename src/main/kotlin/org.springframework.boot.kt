@file:Suppress("unused", "ObjectPropertyName", "FunctionName")

import SpringBoot.BOOT
import SpringBootStarter.LOGGING
import SpringBootStarter.STARTER
import SpringBootStarterData.DATA
import org.gradle.api.artifacts.dsl.DependencyHandler

object SpringBoot {
    const val BOOT = "spring-boot"
}

val DependencyHandler.`spring-boot`: String
    get() = "org.springframework.boot:$BOOT:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-actuator`: String
    get() = "org.springframework.boot:$BOOT-actuator:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-autoconfigure`: String
    get() = "org.springframework.boot:$BOOT-autoconfigure:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-configuration-processor`: String
    get() = "org.springframework.boot:$BOOT-configuration-processor:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-devtools`: String
    get() = "org.springframework.boot:$BOOT-devtools:2.1.7.RELEASE"

object SpringBootStarter {
    const val STARTER = "$BOOT-starter"
    const val LOGGING = "$STARTER-logging"
}

val DependencyHandler.`spring-boot-starter`: String
    get() = "org.springframework.boot:$STARTER:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-activemq`: String
    get() = "org.springframework.boot:$STARTER-activemq:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-aop`: String
    get() = "org.springframework.boot:$STARTER-aop:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-actuator`: String
    get() = "org.springframework.boot:$STARTER-actuator:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-json`: String
    get() = "org.springframework.boot:$STARTER-json:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-log4j2`: String
    get() = "org.springframework.boot:$STARTER-log4j2:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-logging`: String
    get() = "org.springframework.boot:$LOGGING:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-mail`: String
    get() = "org.springframework.boot:$STARTER-mail:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-parent`: String
    get() = "org.springframework.boot:$STARTER-parent:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-security`: String
    get() = "org.springframework.boot:$STARTER-security:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-test`: String
    get() = "org.springframework.boot:$STARTER-test:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-web`: String
    get() = "org.springframework.boot:$STARTER-web:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-webflux`: String
    get() = "org.springframework.boot:$STARTER-webflux:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-websocket`: String
    get() = "org.springframework.boot:$STARTER-websocket:2.1.7.RELEASE"

object SpringBootStarterData {
    const val DATA = "$STARTER-data"
}

val DependencyHandler.`spring-boot-starter-data-jpa`: String
    get() = "org.springframework.boot:$DATA-jpa:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-data-mongodb`: String
    get() = "org.springframework.boot:$DATA-mongodb:2.1.7.RELEASE"
val DependencyHandler.`spring-boot-starter-data-rest`: String
    get() = "org.springframework.boot:$DATA-rest:2.1.7.RELEASE"
