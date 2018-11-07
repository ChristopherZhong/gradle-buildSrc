package org.junit

object JUnit {
    const val group = "org.junit"
    const val version = "5.3.1"
    const val bom = "junit-bom"
}

const val `junit-bom`: String = "${JUnit.group}:${JUnit.bom}:${JUnit.version}"
