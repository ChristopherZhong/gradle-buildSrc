import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.springframework.boot.SpringBoot

inline val PluginDependenciesSpec.`spring-boot`: PluginDependencySpec
    get() = id(SpringBoot.GROUP) version SpringBoot.VERSION
