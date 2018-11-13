package com.google.inject

object Guice {
    const val GROUP = "com.google.inject"
    const val VERSION = "4.2.2"
    // libraries below
    const val BOM = "guice-bom"
    const val GUICE = "guice"
}

const val guice: String = "${Guice.GROUP}:${Guice.GUICE}"
const val `guice-bom`: String = "${Guice.GROUP}:${Guice.BOM}:${Guice.VERSION}"
