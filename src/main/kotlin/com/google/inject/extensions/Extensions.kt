package com.google.inject.extensions

import com.google.inject.Guice

object Extensions {
    const val GROUP = "${Guice.GROUP}.extensions"
    // libraries below
    const val ASSISTEDINJECT = "guice-assistedinject"
}

const val `guice-assistedinject`: String = "${Extensions.GROUP}:${Extensions.ASSISTEDINJECT}"
