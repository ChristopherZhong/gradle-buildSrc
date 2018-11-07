package com.fasterxml.jackson.dataformat

import com.fasterxml.jackson.Jackson

object DataFormat {
    const val group = "${Jackson.group}.dataformat"
    const val yaml = "jackson-dataformat-yaml"
}

const val `jackson-dataformat-yaml`: String = "${DataFormat.group}:${DataFormat.yaml}"
