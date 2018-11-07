package org.apache.httpcomponents

import org.apache.Apache

object HttpComponents {
    const val group = "${Apache.group}.httpcomponents"
    const val version = "4.4.10"
    const val httpcore = "httpcore"
}

const val httpcore: String = "${HttpComponents.group}:${HttpComponents.httpcore}:${HttpComponents.version}"
