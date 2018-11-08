package org.springframework.boot

object SpringBoot {
    const val GROUP = "org.springframework.boot"
    const val VERSION = "2.1.0.RELEASE"
    const val `configuration-processor` = "spring-boot-configuration-processor"
    const val log4j2 = "spring-boot-starter-log4j2"
    const val logging = "spring-boot-starter-logging"
    const val parent = "spring-boot-starter-parent"
    const val starter = "spring-boot-starter"
    const val test = "spring-boot-starter-test"
}

const val `spring-boot-configuration-processor`: String = "${SpringBoot.GROUP}:${SpringBoot.`configuration-processor`}"
const val `spring-boot-starter`: String = "${SpringBoot.GROUP}:${SpringBoot.starter}"
const val `spring-boot-starter-log4j2`: String = "${SpringBoot.GROUP}:${SpringBoot.log4j2}"
const val `spring-boot-starter-logging`: String = "${SpringBoot.GROUP}"
const val `spring-boot-starter-parent`: String = "${SpringBoot.GROUP}:${SpringBoot.parent}:${SpringBoot.VERSION}"
const val `spring-boot-starter-test`: String = "${SpringBoot.GROUP}:${SpringBoot.test}"
