package org.jetbrains.kotlin

object Kotlin {
    const val GROUP = "org.jetbrains.kotlin"
    const val VERSION = "1.3.11"
    const val ID = GROUP
    const val JVM = "$ID.jvm"
    const val KAPT = "$ID.kapt"

    object Libraries {
        const val REFLECT = "kotlin-reflect"
        const val STDLIB = "kotlin-stdlib"
        const val STDLIB_JDK8 = "$STDLIB-jdk8"
        const val TEST = "kotlin-test"
        const val TEST_JUNIT5 = "$TEST-junit5"
    }
}

const val `kotlin-reflect` = "${Kotlin.GROUP}:${Kotlin.Libraries.REFLECT}:${Kotlin.VERSION}"
const val `kotlin-stdlib` = "${Kotlin.GROUP}:${Kotlin.Libraries.STDLIB}:${Kotlin.VERSION}"
const val `kotlin-stdlib-jdk8` = "${Kotlin.GROUP}:${Kotlin.Libraries.STDLIB_JDK8}:${Kotlin.VERSION}"
const val `kotlin-test` = "${Kotlin.GROUP}:${Kotlin.Libraries.TEST}:${Kotlin.VERSION}"
const val `kotlin-test-junit5` = "${Kotlin.GROUP}:${Kotlin.Libraries.TEST_JUNIT5}:${Kotlin.VERSION}"
