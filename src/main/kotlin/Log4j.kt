object Log4j {
    const val group = "org.apache.logging.log4j"
    const val version = "2.11.1"
    const val `1_2-api` = "log4j-1.2-api"
    const val api = "log4j-api"
    const val bom = "log4j-bom"
    const val core = "log4j-core"
    const val jcl = "log4j-jcl"
    const val `slf4j-impl` = "log4j-slf4j-impl"
}

const val `log4j-1_2-api`: String = "${Log4j.group}:${Log4j.`1_2-api`}"
const val `log4j-api`: String = "${Log4j.group}:${Log4j.api}"
const val `log4j-bom`: String = "${Log4j.group}:${Log4j.bom}:${Log4j.version}"
const val `log4j-core`: String = "${Log4j.group}:${Log4j.core}"
const val `log4j-jcl`: String = "${Log4j.group}:${Log4j.jcl}"
const val `log4j-slf4j-impl`: String = "${Log4j.group}:${Log4j.`slf4j-impl`}"
