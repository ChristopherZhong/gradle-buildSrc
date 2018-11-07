package com.google.dagger

object Dagger {
    const val group = "com.google.dagger"
    const val version = "2.19"
    const val compiler = "dagger-compiler"
    const val dagger = "dagger"
}

const val dagger: String = "${Dagger.group}:${Dagger.dagger}:${Dagger.version}"
const val `dagger-compiler`: String = "${Dagger.group}:${Dagger.compiler}:${Dagger.version}"
