object JUnit {
    const val group = "org.junit"
    const val version = "5.3.1"
    const val bom = "junit-bom"

    object Jupiter {
        const val group = "${JUnit.group}.jupiter"
        const val api = "junit-jupiter-api"
        const val engine = "junit-jupiter-engine"
        const val params = "junit-jupiter-params"
    }

    object Vintage {
        const val group = "${JUnit.group}.vintage"
        const val engine = "junit-vintage-engine"
    }
}

const val `junit-bom`: String = "${JUnit.group}:${JUnit.bom}:${JUnit.version}"
const val `junit-jupiter-api`: String = "${JUnit.Jupiter.group}:${JUnit.Jupiter.api}"
const val `junit-jupiter-engine`: String = "${JUnit.Jupiter.group}:${JUnit.Jupiter.engine}"
const val `junit-jupiter-params`: String = "${JUnit.Jupiter.group}:${JUnit.Jupiter.params}"
const val `junit-vintage-engine`: String = "${JUnit.Vintage.group}:${JUnit.Vintage.engine}"
