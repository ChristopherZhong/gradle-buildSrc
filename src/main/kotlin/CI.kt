@file:Suppress("unused")

val isCI: Boolean = System.getenv("CI")?.isNotBlank() ?: false
val isNotCI: Boolean = !isCI
