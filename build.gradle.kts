plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

gradlePlugin {
    plugins {
        register("gradle-typed-plugins-and-dependencies") {
            id = "gradle-typed-plugins-and-dependencies"
            implementationClass = "GradleTypedPluginsAndDependenciesPlugin"
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "5.1.1"
}
