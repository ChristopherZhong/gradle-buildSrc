package org.springframework.boot

import org.springframework.boot.SpringBoot.GROUP
import org.springframework.boot.SpringBoot.VERSION

object SpringBoot {
    const val GROUP = "org.springframework.boot"
    const val VERSION = "2.1.1.RELEASE"
    // libraries below
    const val NAME = "spring-boot"
    const val ACTUATOR = "$NAME-actuator"
    const val AUTOCONFIGURE = "$NAME-autoconfigure"
    const val `CONFIGURATION-PROCESSOR` = "$NAME-configuration-processor"
    const val DEVTOOLS = "$NAME-devtools"

    object Starter {
        // libraries below
        const val NAME = "${SpringBoot.NAME}-starter"
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

        object Data {
            // libraries below
            const val NAME = "${SpringBoot.Starter.NAME}-data"
            const val JPA = "$NAME-jpa"
            const val MONGODB = "$NAME-mongodb"
            const val REST = "$NAME-rest"
        }
    }
}

const val `spring-boot` = "$GROUP:${SpringBoot.NAME}"
const val `spring-boot-actuator` = "$GROUP:${SpringBoot.ACTUATOR}"
const val `spring-boot-autoconfigure` = "$GROUP:${SpringBoot.AUTOCONFIGURE}"
const val `spring-boot-configuration-processor` = "$GROUP:${SpringBoot.`CONFIGURATION-PROCESSOR`}"
const val `spring-boot-devtools` = "$GROUP:${SpringBoot.DEVTOOLS}"
const val `spring-boot-starter` = "$GROUP:${SpringBoot.Starter.NAME}"
const val `spring-boot-starter-activemq` = "$GROUP:${SpringBoot.Starter.ACTIVEMQ}"
const val `spring-boot-starter-aop` = "$GROUP:${SpringBoot.Starter.AOP}"
const val `spring-boot-starter-actuator` = "$GROUP:${SpringBoot.Starter.ACTUATOR}"
const val `spring-boot-starter-data-jpa` = "$GROUP:${SpringBoot.Starter.Data.JPA}"
const val `spring-boot-starter-data-mongodb` = "$GROUP:${SpringBoot.Starter.Data.MONGODB}"
const val `spring-boot-starter-data-rest` = "$GROUP:${SpringBoot.Starter.Data.REST}"
const val `spring-boot-starter-json` = "$GROUP:${SpringBoot.Starter.JSON}"
const val `spring-boot-starter-log4j2` = "$GROUP:${SpringBoot.Starter.LOG4J2}"
const val `spring-boot-starter-logging` = "$GROUP:${SpringBoot.Starter.LOGGING}"
const val `spring-boot-starter-mail` = "$GROUP:${SpringBoot.Starter.MAIL}"
const val `spring-boot-starter-parent` = "$GROUP:${SpringBoot.Starter.PARENT}:$VERSION"
const val `spring-boot-starter-security` = "$GROUP:${SpringBoot.Starter.SECURITY}"
const val `spring-boot-starter-test` = "$GROUP:${SpringBoot.Starter.TEST}"
const val `spring-boot-starter-web` = "$GROUP:${SpringBoot.Starter.WEB}"
const val `spring-boot-starter-websocket` = "$GROUP:${SpringBoot.Starter.WEBSOCKET}"
