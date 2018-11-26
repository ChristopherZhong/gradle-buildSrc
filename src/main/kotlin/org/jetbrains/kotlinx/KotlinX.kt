package org.jetbrains.kotlinx

object KotlinX {
    const val GROUP = "org.jetbrains.kotlinx"
    const val VERSION = "1.0.1"
    // libraries below
    const val `COROUTINES-CORE` = "kotlinx-coroutines-core"
    const val `COROUTINES-CORE-COMMON` = "kotlinx-coroutines-core-common"
    const val `COROUTINES-JAVAFX` = "kotlinx-coroutines-javafx"
    const val `COROUTINES-JDK8` = "kotlinx-coroutines-jdk8"
}

const val `kotlinx-coroutines-core` = "${KotlinX.GROUP}:${KotlinX.`COROUTINES-CORE`}:${KotlinX.VERSION}"
const val `kotlinx-coroutines-core-common` = "${KotlinX.GROUP}:${KotlinX.`COROUTINES-CORE-COMMON`}:${KotlinX.VERSION}"
const val `kotlinx-coroutines-javafx` = "${KotlinX.GROUP}:${KotlinX.`COROUTINES-JAVAFX`}:${KotlinX.VERSION}"
const val `kotlinx-coroutines-jdk8` = "${KotlinX.GROUP}:${KotlinX.`COROUTINES-JDK8`}:${KotlinX.VERSION}"
