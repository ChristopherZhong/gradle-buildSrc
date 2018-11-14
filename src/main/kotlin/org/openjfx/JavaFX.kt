package org.openjfx

object JavaFX {
    const val GROUP = "org.openjfx"
    const val VERSION = "11.0.1"
    // libraries below
    const val BASE = "javafx-base"
    const val CONTROLS = "javafx-controls"
    const val GRAPHICS = "javafx-graphics"
}

const val `javafx-base` = "${JavaFX.GROUP}:${JavaFX.BASE}:${JavaFX.VERSION}"
const val `javafx-base-linux` = "${`javafx-base`}:linux"
const val `javafx-base-mac` = "${`javafx-base`}:mac"
const val `javafx-base-win` = "${`javafx-base`}:win"
const val `javafx-controls` = "${JavaFX.GROUP}:${JavaFX.CONTROLS}:${JavaFX.VERSION}"
const val `javafx-controls-linux` = "${`javafx-controls`}:linux"
const val `javafx-controls-mac` = "${`javafx-controls`}:mac"
const val `javafx-controls-win` = "${`javafx-controls`}:win"
const val `javafx-graphics` = "${JavaFX.GROUP}:${JavaFX.GRAPHICS}:${JavaFX.VERSION}"
const val `javafx-graphics-linux` = "${`javafx-graphics`}:linux"
const val `javafx-graphics-mac` = "${`javafx-graphics`}:mac"
const val `javafx-graphics-win` = "${`javafx-graphics`}:win"
