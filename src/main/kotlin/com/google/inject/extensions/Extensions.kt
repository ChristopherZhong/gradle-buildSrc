package com.google.inject.extensions

import com.google.inject.Guice

object Extensions {
    const val group = "${Guice.group}.extensions"
    const val assistedinject = "guice-assistedinject"
}

const val `guice-assistedinject`: String = "${Extensions.group}:${Extensions.assistedinject}"
