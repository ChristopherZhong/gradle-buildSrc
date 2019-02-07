import org.gradle.api.artifacts.dsl.DependencyHandler

object Commons {
    const val GROUP = "${Apache.GROUP}.commons"
    const val VERSION = "1.6"

    object Dependencies {
        const val CSV = "commons-csv"
    }
}

val DependencyHandler.`commons-csv`: String
    get() = "${Commons.GROUP}:${Commons.Dependencies.CSV}:${Commons.VERSION}"
