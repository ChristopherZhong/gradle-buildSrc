package com.google.inject.extensions

import Guice

object Extensions {
    const val GROUP = "${Guice.GROUP}.extensions"
    // libraries below
    const val ASSISTEDINJECT = "guice-assistedinject"
}

const val `guice-assistedinject`: String = "${Extensions.GROUP}:${Extensions.ASSISTEDINJECT}"
