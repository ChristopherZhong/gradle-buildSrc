package org.apache.httpcomponents

import Apache

object HttpComponents {
    const val GROUP = "${Apache.GROUP}.httpcomponents"
    const val VERSION = "4.4.10"
    // libraries below
    const val HTTPCORE = "httpcore"
}

const val httpcore: String = "${HttpComponents.GROUP}:${HttpComponents.HTTPCORE}:${HttpComponents.VERSION}"
