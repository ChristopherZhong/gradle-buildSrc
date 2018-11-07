package org.junit.jupiter

import org.junit.JUnit

object Jupiter {
    const val group = "${JUnit.group}.jupiter"
    const val api = "junit-jupiter-api"
    const val engine = "junit-jupiter-engine"
    const val params = "junit-jupiter-params"
}

const val `junit-jupiter-api`: String = "${Jupiter.group}:${Jupiter.api}"
const val `junit-jupiter-engine`: String = "${Jupiter.group}:${Jupiter.engine}"
const val `junit-jupiter-params`: String = "${Jupiter.group}:${Jupiter.params}"
