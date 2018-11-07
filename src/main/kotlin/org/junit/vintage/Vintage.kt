package org.junit.vintage

import org.junit.JUnit

object Vintage {
    const val group = "${JUnit.group}.vintage"
    const val engine = "junit-vintage-engine"
}

const val `junit-vintage-engine`: String = "${Vintage.group}:${Vintage.engine}"
