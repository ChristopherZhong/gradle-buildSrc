package org.springframework.boot

import org.springframework.boot.SpringBoot.GROUP
import org.springframework.boot.SpringBoot.VERSION

object SpringBoot {
    const val GROUP   = "org.springframework.boot"
    const val VERSION = "2.1.0.RELEASE"
    const val NAME    = "spring-boot"

    const val actuator                  = "$NAME-actuator"
    const val autoconfigure             = "$NAME-autoconfigure"
    const val `configuration-processor` = "$NAME-configuration-processor"
    const val devtools                  = "$NAME-devtools"

    object Starter {
        const val NAME = "${SpringBoot.NAME}-starter"

        const val activemq  = "$NAME-activemq"
        const val aop       = "$NAME-aop"
        const val actuator  = "$NAME-actuator"
        const val json      = "$NAME-json"
        const val log4j2    = "$NAME-log4j2"
        const val logging   = "$NAME-logging"
        const val mail      = "$NAME-mail"
        const val parent    = "$NAME-parent"
        const val security  = "$NAME-security"
        const val test      = "$NAME-test"
        const val web       = "$NAME-web"
        const val websocket = "$NAME-websocket"

        object Data {
            const val NAME = "${SpringBoot.Starter.NAME}-data"

            const val jpa     = "$NAME-jpa"
            const val mongodb = "$NAME-mongodb"
            const val rest    = "$NAME-rest"
        }
    }
}

const val `spring-boot`                         = "$GROUP:${SpringBoot.NAME}"
const val `spring-boot-actuator`                = "$GROUP:${SpringBoot.actuator}"
const val `spring-boot-autoconfigure`           = "$GROUP:${SpringBoot.autoconfigure}"
const val `spring-boot-configuration-processor` = "$GROUP:${SpringBoot.`configuration-processor`}"
const val `spring-boot-devtools`                = "$GROUP:${SpringBoot.devtools}"
const val `spring-boot-starter`                 = "$GROUP:${SpringBoot.Starter.NAME}"
const val `spring-boot-starter-activemq`        = "$GROUP:${SpringBoot.Starter.activemq}"
const val `spring-boot-starter-aop`             = "$GROUP:${SpringBoot.Starter.aop}"
const val `spring-boot-starter-actuator`        = "$GROUP:${SpringBoot.Starter.actuator}"
const val `spring-boot-starter-data-jpa`        = "$GROUP:${SpringBoot.Starter.Data.jpa}"
const val `spring-boot-starter-data-mongodb`    = "$GROUP:${SpringBoot.Starter.Data.mongodb}"
const val `spring-boot-starter-data-rest`       = "$GROUP:${SpringBoot.Starter.Data.rest}"
const val `spring-boot-starter-json`            = "$GROUP:${SpringBoot.Starter.json}"
const val `spring-boot-starter-log4j2`          = "$GROUP:${SpringBoot.Starter.log4j2}"
const val `spring-boot-starter-logging`         = "$GROUP:${SpringBoot.Starter.logging}"
const val `spring-boot-starter-mail`            = "$GROUP:${SpringBoot.Starter.mail}"
const val `spring-boot-starter-parent`          = "$GROUP:${SpringBoot.Starter.parent}:$VERSION"
const val `spring-boot-starter-security`        = "$GROUP:${SpringBoot.Starter.security}"
const val `spring-boot-starter-test`            = "$GROUP:${SpringBoot.Starter.test}"
const val `spring-boot-starter-web`             = "$GROUP:${SpringBoot.Starter.web}"
const val `spring-boot-starter-websocket`       = "$GROUP:${SpringBoot.Starter.websocket}"
