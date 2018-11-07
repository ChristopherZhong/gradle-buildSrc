package org.springframework.boot

object SpringBoot {
    const val group = "org.springframework.boot"
    const val version = "2.1.0.RELEASE"
    const val `configuration-processor` = "spring-boot-configuration-processor"
    const val log4j2 = "spring-boot-starter-log4j2"
    const val parent = "spring-boot-starter-parent"
    const val starter = "spring-boot-starter"
    const val test = "spring-boot-starter-test"
}

const val `spring-boot-configuration-processor`: String = "${SpringBoot.group}:${SpringBoot.`configuration-processor`}"
const val `spring-boot-starter`: String = "${SpringBoot.group}:${SpringBoot.starter}"
const val `spring-boot-starter-log4j2`: String = "${SpringBoot.group}:${SpringBoot.log4j2}"
const val `spring-boot-starter-parent`: String = "${SpringBoot.group}:${SpringBoot.parent}:${SpringBoot.version}"
const val `spring-boot-starter-test`: String = "${SpringBoot.group}:${SpringBoot.test}"
