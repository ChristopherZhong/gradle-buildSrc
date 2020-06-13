@file:Suppress("ObjectPropertyName", "FunctionName", "SpellCheckingInspection")

import Versions.ASSERTJ
import Versions.AWSSDK
import Versions.AWS_JAVA_SDK
import Versions.AWS_LAMBDA_CORE
import Versions.AWS_LAMBDA_EVENTS
import Versions.AWS_LAMBDA_LOG4J2
import Versions.BEN_MANES
import Versions.COMMONS_CSV
import Versions.COMMONS_NET
import Versions.DAGGER
import Versions.GRAPHIQL_SPRING_BOOT_STARTER
import Versions.GRAPHQL_JAVA
import Versions.GRAPHQL_JAVA_SPRING_BOOT_STARTER_WEBFLUX
import Versions.GRAPHQL_JAVA_TOOLS
import Versions.GRAPHQL_SPRING_BOOT_STARTER
import Versions.GUICE
import Versions.HTTPCORE
import Versions.JACKSON
import Versions.JAVAFX
import Versions.JAVAX_INJECT
import Versions.JMOCKIT
import Versions.JUNIT
import Versions.JUNIT5
import Versions.KODEIN_DI
import Versions.KOIN
import Versions.KOTLIN
import Versions.KOTLINX
import Versions.LOG4J
import Versions.LOG4J_KOTLIN
import Versions.LOMBOK
import Versions.MOCKITO
import Versions.MOCKK
import Versions.MOCK_FTP_SERVER
import Versions.OK_HTTP
import Versions.ORG_ECLIPSE_JDT_ANNOTATION
import Versions.PICOCLI
import Versions.RXJAVA
import Versions.SLF4J_API
import Versions.SPRING
import Versions.SPRING_BOOT
import Versions.STRIPE_JAVA
import Versions.TRUTH
import Versions.VALIDATION_API
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.`assertj-core`(version: String = ASSERTJ) = "org.assertj:assertj-core:$version"
fun DependencyHandler.`awssdk-bom`(version: String = AWSSDK) = "software.amazon.awssdk:bom:$version"
val DependencyHandler.`awssdk-dynamodb` get() = "software.amazon.awssdk:dynamodb"
fun DependencyHandler.`aws-java-sdk-bom`(version: String = AWS_JAVA_SDK) = "com.amazonaws:aws-java-sdk-bom:$version"
val DependencyHandler.`aws-java-sdk-dynamodb` get() = "com.amazonaws:aws-java-sdk-dynamodb"
val DependencyHandler.`aws-java-sdk-ecs` get() = "com.amazonaws:aws-java-sdk-ecs"
val DependencyHandler.`aws-java-sdk-s3` get() = "com.amazonaws:aws-java-sdk-s3"
fun DependencyHandler.`aws-lambda-java-core`(version: String = AWS_LAMBDA_CORE) = "com.amazonaws:aws-lambda-java-core:$version"
fun DependencyHandler.`aws-lambda-java-events`(version: String = AWS_LAMBDA_EVENTS) = "com.amazonaws:aws-lambda-java-events:$version"
fun DependencyHandler.`aws-lambda-java-log4j2`(version: String = AWS_LAMBDA_LOG4J2) = "com.amazonaws:aws-lambda-java-log4j2:$version"
fun DependencyHandler.`commons-csv`(version: String = COMMONS_CSV) = "org.apache.commons:commons-csv:$version"
fun DependencyHandler.`commons-net`(version: String = COMMONS_NET) = "commons-net:commons-net:$version"
fun DependencyHandler.dagger(version: String = DAGGER) = "com.google.dagger:dagger:$version"
fun DependencyHandler.`dagger-compiler`(version: String = DAGGER) = "com.google.dagger:dagger-compiler:$version"
fun DependencyHandler.`gradle-versions-plugin`(version: String = BEN_MANES) = "com.github.ben-manes.versions:gradle-versions-plugin:$version"
fun DependencyHandler.`graphiql-spring-boot-starter`(version: String = GRAPHIQL_SPRING_BOOT_STARTER) = "com.graphql-java:graphiql-spring-boot-starter:$version"
fun DependencyHandler.`graphql-java`(version: String = GRAPHQL_JAVA) = "com.graphql-java:graphql-java:$version"
fun DependencyHandler.`graphql-java-spring-boot-starter-webflux`(version: String = GRAPHQL_JAVA_SPRING_BOOT_STARTER_WEBFLUX) = "com.graphql-java:graphql-java-spring-boot-starter-webflux:$version"
fun DependencyHandler.`graphql-java-tools`(version: String = GRAPHQL_JAVA_TOOLS) = "com.graphql-java:graphql-java-tools:$version"
fun DependencyHandler.`graphql-spring-boot-starter`(version: String = GRAPHQL_SPRING_BOOT_STARTER) = "com.graphql-java:graphql-spring-boot-starter:$version"
val DependencyHandler.guice get() = "com.google.inject:guice"
val DependencyHandler.`guice-assistedinject` get() = "com.google.inject.extensions:guice-assistedinject"
fun DependencyHandler.`guice-bom`(version: String = GUICE) = "com.google.inject:guice-bom:$version"
fun DependencyHandler.httpcore(version: String = HTTPCORE) = "org.apache.httpcomponents:httpcore:$version"
fun DependencyHandler.`jackson-bom`(version: String = JACKSON) = "com.fasterxml.jackson:jackson-bom:$version"
val DependencyHandler.`jackson-dataformat-yaml` get() = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml"
val DependencyHandler.`jackson-module-kotlin` get() = "com.fasterxml.jackson.module:jackson-module-kotlin"
fun DependencyHandler.`javafx-base`(version: String = JAVAFX) = "org.openjfx:javafx-base:$version"
fun DependencyHandler.`javafx-controls`(version: String = JAVAFX) = "org.openjfx:javafx-controls:$version"
fun DependencyHandler.`javafx-fxml`(version: String = JAVAFX) = "org.openjfx:javafx-fxml:$version"
fun DependencyHandler.`javafx-graphics`(version: String = JAVAFX) = "org.openjfx:javafx-graphics:$version"
fun DependencyHandler.`javafx-media`(version: String = JAVAFX) = "org.openjfx:javafx-media:$version"
fun DependencyHandler.`javafx-swing`(version: String = JAVAFX) = "org.openjfx:javafx-swing:$version"
fun DependencyHandler.`javafx-web`(version: String = JAVAFX) = "org.openjfx:javafx-web:$version"
fun DependencyHandler.`javax-inject`(version: String = JAVAX_INJECT) = "javax.inject:javax.inject:$version"
fun DependencyHandler.jmockit(version: String = JMOCKIT) = "org.jmockit:jmockit:$version"
fun DependencyHandler.junit(version: String = JUNIT) = "junit:junit:$version"
fun DependencyHandler.`junit-bom`(version: String = JUNIT5) = "org.junit:junit-bom:$version"
val DependencyHandler.`junit-jupiter-api` get() = "org.junit.jupiter:junit-jupiter-api"
val DependencyHandler.`junit-jupiter-engine` get() = "org.junit.jupiter:junit-jupiter-engine"
val DependencyHandler.`junit-jupiter-params` get() = "org.junit.jupiter:junit-jupiter-params"
val DependencyHandler.`junit-vintage-engine` get() = "org.junit.vintage:junit-vintage-engine"
fun DependencyHandler.`kodein-erased-jvm`(version: String = KODEIN_DI) = "org.kodein.di:kodein-di-erased-jvm:$version"
fun DependencyHandler.`kodein-generic-jvm`(version: String = KODEIN_DI) = "org.kodein.di:kodein-di-generic-jvm:$version"
fun DependencyHandler.`koin-core`(version: String = KOIN) = "org.koin:koin-core:$version"
fun DependencyHandler.`koin-core-ext`(version: String = KOIN) = "org.koin:koin-core-ext:$version"
fun DependencyHandler.`koin-test`(version: String = KOIN) = "org.koin:koin-test:$version"
fun DependencyHandler.`kotlin-bom`(version: String = KOTLIN) = "org.jetbrains.kotlin:kotlin-bom:$version"
val DependencyHandler.`kotlin-reflect` get() = "org.jetbrains.kotlin:kotlin-reflect"
val DependencyHandler.`kotlin-stdlib` get() = "org.jetbrains.kotlin:kotlin-stdlib"
val DependencyHandler.`kotlin-stdlib-jdk8` get() = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
val DependencyHandler.`kotlin-test` get() = "org.jetbrains.kotlin:kotlin-test"
val DependencyHandler.`kotlin-test-junit5` get() = "org.jetbrains.kotlin:kotlin-test-junit5"
fun DependencyHandler.`kotlinx-coroutines-core`(version: String = KOTLINX) = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
fun DependencyHandler.`kotlinx-coroutines-core-common`(version: String = KOTLINX) = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$version"
fun DependencyHandler.`kotlinx-coroutines-javafx`(version: String = KOTLINX) = "org.jetbrains.kotlinx:kotlinx-coroutines-javafx:$version"
fun DependencyHandler.`kotlinx-coroutines-jdk8`(version: String = KOTLINX) = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$version"
val DependencyHandler.`log4j-1_2-api` get() = "org.apache.logging.log4j:log4j-1.2-api"
val DependencyHandler.`log4j-api` get() = "org.apache.logging.log4j:log4j-api"
fun DependencyHandler.`log4j-api-kotlin`(version: String = LOG4J_KOTLIN) = "org.apache.logging.log4j:log4j-api-kotlin:$version"
fun DependencyHandler.`log4j-bom`(version: String = LOG4J) = "org.apache.logging.log4j:log4j-bom:$version"
val DependencyHandler.`log4j-core` get() = "org.apache.logging.log4j:log4j-core"
val DependencyHandler.`log4j-jcl` get() = "org.apache.logging.log4j:log4j-jcl"
val DependencyHandler.`log4j-slf4j-impl` get() = "org.apache.logging.log4j:log4j-slf4j-impl"
fun DependencyHandler.lombok(version: String = LOMBOK) = "org.projectlombok:lombok:$version"
fun DependencyHandler.`mockito-core`(version: String = MOCKITO) = "org.mockito:mockito-core:$version"
fun DependencyHandler.`mockito-junit-jupiter`(version: String = MOCKITO) = "org.mockito:mockito-junit-jupiter:$version"
fun DependencyHandler.mockk(version: String = MOCKK) = "io.mockk:mockk:$version"
fun DependencyHandler.`mock-ftp-server`(version: String = MOCK_FTP_SERVER) = "org.mockftpserver:MockFtpServer:$version"
fun DependencyHandler.`ok-http`(version: String = OK_HTTP) = "com.squareup.okhttp3:okhttp:$version"
fun DependencyHandler.`org-eclipse-jdt-annotation`(version: String = ORG_ECLIPSE_JDT_ANNOTATION) = "org.eclipse.jdt:org.eclipse.jdt.annotation:$version"
fun DependencyHandler.picocli(version: String = PICOCLI) = "info.picocli:picocli:$version"
fun DependencyHandler.`picocli-spring-boot-starter`(version: String = PICOCLI) = "info.picocli:picocli-spring-boot-starter:$version"
fun DependencyHandler.rxjava(version: String = RXJAVA) = "io.reactivex.rxjava2:rxjava:$version"
fun DependencyHandler.`slf4j-api`(version: String = SLF4J_API) = "org.slf4j:slf4j-api:$version"
fun DependencyHandler.`spring-boot`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot:$version"
fun DependencyHandler.`spring-boot-actuator`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-actuator:$version"
fun DependencyHandler.`spring-boot-autoconfigure`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-autoconfigure:$version"
fun DependencyHandler.`spring-boot-configuration-processor`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-configuration-processor:$version"
fun DependencyHandler.`spring-boot-devtools`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-devtools:$version"
fun DependencyHandler.`spring-boot-starter`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter:$version"
fun DependencyHandler.`spring-boot-starter-activemq`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-activemq:$version"
fun DependencyHandler.`spring-boot-starter-actuator`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-actuator:$version"
fun DependencyHandler.`spring-boot-starter-aop`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-aop:$version"
fun DependencyHandler.`spring-boot-starter-data-jpa`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-data-jpa:$version"
fun DependencyHandler.`spring-boot-starter-data-mongodb`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-data-mongodb:$version"
fun DependencyHandler.`spring-boot-starter-data-rest`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-data-rest:$version"
fun DependencyHandler.`spring-boot-starter-json`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-json:$version"
fun DependencyHandler.`spring-boot-starter-log4j2`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-log4j2:$version"
fun DependencyHandler.`spring-boot-starter-logging`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-logging:$version"
fun DependencyHandler.`spring-boot-starter-mail`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-mail:$version"
fun DependencyHandler.`spring-boot-starter-parent`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-parent:$version"
fun DependencyHandler.`spring-boot-starter-security`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-security:$version"
fun DependencyHandler.`spring-boot-starter-test`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-test:$version"
fun DependencyHandler.`spring-boot-starter-web`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-web:$version"
fun DependencyHandler.`spring-boot-starter-webflux`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-webflux:$version"
fun DependencyHandler.`spring-boot-starter-websocket`(version: String = SPRING_BOOT) = "org.springframework.boot:spring-boot-starter-websocket:$version"
fun DependencyHandler.`spring-context`(version: String = SPRING) = "org.springframework:spring-context:$version"
fun DependencyHandler.`spring-web`(version: String = SPRING) = "org.springframework:spring-web:$version"
fun DependencyHandler.`stripe-java`(version: String = STRIPE_JAVA) = "com.stripe:stripe-java:$version"
fun DependencyHandler.truth(version: String = TRUTH) = "com.google.truth:truth:$version"
fun DependencyHandler.`truth-java8-extension`(version: String = TRUTH) = "com.google.truth.extensions:truth-java8-extension:$version"
fun DependencyHandler.`validation-api`(version: String = VALIDATION_API) = "javax.validation:validation-api:$version"
