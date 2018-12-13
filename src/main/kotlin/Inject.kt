object Inject {
    const val GROUP = "javax.inject"
    const val VERSION = "1"

    internal object Dependencies {
        const val INJECT = "javax.inject"
    }
}

const val `javax_inject` = "${Inject.GROUP}:${Inject.Dependencies.INJECT}:${Inject.VERSION}"
