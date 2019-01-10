import org.gradle.api.artifacts.dsl.DependencyHandler

object JavaFX {
    const val GROUP = "org.openjfx"
    const val VERSION = "11.0.1"

    internal object Dependencies {
        const val BASE = "javafx-base"
        const val CONTROLS = "javafx-controls"
        const val FXML = "javafx-fxml"
        const val GRAPHICS = "javafx-graphics"
        const val MEDIA = "javafx-media"
        const val SWING = "javafx-swing"
        const val WEB = "javafx-web"
    }
}

val DependencyHandler.`javafx-base`: String
    get() = "${JavaFX.GROUP}:${JavaFX.Dependencies.BASE}:${JavaFX.VERSION}"
val DependencyHandler.`javafx-base-linux`: String
    get() = "${`javafx-base`}:linux"
val DependencyHandler.`javafx-base-mac`: String
    get() = "${`javafx-base`}:mac"
val DependencyHandler.`javafx-base-win`: String
    get() = "${`javafx-base`}:win"
val DependencyHandler.`javafx-controls`: String
    get() = "${JavaFX.GROUP}:${JavaFX.Dependencies.CONTROLS}:${JavaFX.VERSION}"
val DependencyHandler.`javafx-controls-linux`: String
    get() = "${`javafx-controls`}:linux"
val DependencyHandler.`javafx-controls-mac`: String
    get() = "${`javafx-controls`}:mac"
val DependencyHandler.`javafx-controls-win`: String
    get() = "${`javafx-controls`}:win"
val DependencyHandler.`javafx-fxml`: String
    get() = "${JavaFX.GROUP}:${JavaFX.Dependencies.FXML}:${JavaFX.VERSION}"
val DependencyHandler.`javafx-fxml-linux`: String
    get() = "${`javafx-fxml`}:linux"
val DependencyHandler.`javafx-fxml-mac`: String
    get() = "${`javafx-fxml`}:mac"
val DependencyHandler.`javafx-fxml-win`: String
    get() = "${`javafx-fxml`}:win"
val DependencyHandler.`javafx-graphics`: String
    get() = "${JavaFX.GROUP}:${JavaFX.Dependencies.GRAPHICS}:${JavaFX.VERSION}"
val DependencyHandler.`javafx-graphics-linux`: String
    get() = "${`javafx-graphics`}:linux"
val DependencyHandler.`javafx-graphics-mac`: String
    get() = "${`javafx-graphics`}:mac"
val DependencyHandler.`javafx-graphics-win`: String
    get() = "${`javafx-graphics`}:win"
val DependencyHandler.`javafx-media`: String
    get() = "${JavaFX.GROUP}:${JavaFX.Dependencies.MEDIA}:${JavaFX.VERSION}"
val DependencyHandler.`javafx-media-linux`: String
    get() = "${`javafx-media`}:linux"
val DependencyHandler.`javafx-media-mac`: String
    get() = "${`javafx-media`}:mac"
val DependencyHandler.`javafx-media-win`: String
    get() = "${`javafx-media`}:win"
val DependencyHandler.`javafx-swing`: String
    get() = "${JavaFX.GROUP}:${JavaFX.Dependencies.SWING}:${JavaFX.VERSION}"
val DependencyHandler.`javafx-swing-linux`: String
    get() = "${`javafx-swing`}:linux"
val DependencyHandler.`javafx-swing-mac`: String
    get() = "${`javafx-swing`}:mac"
val DependencyHandler.`javafx-swing-win`: String
    get() = "${`javafx-swing`}:win"
val DependencyHandler.`javafx-web`: String
    get() = "${JavaFX.GROUP}:${JavaFX.Dependencies.WEB}:${JavaFX.VERSION}"
val DependencyHandler.`javafx-web-linux`: String
    get() = "${`javafx-web`}:linux"
val DependencyHandler.`javafx-web-mac`: String
    get() = "${`javafx-web`}:mac"
val DependencyHandler.`javafx-web-win`: String
    get() = "${`javafx-web`}:win"