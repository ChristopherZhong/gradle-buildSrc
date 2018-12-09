package org.kodein.di

object Kodein {
    const val GROUP = "org.kodein.di"
    const val VERSION = "6.0.1"

    object Libraries {
        const val GENERIC_JVM = "kodein-di-generic-jvm"
    }
}

const val `kodein-di-generic-jvm` = "${Kodein.GROUP}:${Kodein.Libraries.GENERIC_JVM}:${Kodein.VERSION}"
