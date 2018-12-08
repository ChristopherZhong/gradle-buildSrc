package org.koin

object Koin {
    const val GROUP = "org.koin"
    const val VERSION = "1.0.2"

    object Libraries {
        const val CORE = "koin-core"
        const val CORE_EXT = "koin-core-ext"
        const val JAVA = "koin-java"
        const val TEST = "koin-test"
    }
}

const val `koin-core` = "${Koin.GROUP}:${Koin.Libraries.CORE}:${Koin.VERSION}"
const val `koin-core-ext` = "${Koin.GROUP}:${Koin.Libraries.CORE_EXT}:${Koin.VERSION}"
const val `koin-java` = "${Koin.GROUP}:${Koin.Libraries.JAVA}:${Koin.VERSION}"
const val `koin-test` = "${Koin.GROUP}:${Koin.Libraries.TEST}:${Koin.VERSION}"
