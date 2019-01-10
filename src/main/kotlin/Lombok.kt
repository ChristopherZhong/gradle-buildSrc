import org.gradle.api.artifacts.dsl.DependencyHandler

object Lombok {
    const val GROUP = "org.projectlombok"
    const val VERSION = "1.18.4"

    object Dependencies {
        const val LOMBOK = "lombok"
    }
}

val DependencyHandler.lombok: String
    get() = "${Lombok.GROUP}:${Lombok.Dependencies.LOMBOK}:${Lombok.VERSION}"
