package org.projectlombok

object Lombok {
    const val GROUP = "org.projectlombok"
    const val VERSION = "1.18.4"
    // libraries below
    const val LOMBOK = "lombok"
}

const val lombok: String = "${Lombok.GROUP}:${Lombok.LOMBOK}:${Lombok.VERSION}"
