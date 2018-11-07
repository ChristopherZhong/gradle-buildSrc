package com.google.inject

object Guice {
    const val group = "com.google.inject"
    const val version = "4.2.2"
    const val bom = "guice-bom"
    const val guice = "guice"
}

const val guice: String = "${Guice.group}:${Guice.guice}"
const val `guice-bom`: String = "${Guice.group}:${Guice.bom}:${Guice.version}"
