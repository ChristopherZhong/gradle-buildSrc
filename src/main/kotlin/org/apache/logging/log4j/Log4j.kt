package org.apache.logging.log4j

import org.apache.Apache

object Log4j {
    const val GROUP = "${Apache.GROUP}.logging.log4j"
    const val VERSION = "2.11.1"
    // libraries below
    const val `1_2-API` = "log4j-1.2-api"
    const val API = "log4j-api"
    const val BOM = "log4j-bom"
    const val CORE = "log4j-core"
    const val JCL = "log4j-jcl"
    const val `SLF4J-IMPL` = "log4j-slf4j-impl"
}

const val `log4j-1_2-api`: String = "${Log4j.GROUP}:${Log4j.`1_2-API`}"
const val `log4j-api`: String = "${Log4j.GROUP}:${Log4j.API}"
const val `log4j-bom`: String = "${Log4j.GROUP}:${Log4j.BOM}:${Log4j.VERSION}"
const val `log4j-core`: String = "${Log4j.GROUP}:${Log4j.CORE}"
const val `log4j-jcl`: String = "${Log4j.GROUP}:${Log4j.JCL}"
const val `log4j-slf4j-impl`: String = "${Log4j.GROUP}:${Log4j.`SLF4J-IMPL`}"
