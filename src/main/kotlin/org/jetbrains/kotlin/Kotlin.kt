package org.jetbrains.kotlin

object Kotlin {
    const val GROUP = "org.jetbrains.kotlin"
    const val VERSION = "1.3.11"
    const val ID = GROUP
    const val JVM = "$ID.jvm"
    const val KAPT = "$ID.kapt"
    // libraries below
    const val STDLIB = "kotlin-stdlib"
    const val `STDLIB-JDK8` = "$STDLIB-jdk8"
    const val TEST = "kotlin-test"
    const val `TEST-JUNIT5` = "$TEST-junit5"
}

const val `kotlin-stdlib` = "${Kotlin.GROUP}:${Kotlin.STDLIB}:${Kotlin.VERSION}"
const val `kotlin-stdlib-jdk8` = "${Kotlin.GROUP}:${Kotlin.`STDLIB-JDK8`}:${Kotlin.VERSION}"
const val `kotlin-test` = "${Kotlin.GROUP}:${Kotlin.TEST}:${Kotlin.VERSION}"
const val `kotlin-test-junit5` = "${Kotlin.GROUP}:${Kotlin.`TEST-JUNIT5`}:${Kotlin.VERSION}"
