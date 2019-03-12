@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Commons {
    const val GROUP = "${Apache.GROUP}.commons"

    object Dependency {
        const val CSV = "commons-csv"
        const val CSV_VERSION = "1.6"
        const val NET = "commons-net"
        const val NET_VERSION = "3.6"
    }
}

val DependencyHandler.`commons-csv`: String
    get() = "${Commons.GROUP}:${Commons.Dependency.CSV}:${Commons.Dependency.CSV_VERSION}"
val DependencyHandler.`commons-net`: String
    get() = "${Commons.Dependency.NET}:${Commons.Dependency.NET}:${Commons.Dependency.NET_VERSION}"
