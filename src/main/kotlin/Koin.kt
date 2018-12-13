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

const val `koin-core` = "${Koin.GROUP}:${Koin.Dependencies.CORE}:${Koin.VERSION}"
const val `koin-core-ext` = "${Koin.GROUP}:${Koin.Dependencies.CORE_EXT}:${Koin.VERSION}"
const val `koin-java` = "${Koin.GROUP}:${Koin.Dependencies.JAVA}:${Koin.VERSION}"
const val `koin-test` = "${Koin.GROUP}:${Koin.Dependencies.TEST}:${Koin.VERSION}"
