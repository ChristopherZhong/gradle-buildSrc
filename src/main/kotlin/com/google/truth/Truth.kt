package com.google.truth

object Truth {
    const val GROUP = "com.google.truth"
    const val VERSION = "0.42"
    // libraries below
    const val TRUTH = "truth"

    object Extensions {
        const val GROUP = "${Truth.GROUP}.extensions"
        // libraries below
        const val `JAVA8-EXTENSION` = "truth-java8-extension"
    }
}

const val truth = "${Truth.GROUP}:${Truth.TRUTH}:${Truth.VERSION}"
const val `truth-java8-extension` = "${Truth.Extensions.GROUP}:${Truth.Extensions.`JAVA8-EXTENSION`}"
