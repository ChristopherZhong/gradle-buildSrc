object Guice {
    const val group = "com.google.inject"
    const val version = "4.2.0"
    const val bom = "guice-bom"
    const val guice = "guice"

    object Extensions {
        const val group = "${Guice.group}.extensions"
        const val assistedinject = "guice-assistedinject"
    }
}

const val guice: String = "${Guice.group}:${Guice.guice}"
const val `guice-assistedinject`: String = "${Guice.Extensions.group}:${Guice.Extensions.assistedinject}"
const val `guice-bom`: String = "${Guice.group}:${Guice.bom}:${Guice.version}"
