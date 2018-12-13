object SLF4J {
    const val GROUP = "org.slf4j"
    const val VERSION = "1.7.25"

    internal object Dependencies {
        const val API = "slf4j-api"
    }
}

const val `slf4j-api` = "${SLF4J.GROUP}:${SLF4J.Dependencies.API}:${SLF4J.VERSION}"
