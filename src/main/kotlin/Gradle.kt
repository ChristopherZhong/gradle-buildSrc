import Dependencies.Apache
import Dependencies.AssertJ
import Dependencies.Aws
import Dependencies.Dagger
import Dependencies.Guice
import Dependencies.Jackson
import Dependencies.Junit
import Dependencies.Log4j
import Dependencies.Lombok
import Dependencies.Mockito
import Dependencies.SpringBoot
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

object Gradle {
    const val version = "5.0-rc-1"
}

const val `assertj-core`: String = "${AssertJ.group}:${AssertJ.core}:${AssertJ.version}"
const val `aws-java-sdk-bom`: String = "${Aws.group}:${Aws.Java.bom}:${Aws.Java.version}"
const val `aws-java-sdk-dynamodb`: String = "${Aws.group}:${Aws.Java.dynamodb}"
const val `aws-java-sdk-ecs`: String = "${Aws.group}:${Aws.Java.ecs}"
const val `aws-java-sdk-s3`: String = "${Aws.group}:${Aws.Java.s3}"
const val `aws-lambda-java-core`: String = "${Aws.group}:${Aws.Lambda.core}"
const val `aws-lambda-java-events`: String = "${Aws.group}:${Aws.Lambda.events}"
const val `aws-lambda-java-log4j2`: String = "${Aws.group}:${Aws.Lambda.log4j2}"
const val `commons-csv`: String = "${Apache.Commons.group}:${Apache.Commons.csv}:${Apache.Commons.version}"
const val dagger: String = "${Dagger.group}:${Dagger.dagger}:${Dagger.version}"
const val `dagger-compiler`: String = "${Dagger.group}:${Dagger.compiler}:${Dagger.version}"
const val guice: String = "${Guice.group}:${Guice.guice}"
const val `guice-assistedinject`: String = "${Guice.Extensions.group}:${Guice.Extensions.assistedinject}"
const val `guice-bom`: String = "${Guice.group}:${Guice.bom}:${Guice.version}"
const val httpcore: String = "${Apache.HttpComponents.group}:${Apache.HttpComponents.httpcore}:${Apache.HttpComponents.version}"
const val `jackson-bom`: String = "${Jackson.group}:${Jackson.bom}:${Jackson.version}"
const val `jackson-dataformat-yaml`: String = "${Jackson.DataFormat.group}:${Jackson.DataFormat.yaml}"
const val `junit-jupiter-api`: String = "${Junit.Jupiter.group}:${Junit.Jupiter.api}"
const val `junit-bom`: String = "${Junit.group}:${Junit.bom}:${Junit.version}"
const val `junit-jupiter-engine`: String = "${Junit.Jupiter.group}:${Junit.Jupiter.engine}"
const val `junit-jupiter-params`: String = "${Junit.Jupiter.group}:${Junit.Jupiter.params}"
const val `junit-vintage-engine`: String = "${Junit.Vintage.group}:${Junit.Vintage.engine}"
const val `log4j-1_2-api`: String = "${Log4j.group}:${Log4j.`1_2-api`}"
const val `log4j-api`: String = "${Log4j.group}:${Log4j.api}"
const val `log4j-bom`: String = "${Log4j.group}:${Log4j.bom}:${Log4j.version}"
const val `log4j-core`: String = "${Log4j.group}:${Log4j.core}"
const val `log4j-jcl`: String = "${Log4j.group}:${Log4j.jcl}"
const val `log4j-slf4j-impl`: String = "${Log4j.group}:${Log4j.`slf4j-impl`}"
const val lombok: String = "${Lombok.group}:${Lombok.lombok}:${Lombok.version}"
const val `mockito-core`: String = "${Mockito.group}:${Mockito.core}:${Mockito.version}"
const val `spring-boot-configuration-processor`: String = "${SpringBoot.group}:${SpringBoot.`configuration-processor`}"
const val `spring-boot-starter`: String = "${SpringBoot.group}:${SpringBoot.starter}"
const val `spring-boot-starter-log4j2`: String = "${SpringBoot.group}:${SpringBoot.log4j2}"
const val `spring-boot-starter-parent`: String = "${SpringBoot.group}:${SpringBoot.parent}:${SpringBoot.version}"
const val `spring-boot-starter-test`: String = "${SpringBoot.group}:${SpringBoot.test}"

object Plugins {
    object Bintray {
        const val id = "com.jfrog.bintray"
        const val version = "1.8.4"

        fun apply(spec: PluginDependenciesSpec) = spec.id(id) version version
    }

    object Kotlin {
        const val id = "org.jetbrains.kotlin"
        const val version = "1.3.0"
        const val jvm = "$id.jvm"
        const val kapt = "$id.kapt"

        fun `apply-jvm`(spec: PluginDependenciesSpec) = spec.id(jvm) version version
        fun `apply-kapt`(spec: PluginDependenciesSpec) = spec.id(kapt) version version
    }

    object Spring {
        object Boot {
            const val id = "org.springframework.boot"
            const val version = Dependencies.SpringBoot.version

            fun apply(spec: PluginDependenciesSpec) = spec.id(id) version version
        }
        object DependencyManagement {
            const val id = "io.spring.dependency-management"
            const val version = "1.0.6.RELEASE"

            fun apply(spec: PluginDependenciesSpec) = spec.id(id) version version
        }
    }
}

object Dependencies {
    object Apache {
        const val group = "org.apache"

        object Commons {
            const val group = "${Apache.group}.commons"
            const val version = "1.5"
            const val csv = "commons-csv"
        }

        object HttpComponents {
            const val group = "${Apache.group}.httpcomponents"
            const val version = "4.4.10"
            const val httpcore = "httpcore"
        }
    }

    object AssertJ {
        const val group = "org.assertj"
        const val version = "3.11.1"
        const val core = "assertj-core"
    }

    object Aws {
        const val group = "com.amazonaws"

        object Java {
            const val version = "1.11.414"
            const val bom = "aws-java-sdk-bom"
            const val dynamodb = "aws-java-sdk-dynamodb"
            const val ecs = "aws-java-sdk-ecs"
            const val s3 = "aws-java-sdk-s3"
        }

        object Lambda {
            const val core = "aws-lambda-java-core:1.2.0"
            const val events = "aws-lambda-java-events:2.2.2"
            const val log4j2 = "aws-lambda-java-log4j2:1.1.0"
        }
    }

    object Dagger {
        const val group = "com.google.dagger"
        const val version = "2.17"
        const val compiler = "dagger-compiler"
        const val dagger = "dagger"
    }

    object Guice {
        const val group = "com.google.inject"
        const val version = "4.2.0"
        const val bom = "guice-bom"
        const val guice = "guice"

        object Extensions {
            const val group = "${Guice.group}.extensions"
            const val assistedinject = "guice-assistedinject"
        }
    }

    object Jackson {
        const val group = "com.fasterxml.jackson"
        const val version = "2.9.7"
        const val bom = "jackson-bom"

        object Core {
            const val group = "${Jackson.group}.core"
        }

        object DataFormat {
            const val group = "${Jackson.group}.dataformat"
            const val yaml = "jackson-dataformat-yaml"
        }
    }

    object Junit {
        const val group = "org.junit"
        const val version = "5.3.1"
        const val bom = "junit-bom"

        object Jupiter {
            const val group = "${Junit.group}.jupiter"
            const val api = "junit-jupiter-api"
            const val engine = "junit-jupiter-engine"
            const val params = "junit-jupiter-params"
        }

        object Vintage {
            const val group = "${Junit.group}.vintage"
            const val engine = "junit-vintage-engine"
        }
    }

    object Log4j {
        const val group = "org.apache.logging.log4j"
        const val version = "2.11.1"
        const val `1_2-api` = "log4j-1.2-api"
        const val api = "log4j-api"
        const val bom = "log4j-bom"
        const val core = "log4j-core"
        const val jcl = "log4j-jcl"
        const val `slf4j-impl` = "log4j-slf4j-impl"
    }

    object Lombok {
        const val group = "org.projectlombok"
        const val version = "1.18.2"
        const val lombok = "lombok"
    }

    object Mockito {
        const val group = "org.mockito"
        const val version = "2.21.0"
        const val core = "mockito-core"
    }

    object SpringBoot {
        const val group = "org.springframework.boot"
        const val version = "2.1.0.RELEASE"
        const val `configuration-processor` = "spring-boot-configuration-processor"
        const val log4j2 = "spring-boot-starter-log4j2"
        const val parent = "spring-boot-starter-parent"
        const val starter = "spring-boot-starter"
        const val test = "spring-boot-starter-test"
    }
}
