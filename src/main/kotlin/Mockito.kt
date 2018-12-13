object Mockito {
    const val GROUP = "org.mockito"
    const val VERSION = "2.23.4"

    internal object Dependencies {
        const val CORE = "mockito-core"
        const val JUNIT_JUPITER = "mockito-junit-jupiter"
    }
}

const val `mockito-core` = "${Mockito.GROUP}:${Mockito.Dependencies.CORE}:${Mockito.VERSION}"
const val `mockito-junit-jupiter` = "${Mockito.GROUP}:${Mockito.Dependencies.JUNIT_JUPITER}:${Mockito.VERSION}"
