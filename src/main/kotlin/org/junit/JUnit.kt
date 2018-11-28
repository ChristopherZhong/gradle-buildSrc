package org.junit

object JUnit {
    const val GROUP = "org.junit"
    const val VERSION = "5.3.2"
    // libraries below
    const val BOM = "junit-bom"
}

const val `junit-bom`: String = "${JUnit.GROUP}:${JUnit.BOM}:${JUnit.VERSION}"
