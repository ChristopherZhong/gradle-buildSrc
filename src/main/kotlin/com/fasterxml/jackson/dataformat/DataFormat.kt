package com.fasterxml.jackson.dataformat

import com.fasterxml.jackson.Jackson

object DataFormat {
    const val GROUP = "${Jackson.GROUP}.dataformat"
    // libraries below
    const val YAML = "jackson-dataformat-yaml"
}

const val `jackson-dataformat-yaml`: String = "${DataFormat.GROUP}:${DataFormat.YAML}"
