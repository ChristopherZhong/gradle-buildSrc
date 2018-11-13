package org.junit.jupiter

import org.junit.JUnit

object Jupiter {
    const val GROUP = "${JUnit.GROUP}.jupiter"
    // libraries below
    const val API = "junit-jupiter-api"
    const val ENGINE = "junit-jupiter-engine"
    const val PARAMS = "junit-jupiter-params"
}

const val `junit-jupiter-api`: String = "${Jupiter.GROUP}:${Jupiter.API}"
const val `junit-jupiter-engine`: String = "${Jupiter.GROUP}:${Jupiter.ENGINE}"
const val `junit-jupiter-params`: String = "${Jupiter.GROUP}:${Jupiter.PARAMS}"
