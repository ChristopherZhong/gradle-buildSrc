plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "6.0"
}
