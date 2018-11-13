package com.google.dagger

object Dagger {
    const val GROUP = "com.google.dagger"
    const val VERSION = "2.19"
    // libraries below
    const val COMPILER = "dagger-compiler"
    const val DAGGER = "dagger"
}

const val dagger: String = "${Dagger.GROUP}:${Dagger.DAGGER}:${Dagger.VERSION}"
const val `dagger-compiler`: String = "${Dagger.GROUP}:${Dagger.COMPILER}:${Dagger.VERSION}"
