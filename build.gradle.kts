plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

gradlePlugin {
    plugins {
        register("project-info") {
            id = "project-info"
            implementationClass = "ProjectInfoPlugin"
        }
        register("gradle-typed-plugins-and-dependencies") {
            id = "gradle-typed-plugins-and-dependencies"
            implementationClass = "GradleTypedPluginsAndDependenciesPlugin"
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "5.6"
}
