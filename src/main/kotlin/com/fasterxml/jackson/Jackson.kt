package com.fasterxml.jackson

object Jackson {
    const val GROUP = "com.fasterxml.jackson"
    const val VERSION = "2.9.7"
    // libraries below
    const val BOM = "jackson-bom"
}

const val `jackson-bom`: String = "${Jackson.GROUP}:${Jackson.BOM}:${Jackson.VERSION}"
