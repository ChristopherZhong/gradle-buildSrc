object Lombok {
    const val GROUP = "org.projectlombok"
    const val VERSION = "1.18.4"

    object Dependencies {
        const val LOMBOK = "lombok"
    }
}

const val lombok: String = "${Lombok.GROUP}:${Lombok.Dependencies.LOMBOK}:${Lombok.VERSION}"
