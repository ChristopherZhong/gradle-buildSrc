plugins {
    bintray() apply false
    detekt() apply false
    dokka() apply false
    `gradle-versions-plugin`()
    `kotlin-jvm`() apply true
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
    mavenCentral()
}

dependencies {
    implementation(platform(`awssdk-bom`()))
    implementation(platform(`aws-java-sdk-bom`()))
    implementation(platform(`guice-bom`()))
    implementation(platform(`jackson-bom`()))
    implementation(platform(`junit-bom`()))
    implementation(platform(`kotlin-bom`()))
    implementation(platform(`log4j-bom`()))

    implementation(`assertj-core`())
    implementation(`awssdk-dynamodb`)
    implementation(`aws-java-sdk-dynamodb`)
    implementation(`aws-java-sdk-ecs`)
    implementation(`aws-java-sdk-s3`)
    implementation(`aws-lambda-java-core`())
    implementation(`aws-lambda-java-events`())
    implementation(`aws-lambda-java-log4j2`())
    implementation(`commons-csv`())
    implementation(`commons-net`())
    implementation(dagger())
    implementation(`dagger-compiler`())
    implementation(`graphiql-spring-boot-starter`())
    implementation(`graphql-java`())
    implementation(`graphql-java-spring-boot-starter-webflux`())
    implementation(`graphql-java-tools`())
    implementation(`graphql-spring-boot-starter`())
    implementation(guice)
    implementation(`guice-assistedinject`)
    implementation(httpcore())
    implementation(`jackson-dataformat-yaml`)
    implementation(`jackson-module-kotlin`)
    implementation(`javafx-base`())
    implementation(`javafx-controls`())
    implementation(`javafx-fxml`())
    implementation(`javafx-graphics`())
    implementation(`javafx-media`())
    implementation(`javafx-swing`())
    implementation(`javafx-web`())
    implementation(`javax-inject`())
    implementation(jmockit())
    implementation(junit())
    implementation(`junit-jupiter-api`)
    implementation(`junit-jupiter-engine`)
    implementation(`junit-jupiter-params`)
    implementation(`junit-vintage-engine`)
    implementation(`kodein-erased-jvm`())
    implementation(`kodein-generic-jvm`())
    implementation(`koin-core`())
    implementation(`koin-core-ext`())
    implementation(`koin-test`())
    implementation(`kotlin-reflect`)
    implementation(`kotlin-stdlib`)
    implementation(`kotlin-stdlib-jdk8`)
    implementation(`kotlin-test`)
    implementation(`kotlin-test-junit5`)
    implementation(`kotlinx-coroutines-core`())
    implementation(`kotlinx-coroutines-core-common`())
    implementation(`kotlinx-coroutines-javafx`())
    implementation(`kotlinx-coroutines-jdk8`())
    implementation(`log4j-1_2-api`)
    implementation(`log4j-api`)
    implementation(`log4j-api-kotlin`())
    implementation(`log4j-core`)
    implementation(`log4j-jcl`)
    implementation(`log4j-slf4j-impl`)
    implementation(lombok())
    implementation(`mockito-core`())
    implementation(`mockito-junit-jupiter`())
    implementation(mockk())
    implementation(`mock-ftp-server`())
    implementation(`ok-http`())
    implementation(`org-eclipse-jdt-annotation`())
    implementation(picocli())
    implementation(`picocli-spring-boot-starter`())
    implementation(rxjava())
    implementation(`slf4j-api`())
    implementation(`spring-boot`())
    implementation(`spring-boot-actuator`())
    implementation(`spring-boot-autoconfigure`())
    implementation(`spring-boot-configuration-processor`())
    implementation(`spring-boot-devtools`())
    implementation(`spring-boot-starter`())
    implementation(`spring-boot-starter-activemq`())
    implementation(`spring-boot-starter-actuator`())
    implementation(`spring-boot-starter-aop`())
    implementation(`spring-boot-starter-data-jpa`())
    implementation(`spring-boot-starter-data-mongodb`())
    implementation(`spring-boot-starter-data-rest`())
    implementation(`spring-boot-starter-json`())
    implementation(`spring-boot-starter-log4j2`())
    implementation(`spring-boot-starter-logging`())
    implementation(`spring-boot-starter-mail`())
    implementation(`spring-boot-starter-parent`())
    implementation(`spring-boot-starter-security`())
    implementation(`spring-boot-starter-test`())
    implementation(`spring-boot-starter-web`())
    implementation(`spring-boot-starter-webflux`())
    implementation(`spring-boot-starter-websocket`())
    implementation(`spring-context`())
    implementation(`spring-web`())
    implementation(`stripe-java`())
    implementation(truth())
    implementation(`truth-java8-extension`())
    implementation(`validation-api`())
}

tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
    fun isNonStable(version: String): Boolean {
        val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
        val regex = "^[0-9,.v-]+(-r)?$".toRegex()
        val isStable = stableKeyword || regex.matches(version)
        return isStable.not()
    }
    rejectVersionIf { isNonStable(candidate.version) }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = GRADLE_VERSION
}
