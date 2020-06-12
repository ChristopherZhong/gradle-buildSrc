plugins {
    `gradle-versions-plugin`()
}

repositories {
    jcenter()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = GRADLE_VERSION
}
