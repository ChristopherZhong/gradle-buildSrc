package org.junit.vintage

import org.junit.JUnit

object Vintage {
    const val GROUP = "${JUnit.GROUP}.vintage"
    // libraries below
    const val ENGINE = "junit-vintage-engine"
}

const val `junit-vintage-engine`: String = "${Vintage.GROUP}:${Vintage.ENGINE}"
