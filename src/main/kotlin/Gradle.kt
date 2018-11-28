import org.gradle.api.Project
import org.gradle.api.artifacts.*
import org.gradle.kotlin.dsl.TaskContainerScope

object Gradle {
    const val VERSION = "5.0"
}

fun TaskContainerScope.projectInfo() = register("projectInfo") {
    doLast {
        project.info()
    }
}

private fun Set<Project>.info(level: Int = 1) {
    if (isEmpty()) return
    println("* Projects: $size".prependIndent(" ".repeat((level - 1) * 2)))
    forEach { project -> project.info(level + 1) }
}

private fun Project.info(level: Int = 1) {
    println("- Project: $name ($displayName), group=$group, version=$version".prependIndent(" ".repeat((level - 1) * 2)))
    configurations.info(level + 1)
    subprojects.info(level + 1)
}

private fun ConfigurationContainer.info(level: Int = 1) {
    if (isEmpty()) return
    println("* Configurations: $size".prependIndent(" ".repeat((level - 1) * 2)))
    forEach { configuration -> configuration.info(level + 1) }
}

private fun Configuration.info(level: Int = 1) {
    if (dependencies.isEmpty() && artifacts.isEmpty()) return
    println("- Configuration: $name".prependIndent(" ".repeat((level - 1) * 2)))
    dependencies.info(level + 1)
    artifacts.info(level + 1)
}


private fun DependencySet.info(level: Int = 1) {
    if (isEmpty()) return
    println("* Dependencies: $size".prependIndent(" ".repeat((level - 1) * 2)))
    forEach { dependency -> dependency.info(level + 1) }
}

private fun Dependency.info(level: Int = 1) {
    println("- Dependency: group=$group, name=$name, version=$version".prependIndent(" ".repeat((level - 1) * 2)))
}

private fun PublishArtifactSet.info(level: Int = 1) {
    if (isEmpty()) return
    println("* Artifacts: $size".prependIndent(" ".repeat((level - 1) * 2)))
    forEach { artifact -> artifact.info(level + 1) }
}

private fun PublishArtifact.info(level: Int = 1) {
    println("- Artifact: name=$name, classifier=$classifier, extension=$extension, type=$type, file=$file, date=$date".prependIndent(" ".repeat((level - 1) * 2)))
}
