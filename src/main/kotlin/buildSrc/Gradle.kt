package buildSrc

import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

object Gradle {
    const val version = "4.10.2"
}

const val `assertj-core`: String = Dependencies.AssertJ.core
const val `aws-java-sdk-bom`: String = Dependencies.Aws.Java.bom
const val `aws-java-sdk-dynamodb`: String = Dependencies.Aws.Java.`dynamo-db`
const val `aws-java-sdk-ecs`: String = Dependencies.Aws.Java.ecs
const val `aws-java-sdk-s3`: String = Dependencies.Aws.Java.s3
const val `aws-lambda-java-core`: String = Dependencies.Aws.Lambda.core
const val `aws-lambda-java-events`: String = Dependencies.Aws.Lambda.events
const val `aws-lambda-java-log4j2`: String = Dependencies.Aws.Lambda.log4j2
const val `commons-csv`: String = Dependencies.Apache.Commons.csv
const val `dagger`: String = Dependencies.Dagger.dagger
const val `dagger-compiler`: String = Dependencies.Dagger.compiler
const val `guice`: String = Dependencies.Guice.guice
const val `guice-assistedinject`: String = Dependencies.Guice.Extensions.assistedinject
const val `guice-bom`: String = Dependencies.Guice.bom
const val `httpcore`: String = Dependencies.Apache.HttpComponents.core
const val `jackson-bom`: String = Dependencies.Jackson.bom
const val `jackson-dataformat-yaml`: String = Dependencies.Jackson.DataFormat.yaml
const val `junit-jupiter-api`: String = Dependencies.Junit.Jupiter.api
const val `junit-bom`: String = Dependencies.Junit.bom
const val `junit-jupiter-engine`: String = Dependencies.Junit.Jupiter.engine
const val `junit-jupiter-params`: String = Dependencies.Junit.Jupiter.params
const val `junit-vintage-engine`: String = Dependencies.Junit.Vintage.engine
const val `log4j-1_2-api`: String = Dependencies.Log4j.`1_2-api`
const val `log4j-api`: String = Dependencies.Log4j.api
const val `log4j-bom`: String = Dependencies.Log4j.bom
const val `log4j-core`: String = Dependencies.Log4j.core
const val `log4j-jcl`: String = Dependencies.Log4j.jcl
const val `log4j-slf4j-impl`: String = Dependencies.Log4j.`slf4j-impl`
const val `mockito-core`: String = Dependencies.Mockito.core
const val `spring-boot-configuration-processor`: String = Dependencies.SpringBoot.`configuration-processor`
const val `spring-boot-starter`: String = Dependencies.SpringBoot.starter
const val `spring-boot-starter-log4j2`: String = Dependencies.SpringBoot.log4j2
const val `spring-boot-starter-parent`: String = Dependencies.SpringBoot.bom
const val `spring-boot-starter-test`: String = Dependencies.SpringBoot.test

object Plugins {
    object Bintray {
        const val id = "com.jfrog.bintray"
        const val version = "1.8.4"

        fun use(spec: PluginDependenciesSpec) = spec.id(id)
        fun add(spec: PluginDependenciesSpec) = use(spec) version version
    }

    object Kotlin {
        const val id = "org.jetbrains.kotlin"
        const val version = "1.2.71"
        const val jvm = "$id.jvm"
        const val kapt = "$id.kapt"

        fun `use-jvm`(spec: PluginDependenciesSpec) = spec.id(jvm)
        fun `use-kapt`(spec: PluginDependenciesSpec) = spec.id(kapt)
        fun `add-jvm`(spec: PluginDependenciesSpec) = `use-jvm`(spec) version version
        fun `add-kapt`(spec: PluginDependenciesSpec) = `use-kapt`(spec) version version
    }

    object Spring {
        object DependencyManagement {
            const val id = "io.spring.dependency-management"
            const val version = "1.0.6.RELEASE"

            fun use(spec: PluginDependenciesSpec) = spec.id(id)
            fun add(spec: PluginDependenciesSpec) = use(spec) version version
        }
    }
}

object Dependencies {
    object Apache {
        const val group = "org.apache"

        object Commons {
            const val group = "${Apache.group}.commons"
            const val csv = "$group:commons-csv:1.5"
        }

        object HttpComponents {
            const val group = "${Apache.group}.httpcomponents"
            const val core = "$group:httpcore:4.4.10"
        }
    }

    object AssertJ {
        const val group = "org.assertj"
        const val version = "3.11.1"
        const val core = "$group:assertj-core:$version"
    }

    object Aws {
        const val group = "com.amazonaws"
        private const val id = "aws"

        object Java {
            private const val id = "${Aws.id}-java-sdk"
            const val version = "1.11.414"
            const val bom = "$group:$id-bom:$version"
            const val `dynamo-db` = "$group:$id-dynamodb"
            const val ecs = "$group:$id-ecs"
            const val s3 = "$group:$id-s3"
        }

        object Lambda {
            private const val id = "${Aws.id}-lambda-java"
            const val core = "$group:$id-core:1.2.0"
            const val events = "$group:$id-events:2.2.2"
            const val log4j2 = "$group:$id-log4j2:1.1.0"
        }
    }

    object Dagger {
        const val group = "com.google.dagger"
        const val version = "2.17"
        const val compiler = "$group:dagger-compiler:$version"
        const val dagger = "$group:dagger:$version"
    }

    object Guice {
        const val group = "com.google.inject"
        const val version = "4.2.0"
        const val bom = "$group:guice-bom:$version"
        const val guice = "$group:guice"

        object Extensions {
            const val group = "${Guice.group}.extensions"
            const val `assistedinject` = "$group:guice-assistedinject"
        }
    }

    object Jackson {
        const val group = "com.fasterxml.jackson"
        const val version = "2.9.7"
        const val bom = "$group:jackson-bom:$version"

        object Core {
            const val group = "${Jackson.group}.core"
        }

        object DataFormat {
            const val group = "${Jackson.group}.dataformat"
            const val yaml = "$group:jackson-dataformat-yaml"
        }
    }

    object Junit {
        const val group = "org.junit"
        const val version = "5.3.1"
        const val bom = "$group:junit-bom:$version"

        object Jupiter {
            const val group = "${Junit.group}.jupiter"
            const val api = "$group:junit-jupiter-api"
            const val engine = "$group:junit-jupiter-engine"
            const val params = "$group:junit-jupiter-params"
        }

        object Vintage {
            const val group = "${Junit.group}.vintage"
            const val engine = "$group:junit-vintage-engine"
        }
    }

    object Log4j {
        const val group = "org.apache.logging.log4j"
        const val version = "2.11.1"
        const val `1_2-api` = "$group:log4j-1.2-api"
        const val api = "$group:log4j-api"
        const val bom = "$group:log4j-bom:$version"
        const val core = "$group:log4j-core"
        const val jcl = "$group:log4j-jcl"
        const val `slf4j-impl` = "$group:log4j-slf4j-impl"
    }

    object Lombok {
        const val group = "org.projectlombok"
        const val version = "1.18.2"
        const val lombok = "$group:lombok:$version"
    }

    object Mockito {
        const val group = "org.mockito"
        const val version = "2.21.0"
        const val core = "$group:mockito-core:$version"
    }

    object SpringBoot {
        const val group = "org.springframework.boot"
        const val id = "spring-boot"
        const val version = "2.0.5.RELEASE"
        const val bom = "$group:$id-starter-parent:$version"
        const val `configuration-processor` = "$group:$id-configuration-processor"
        const val log4j2 = "$group:$id-starter-log4j2"
        const val starter = "$group:$id-starter"
        const val test = "$group:$id-starter-test"
    }
}
