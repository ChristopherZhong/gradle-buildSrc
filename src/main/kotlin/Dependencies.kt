@file:Suppress("ObjectPropertyName", "FunctionName", "unused", "SpellCheckingInspection")

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
import Versions.KODEIN_DI_GENEREIC_JVM
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

val DependencyHandler.`assertj-core` get() = "org.assertj:assertj-core"
fun DependencyHandler.`assertj-core`(version: String = ASSERTJ) = "$`assertj-core`:$version"
val DependencyHandler.`awssdk-bom` get() = "software.amazon.awssdk:bom"
fun DependencyHandler.`awssdk-bom`(version: String = AWSSDK) = "$`awssdk-bom`:$version"
val DependencyHandler.`awssdk-dynamodb` get() = "software.amazon.awssdk:dynamodb"
fun DependencyHandler.`awssdk-dynamodb`(version: String = AWSSDK) = "$`awssdk-dynamodb`:$version"
val DependencyHandler.`aws-java-sdk-bom` get() = "com.amazonaws:aws-java-sdk-bom"
fun DependencyHandler.`aws-java-sdk-bom`(version: String = AWS_JAVA_SDK) = "$`aws-java-sdk-bom`:$version"
val DependencyHandler.`aws-java-sdk-dynamodb` get() = "com.amazonaws:aws-java-sdk-dynamodb"
fun DependencyHandler.`aws-java-sdk-dynamodb`(version: String = AWS_JAVA_SDK) = "$`aws-java-sdk-dynamodb`:$version"
val DependencyHandler.`aws-java-sdk-ecs` get() = "com.amazonaws:aws-java-sdk-ecs"
fun DependencyHandler.`aws-java-sdk-ecs`(version: String = AWS_JAVA_SDK) = "$`aws-java-sdk-ecs`:$version"
val DependencyHandler.`aws-java-sdk-s3` get() = "com.amazonaws:aws-java-sdk-s3"
fun DependencyHandler.`aws-java-sdk-s3`(version: String = AWS_JAVA_SDK) = "$`aws-java-sdk-s3`:$version"
val DependencyHandler.`aws-lambda-java-core` get() = "com.amazonaws:aws-lambda-java-core"
fun DependencyHandler.`aws-lambda-java-core`(version: String = AWS_LAMBDA_CORE) = "$`aws-lambda-java-core`:$version"
val DependencyHandler.`aws-lambda-java-events` get() = "com.amazonaws:aws-lambda-java-events"
fun DependencyHandler.`aws-lambda-java-events`(version: String = AWS_LAMBDA_EVENTS) = "$`aws-lambda-java-events`:$version"
val DependencyHandler.`aws-lambda-java-log4j2` get() = "com.amazonaws:aws-lambda-java-log4j2"
fun DependencyHandler.`aws-lambda-java-log4j2`(version: String = AWS_LAMBDA_LOG4J2) = "$`aws-lambda-java-log4j2`:$version"
val DependencyHandler.`commons-csv` get() = "org.apache.commons:commons-csv"
fun DependencyHandler.`commons-csv`(version: String = COMMONS_CSV) = "$`commons-csv`:$version"
val DependencyHandler.`commons-net` get() = "commons-net:commons-net"
fun DependencyHandler.`commons-net`(version: String = COMMONS_NET) = "$`commons-net`:$version"
val DependencyHandler.dagger get() = "com.google.dagger:dagger"
fun DependencyHandler.dagger(version: String = DAGGER) = "$dagger:$version"
val DependencyHandler.`dagger-compiler` get() = "com.google.dagger:dagger-compiler"
fun DependencyHandler.`dagger-compiler`(version: String = DAGGER) = "$`dagger-compiler`:$version"
val DependencyHandler.`gradle-versions-plugin` get() = "com.github.ben-manes.versions:gradle-versions-plugin"
fun DependencyHandler.`gradle-versions-plugin`(version: String = BEN_MANES) = "$`gradle-versions-plugin`:$version"
val DependencyHandler.`graphiql-spring-boot-starter` get() = "com.graphql-java:graphiql-spring-boot-starter"
fun DependencyHandler.`graphiql-spring-boot-starter`(version: String = GRAPHIQL_SPRING_BOOT_STARTER) = "$`graphiql-spring-boot-starter`:$version"
val DependencyHandler.`graphql-java` get() = "com.graphql-java:graphql-java"
fun DependencyHandler.`graphql-java`(version: String = GRAPHQL_JAVA) = "$`graphql-java`:$version"
val DependencyHandler.`graphql-java-spring-boot-starter-webflux` get() = "com.graphql-java:graphql-java-spring-boot-starter-webflux"
fun DependencyHandler.`graphql-java-spring-boot-starter-webflux`(version: String = GRAPHQL_JAVA_SPRING_BOOT_STARTER_WEBFLUX) = "$`graphql-java-spring-boot-starter-webflux`:$version"
val DependencyHandler.`graphql-java-tools` get() = "com.graphql-java:graphql-java-tools"
fun DependencyHandler.`graphql-java-tools`(version: String = GRAPHQL_JAVA_TOOLS) = "$`graphql-java-tools`:$version"
val DependencyHandler.`graphql-spring-boot-starter` get() = "com.graphql-java:graphql-spring-boot-starter"
fun DependencyHandler.`graphql-spring-boot-starter`(version: String = GRAPHQL_SPRING_BOOT_STARTER) = "$`graphql-spring-boot-starter`:$version"
val DependencyHandler.guice get() = "com.google.inject:guice"
fun DependencyHandler.guice(version: String = GUICE) = "$guice:$version"
val DependencyHandler.`guice-assistedinject` get() = "com.google.inject.extensions:guice-assistedinject"
fun DependencyHandler.`guice-assistedinject`(version: String = GUICE) = "$`guice-assistedinject`:$version"
val DependencyHandler.`guice-bom` get() = "com.google.inject:guice-bom"
fun DependencyHandler.`guice-bom`(version: String = GUICE) = "$`guice-bom`:$version"
val DependencyHandler.httpcore get() = "org.apache.httpcomponents:httpcore"
fun DependencyHandler.httpcore(version: String = HTTPCORE) = "$httpcore:$version"
val DependencyHandler.`jackson-bom` get() = "com.fasterxml.jackson:jackson-bom"
fun DependencyHandler.`jackson-bom`(version: String = JACKSON) = "$`jackson-bom`:$version"
val DependencyHandler.`jackson-dataformat-yaml` get() = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml"
fun DependencyHandler.`jackson-dataformat-yaml`(version: String = JACKSON) = "$`jackson-dataformat-yaml`:$version"
val DependencyHandler.`jackson-module-kotlin` get() = "com.fasterxml.jackson.module:jackson-module-kotlin"
fun DependencyHandler.`jackson-module-kotlin`(version: String = JACKSON) = "$`jackson-module-kotlin`:$version"
val DependencyHandler.`javafx-base` get() = "org.openjfx:javafx-base"
fun DependencyHandler.`javafx-base`(version: String = JAVAFX) = "$`javafx-base`:$version"
val DependencyHandler.`javafx-controls` get() = "org.openjfx:javafx-controls"
fun DependencyHandler.`javafx-controls`(version: String = JAVAFX) = "$`javafx-controls`:$version"
val DependencyHandler.`javafx-fxml` get() = "org.openjfx:javafx-fxml"
fun DependencyHandler.`javafx-fxml`(version: String = JAVAFX) = "$`javafx-fxml`:$version"
val DependencyHandler.`javafx-graphics` get() = "org.openjfx:javafx-graphics"
fun DependencyHandler.`javafx-graphics`(version: String = JAVAFX) = "$`javafx-graphics`:$version"
val DependencyHandler.`javafx-media` get() = "org.openjfx:javafx-media"
fun DependencyHandler.`javafx-media`(version: String = JAVAFX) = "$`javafx-media`:$version"
val DependencyHandler.`javafx-swing` get() = "org.openjfx:javafx-swing"
fun DependencyHandler.`javafx-swing`(version: String = JAVAFX) = "$`javafx-swing`:$version"
val DependencyHandler.`javafx-web` get() = "org.openjfx:javafx-web"
fun DependencyHandler.`javafx-web`(version: String = JAVAFX) = "$`javafx-web`:$version"
val DependencyHandler.`javax-inject` get() = "javax.inject:javax.inject"
fun DependencyHandler.`javax-inject`(version: String = JAVAX_INJECT) = "$`javax-inject`:$version"
val DependencyHandler.jmockit get() = "org.jmockit:jmockit"
fun DependencyHandler.jmockit(version: String = JMOCKIT) = "$jmockit:$version"
val DependencyHandler.junit get() = "junit:junit"
fun DependencyHandler.junit(version: String = JUNIT) = "$junit:$version"
val DependencyHandler.`junit-bom` get() = "org.junit:junit-bom"
fun DependencyHandler.`junit-bom`(version: String = JUNIT5) = "$`junit-bom`:$version"
val DependencyHandler.`junit-jupiter-api` get() = "org.junit.jupiter:junit-jupiter-api"
fun DependencyHandler.`junit-jupiter-api`(version: String = JUNIT5) = "$`junit-jupiter-api`:$version"
val DependencyHandler.`junit-jupiter-engine` get() = "org.junit.jupiter:junit-jupiter-engine"
fun DependencyHandler.`junit-jupiter-engine`(version: String = JUNIT5) = "$`junit-jupiter-engine`:$version"
val DependencyHandler.`junit-jupiter-params` get() = "org.junit.jupiter:junit-jupiter-params"
fun DependencyHandler.`junit-jupiter-params`(version: String = JUNIT5) = "$`junit-jupiter-params`:$version"
val DependencyHandler.`junit-vintage-engine` get() = "org.junit.vintage:junit-vintage-engine"
fun DependencyHandler.`junit-vintage-engine`(version: String = JUNIT5) = "$`junit-vintage-engine`:$version"
val DependencyHandler.`kodein-di-generic-jvm` get() = "org.kodein.di:kodein-di-generic-jvm"
fun DependencyHandler.`kodein-di-generic-jvm`(version: String = KODEIN_DI_GENEREIC_JVM) = "$`kodein-di-generic-jvm`:$version"
val DependencyHandler.`koin-core` get() = "org.koin:koin-core"
fun DependencyHandler.`koin-core`(version: String = KOIN) = "$`koin-core`:$version"
val DependencyHandler.`koin-core-ext` get() = "org.koin:koin-core-ext"
fun DependencyHandler.`koin-core-ext`(version: String = KOIN) = "$`koin-core-ext`:$version"
val DependencyHandler.`koin-java` get() = "org.koin:koin-java"
fun DependencyHandler.`koin-java`(version: String = KOIN) = "$`koin-java`:$version"
val DependencyHandler.`koin-test` get() = "org.koin:koin-test"
fun DependencyHandler.`koin-test`(version: String = KOIN) = "$`koin-test`:$version"
val DependencyHandler.`kotlin-bom` get() = "org.jetbrains.kotlin:kotlin-bom"
fun DependencyHandler.`kotlin-bom`(version: String = KOTLIN) = "$`kotlin-bom`:$version"
val DependencyHandler.`kotlin-reflect` get() = "org.jetbrains.kotlin:kotlin-reflect"
fun DependencyHandler.`kotlin-reflect`(version: String = KOTLIN) = "$`kotlin-reflect`:$version"
val DependencyHandler.`kotlin-stdlib` get() = "org.jetbrains.kotlin:kotlin-stdlib"
fun DependencyHandler.`kotlin-stdlib`(version: String = KOTLIN) = "$`kotlin-stdlib`:$version"
val DependencyHandler.`kotlin-stdlib-jdk8` get() = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
fun DependencyHandler.`kotlin-stdlib-jdk8`(version: String = KOTLIN) = "$`kotlin-stdlib-jdk8`:$version"
val DependencyHandler.`kotlin-test` get() = "org.jetbrains.kotlin:kotlin-test"
fun DependencyHandler.`kotlin-test`(version: String = KOTLIN) = "$`kotlin-test`:$version"
val DependencyHandler.`kotlin-test-junit5` get() = "org.jetbrains.kotlin:kotlin-test-junit5"
fun DependencyHandler.`kotlin-test-junit5`(version: String = KOTLIN) = "$`kotlin-test-junit5`:$version"
val DependencyHandler.`kotlinx-coroutines-core` get() = "org.jetbrains.kotlinx:kotlinx-coroutines-core"
fun DependencyHandler.`kotlinx-coroutines-core`(version: String = KOTLINX) = "$`kotlinx-coroutines-core`:$version"
val DependencyHandler.`kotlinx-coroutines-core-common` get() = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common"
fun DependencyHandler.`kotlinx-coroutines-core-common`(version: String = KOTLINX) = "$`kotlinx-coroutines-core-common`:$version"
val DependencyHandler.`kotlinx-coroutines-javafx` get() = "org.jetbrains.kotlinx:kotlinx-coroutines-javafx"
fun DependencyHandler.`kotlinx-coroutines-javafx`(version: String = KOTLINX) = "$`kotlinx-coroutines-javafx`:$version"
val DependencyHandler.`kotlinx-coroutines-jdk8` get() = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8"
fun DependencyHandler.`kotlinx-coroutines-jdk8`(version: String = KOTLINX) = "$`kotlinx-coroutines-jdk8`:$version"
val DependencyHandler.`log4j-1_2-api` get() = "org.apache.logging.log4j:log4j-1.2-api"
fun DependencyHandler.`log4j-1_2-api`(version: String = LOG4J) = "$`log4j-1_2-api`:$version"
val DependencyHandler.`log4j-api` get() = "org.apache.logging.log4j:log4j-api"
fun DependencyHandler.`log4j-api`(version: String = LOG4J) = "$`log4j-api`:$version"
val DependencyHandler.`log4j-api-kotlin` get() = "org.apache.logging.log4j:log4j-api-kotlin"
fun DependencyHandler.`log4j-api-kotlin`(version: String = LOG4J_KOTLIN) = "$`log4j-api-kotlin`:$version"
val DependencyHandler.`log4j-bom` get() = "org.apache.logging.log4j:log4j-bom"
fun DependencyHandler.`log4j-bom`(version: String = LOG4J) = "$`log4j-bom`:$version"
val DependencyHandler.`log4j-core` get() = "org.apache.logging.log4j:log4j-core"
fun DependencyHandler.`log4j-core`(version: String = LOG4J) = "$`log4j-core`:$version"
val DependencyHandler.`log4j-jcl` get() = "org.apache.logging.log4j:log4j-jcl"
fun DependencyHandler.`log4j-jcl`(version: String = LOG4J) = "$`log4j-jcl`:$version"
val DependencyHandler.`log4j-slf4j-impl` get() = "org.apache.logging.log4j:log4j-slf4j-impl"
fun DependencyHandler.`log4j-slf4j-impl`(version: String = LOG4J) = "$`log4j-slf4j-impl`:$version"
val DependencyHandler.lombok get() = "org.projectlombok:lombok"
fun DependencyHandler.lombok(version: String = LOMBOK) = "$lombok:$version"
val DependencyHandler.`mockito-core` get() = "org.mockito:mockito-core"
fun DependencyHandler.`mockito-core`(version: String = MOCKITO) = "$`mockito-core`:$version"
val DependencyHandler.`mockito-junit-jupiter` get() = "org.mockito:mockito-junit-jupiter"
fun DependencyHandler.`mockito-junit-jupiter`(version: String = MOCKITO) = "$`mockito-junit-jupiter`:$version"
val DependencyHandler.mockk get() = "io.mockk:mockk"
fun DependencyHandler.mockk(version: String = MOCKK) = "$mockk:$version"
val DependencyHandler.`mock-ftp-server` get() = "org.mockftpserver:MockFtpServer"
fun DependencyHandler.`mock-ftp-server`(version: String = MOCK_FTP_SERVER) = "$`mock-ftp-server`:$version"
val DependencyHandler.`ok-http` get() = "com.squareup.okhttp3:okhttp"
fun DependencyHandler.`ok-http`(version: String = OK_HTTP) = "$`ok-http`:$version"
val DependencyHandler.`org-eclipse-jdt-annotation` get() = "org.eclipse.jdt:org.eclipse.jdt.annotation"
fun DependencyHandler.`org-eclipse-jdt-annotation`(version: String = ORG_ECLIPSE_JDT_ANNOTATION) = "$`org-eclipse-jdt-annotation`:$version"
val DependencyHandler.picocli get() = "info.picocli:picocli"
fun DependencyHandler.picocli(version: String = PICOCLI) = "$picocli:$version"
val DependencyHandler.`picocli-spring-boot-starter` get() = "info.picocli:picocli-spring-boot-starter"
fun DependencyHandler.`picocli-spring-boot-starter`(version: String = PICOCLI) = "$`picocli-spring-boot-starter`:$version"
val DependencyHandler.rxjava get() = "io.reactivex.rxjava2:rxjava"
fun DependencyHandler.rxjava(version: String = RXJAVA) = "$rxjava:$version"
val DependencyHandler.`slf4j-api` get() = "org.slf4j:slf4j-api"
fun DependencyHandler.`slf4j-api`(version: String = SLF4J_API) = "$`slf4j-api`:$version"
val DependencyHandler.`spring-boot` get() = "org.springframework.boot:spring-boot"
fun DependencyHandler.`spring-boot`(version: String = SPRING_BOOT) = "$`spring-boot`:$version"
val DependencyHandler.`spring-boot-actuator` get() = "org.springframework.boot:spring-boot-actuator"
fun DependencyHandler.`spring-boot-actuator`(version: String = SPRING_BOOT) = "$`spring-boot-actuator`:$version"
val DependencyHandler.`spring-boot-autoconfigure` get() = "org.springframework.boot:spring-boot-autoconfigure"
fun DependencyHandler.`spring-boot-autoconfigure`(version: String = SPRING_BOOT) = "$`spring-boot-autoconfigure`:$version"
val DependencyHandler.`spring-boot-configuration-processor` get() = "org.springframework.boot:spring-boot-configuration-processor"
fun DependencyHandler.`spring-boot-configuration-processor`(version: String = SPRING_BOOT) = "$`spring-boot-configuration-processor`:$version"
val DependencyHandler.`spring-boot-devtools` get() = "org.springframework.boot:spring-boot-devtools"
fun DependencyHandler.`spring-boot-devtools`(version: String = SPRING_BOOT) = "$`spring-boot-devtools`:$version"
val DependencyHandler.`spring-boot-starter` get() = "org.springframework.boot:spring-boot-starter"
fun DependencyHandler.`spring-boot-starter`(version: String = SPRING_BOOT) = "$`spring-boot-starter`:$version"
val DependencyHandler.`spring-boot-starter-activemq` get() = "org.springframework.boot:spring-boot-starter-activemq"
fun DependencyHandler.`spring-boot-starter-activemq`(version: String = SPRING_BOOT) = "$`spring-boot-starter-activemq`:$version"
val DependencyHandler.`spring-boot-starter-actuator` get() = "org.springframework.boot:spring-boot-starter-actuator"
fun DependencyHandler.`spring-boot-starter-actuator`(version: String = SPRING_BOOT) = "$`spring-boot-starter-actuator`:$version"
val DependencyHandler.`spring-boot-starter-aop` get() = "org.springframework.boot:spring-boot-starter-aop"
fun DependencyHandler.`spring-boot-starter-aop`(version: String = SPRING_BOOT) = "$`spring-boot-starter-aop`:$version"
val DependencyHandler.`spring-boot-starter-data-jpa` get() = "org.springframework.boot:spring-boot-starter-data-jpa"
fun DependencyHandler.`spring-boot-starter-data-jpa`(version: String = SPRING_BOOT) = "$`spring-boot-starter-data-jpa`:$version"
val DependencyHandler.`spring-boot-starter-data-mongodb` get() = "org.springframework.boot:spring-boot-starter-data-mongodb"
fun DependencyHandler.`spring-boot-starter-data-mongodb`(version: String = SPRING_BOOT) = "$`spring-boot-starter-data-mongodb`:$version"
val DependencyHandler.`spring-boot-starter-data-rest` get() = "org.springframework.boot:spring-boot-starter-data-rest"
fun DependencyHandler.`spring-boot-starter-data-rest`(version: String = SPRING_BOOT) = "$`spring-boot-starter-data-rest`:$version"
val DependencyHandler.`spring-boot-starter-json` get() = "org.springframework.boot:spring-boot-starter-json"
fun DependencyHandler.`spring-boot-starter-json`(version: String = SPRING_BOOT) = "$`spring-boot-starter-json`:$version"
val DependencyHandler.`spring-boot-starter-log4j2` get() = "org.springframework.boot:spring-boot-starter-log4j2"
fun DependencyHandler.`spring-boot-starter-log4j2`(version: String = SPRING_BOOT) = "$`spring-boot-starter-log4j2`:$version"
val DependencyHandler.`spring-boot-starter-logging` get() = "org.springframework.boot:spring-boot-starter-logging"
fun DependencyHandler.`spring-boot-starter-logging`(version: String = SPRING_BOOT) = "$`spring-boot-starter-logging`:$version"
val DependencyHandler.`spring-boot-starter-mail` get() = "org.springframework.boot:spring-boot-starter-mail"
fun DependencyHandler.`spring-boot-starter-mail`(version: String = SPRING_BOOT) = "$`spring-boot-starter-mail`:$version"
val DependencyHandler.`spring-boot-starter-parent` get() = "org.springframework.boot:spring-boot-starter-parent"
fun DependencyHandler.`spring-boot-starter-parent`(version: String = SPRING_BOOT) = "$`spring-boot-starter-parent`:$version"
val DependencyHandler.`spring-boot-starter-security` get() = "org.springframework.boot:spring-boot-starter-security"
fun DependencyHandler.`spring-boot-starter-security`(version: String = SPRING_BOOT) = "$`spring-boot-starter-security`:$version"
val DependencyHandler.`spring-boot-starter-test` get() = "org.springframework.boot:spring-boot-starter-test"
fun DependencyHandler.`spring-boot-starter-test`(version: String = SPRING_BOOT) = "$`spring-boot-starter-test`:$version"
val DependencyHandler.`spring-boot-starter-web` get() = "org.springframework.boot:spring-boot-starter-web"
fun DependencyHandler.`spring-boot-starter-web`(version: String = SPRING_BOOT) = "$`spring-boot-starter-web`:$version"
val DependencyHandler.`spring-boot-starter-webflux` get() = "org.springframework.boot:spring-boot-starter-webflux"
fun DependencyHandler.`spring-boot-starter-webflux`(version: String = SPRING_BOOT) = "$`spring-boot-starter-webflux`:$version"
val DependencyHandler.`spring-boot-starter-websocket` get() = "org.springframework.boot:spring-boot-starter-websocket"
fun DependencyHandler.`spring-boot-starter-websocket`(version: String = SPRING_BOOT) = "$`spring-boot-starter-websocket`:$version"
val DependencyHandler.`spring-context` get() = "org.springframework:spring-context"
fun DependencyHandler.`spring-context`(version: String = SPRING) = "$`spring-context`:$version"
val DependencyHandler.`stripe-java` get() = "com.stripe:stripe-java"
fun DependencyHandler.`stripe-java`(version: String = STRIPE_JAVA) = "$`stripe-java`:$version"
val DependencyHandler.truth get() = "com.google.truth:truth"
fun DependencyHandler.truth(version: String = TRUTH) = "$truth:$version"
val DependencyHandler.`truth-java8-extension` get() = "com.google.truth.extensions:truth-java8-extension"
fun DependencyHandler.`truth-java8-extension`(version: String = TRUTH) = "$`truth-java8-extension`:$version"
val DependencyHandler.`validation-api` get() = "javax.validation:validation-api"
fun DependencyHandler.`validation-api`(version: String = VALIDATION_API) = "$`validation-api`:$version"
