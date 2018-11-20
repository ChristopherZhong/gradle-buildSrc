package org.mockito

object Mockito {
    const val GROUP = "org.mockito"
    const val VERSION = "2.23.0"
    // libraries below
    const val CORE = "mockito-core"
    const val JUNIT_JUPITER = "mockito-junit-jupiter"
}

const val `mockito-core`: String = "${Mockito.GROUP}:${Mockito.CORE}:${Mockito.VERSION}"
const val `mockito-junit-jupiter` = "${Mockito.GROUP}:${Mockito.JUNIT_JUPITER}:${Mockito.VERSION}"
