import Versions.JAVA
import org.gradle.api.plugins.JavaPluginExtension

val JavaPluginExtension.JAVA_VERSION get() = JAVA
const val JVM_TARGET: String = "1.8"
