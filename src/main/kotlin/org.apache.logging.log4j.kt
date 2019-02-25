import org.gradle.api.artifacts.dsl.DependencyHandler

object Log4j {
    const val GROUP = "${Apache.GROUP}.logging.log4j"
    const val VERSION = "2.11.2"

    internal object Dependency {
        const val `1_2_API` = "log4j-1.2-api"
        const val API = "log4j-api"
        const val BOM = "log4j-bom"
        const val CORE = "log4j-core"
        const val JCL = "log4j-jcl"
        const val SLF4J_IMPL = "log4j-slf4j-impl"
    }
}

val DependencyHandler.`log4j-1_2-api`: String
    get() = "${Log4j.GROUP}:${Log4j.Dependency.`1_2_API`}:${Log4j.VERSION}"
val DependencyHandler.`log4j-api`: String
    get() = "${Log4j.GROUP}:${Log4j.Dependency.API}:${Log4j.VERSION}"
val DependencyHandler.`log4j-bom`: String
    get() = "${Log4j.GROUP}:${Log4j.Dependency.BOM}:${Log4j.VERSION}"
val DependencyHandler.`log4j-core`: String
    get() = "${Log4j.GROUP}:${Log4j.Dependency.CORE}:${Log4j.VERSION}"
val DependencyHandler.`log4j-jcl`: String
    get() = "${Log4j.GROUP}:${Log4j.Dependency.JCL}:${Log4j.VERSION}"
val DependencyHandler.`log4j-slf4j-impl`: String
    get() = "${Log4j.GROUP}:${Log4j.Dependency.SLF4J_IMPL}:${Log4j.VERSION}"
