import org.gradle.kotlin.dsl.DependencyHandlerScope

object Koin {
    const val GROUP = "org.koin"
    const val VERSION = "1.0.2"

    internal object Dependencies {
        const val CORE = "koin-core"
        const val CORE_EXT = "koin-core-ext"
        const val JAVA = "koin-java"
        const val TEST = "koin-test"
    }
}

val DependencyHandlerScope.`koin-core`: String
    get() = "${Koin.GROUP}:${Koin.Dependencies.CORE}:${Koin.VERSION}"
val DependencyHandlerScope.`koin-core-ext`: String
    get() = "${Koin.GROUP}:${Koin.Dependencies.CORE_EXT}:${Koin.VERSION}"
val DependencyHandlerScope.`koin-java`: String
    get() = "${Koin.GROUP}:${Koin.Dependencies.JAVA}:${Koin.VERSION}"
val DependencyHandlerScope.`koin-test`: String
    get() = "${Koin.GROUP}:${Koin.Dependencies.TEST}:${Koin.VERSION}"
