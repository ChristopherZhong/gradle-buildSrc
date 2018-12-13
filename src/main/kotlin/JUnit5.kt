object JUnit5 {
    const val GROUP = "org.junit"
    const val VERSION = "5.3.2"

    internal object Dependencies {
        const val BOM = "junit-bom"
    }
}

const val `junit-bom` = "${JUnit5.GROUP}:${JUnit5.Dependencies.BOM}:${JUnit5.VERSION}"

object JUnit5_Jupiter {
    const val GROUP = "${JUnit5.GROUP}.jupiter"

    internal object Dependencies {
        const val API = "junit-jupiter-api"
        const val ENGINE = "junit-jupiter-engine"
        const val PARAMS = "junit-jupiter-params"
    }
}

const val `junit-jupiter-api` = "${JUnit5_Jupiter.GROUP}:${JUnit5_Jupiter.Dependencies.API}:${JUnit5.VERSION}"
const val `junit-jupiter-engine` = "${JUnit5_Jupiter.GROUP}:${JUnit5_Jupiter.Dependencies.ENGINE}:${JUnit5.VERSION}"
const val `junit-jupiter-params` = "${JUnit5_Jupiter.GROUP}:${JUnit5_Jupiter.Dependencies.PARAMS}:${JUnit5.VERSION}"

object JUnit5_Vintage {
    const val GROUP = "${JUnit5.GROUP}.vintage"

    internal object Dependencies {
        const val ENGINE = "junit-vintage-engine"
    }
}

const val `junit-vintage-engine` = "${JUnit5_Vintage.GROUP}:${JUnit5_Vintage.Dependencies.ENGINE}:${JUnit5.VERSION}"
