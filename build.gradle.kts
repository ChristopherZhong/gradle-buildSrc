plugins {
    bintray() apply false
    detekt() apply false
    dokka() apply false
    `gradle-versions-plugin`()
    `kotlin-jvm`() apply false
    `kotlin-kapt`() apply false
    `nebula-kotlin`() apply false
    `nebula-javadoc-jar`() apply false
    `nebula-maven-publish`() apply false
    `nebula-publish-verification`() apply false
    `nebula-release`() apply false
    `nebula-source-jar`() apply false
    `shadow-jar`() apply false
    `shipkit-java`() apply false
    `spring-boot`() apply false
    `spring-dependency-management`() apply false
}

repositories {
    jcenter()
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = GRADLE_VERSION
}
