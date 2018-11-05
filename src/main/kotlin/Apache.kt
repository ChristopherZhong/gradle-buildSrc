object Apache {
    const val group = "org.apache"

    object Commons {
        const val group = "${Apache.group}.commons"
        const val version = "1.5"
        const val csv = "commons-csv"
    }

    object HttpComponents {
        const val group = "${Apache.group}.httpcomponents"
        const val version = "4.4.10"
        const val httpcore = "httpcore"
    }
}

const val `commons-csv`: String = "${Apache.Commons.group}:${Apache.Commons.csv}:${Apache.Commons.version}"
const val httpcore: String = "${Apache.HttpComponents.group}:${Apache.HttpComponents.httpcore}:${Apache.HttpComponents.version}"
