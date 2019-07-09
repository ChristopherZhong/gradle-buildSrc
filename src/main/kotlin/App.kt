@file:Suppress("unused")

import org.gradle.api.JavaVersion
import org.gradle.api.plugins.JavaPluginExtension

val JavaPluginExtension.JAVA_VERSION: JavaVersion
    get() = JavaVersion.VERSION_12

const val JVM_TARGET: String = "1.8"
