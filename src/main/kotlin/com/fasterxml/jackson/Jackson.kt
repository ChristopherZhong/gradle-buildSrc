package com.fasterxml.jackson

object Jackson {
    const val group = "com.fasterxml.jackson"
    const val version = "2.9.7"
    const val bom = "jackson-bom"
}

const val `jackson-bom`: String = "${Jackson.group}:${Jackson.bom}:${Jackson.version}"
