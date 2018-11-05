object Jackson {
    const val group = "com.fasterxml.jackson"
    const val version = "2.9.7"
    const val bom = "jackson-bom"

    object Core {
        const val group = "${Jackson.group}.core"
    }

    object DataFormat {
        const val group = "${Jackson.group}.dataformat"
        const val yaml = "jackson-dataformat-yaml"
    }
}

const val `jackson-bom`: String = "${Jackson.group}:${Jackson.bom}:${Jackson.version}"
const val `jackson-dataformat-yaml`: String = "${Jackson.DataFormat.group}:${Jackson.DataFormat.yaml}"
