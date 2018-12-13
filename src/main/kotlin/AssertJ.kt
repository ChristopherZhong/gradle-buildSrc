object AssertJ {
    const val GROUP = "org.assertj"
    const val VERSION = "3.11.1"

    internal object Dependencies {
        const val CORE = "assertj-core"
    }
}

const val `assertj-core` = "${AssertJ.GROUP}:${AssertJ.Dependencies.CORE}:${AssertJ.VERSION}"
