@file:Suppress("unused", "ObjectPropertyName")

object Truth {
    const val GROUP = "com.google.truth"
    const val VERSION = "0.42"

    object Extensions {
        const val GROUP = "${Truth.GROUP}.extensions"
    }
}

const val truth = "${Truth.GROUP}:truth:${Truth.VERSION}"
