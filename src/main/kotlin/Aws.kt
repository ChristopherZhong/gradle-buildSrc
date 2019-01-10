import org.gradle.api.artifacts.dsl.DependencyHandler

object Aws {
    const val GROUP = "com.amazonaws"
}

object AwsJava {
    const val VERSION = "1.11.414"

    object Dependencies {
        const val BOM = "aws-java-sdk-bom"
        const val DYNAMODB = "aws-java-sdk-dynamodb"
        const val ECS = "aws-java-sdk-ecs"
        const val S3 = "aws-java-sdk-s3"
    }
}

val DependencyHandler.`aws-java-sdk-bom`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.BOM}:${AwsJava.VERSION}"
val DependencyHandler.`aws-java-sdk-dynamodb`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.DYNAMODB}"
val DependencyHandler.`aws-java-sdk-ecs`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.ECS}"
val DependencyHandler.`aws-java-sdk-s3`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.S3}"

object AwsLambda {
    object Dependencies {
        const val CORE = "aws-lambda-java-core:1.2.0"
        const val EVENTS = "aws-lambda-java-events:2.2.2"
        const val LOG4J2 = "aws-lambda-java-log4j2:1.1.0"
    }
}

val DependencyHandler.`aws-lambda-java-core`: String
    get() = "${Aws.GROUP}:${AwsLambda.Dependencies.CORE}"
val DependencyHandler.`aws-lambda-java-events`: String
    get() = "${Aws.GROUP}:${AwsLambda.Dependencies.EVENTS}"
val DependencyHandler.`aws-lambda-java-log4j2`: String
    get() = "${Aws.GROUP}:${AwsLambda.Dependencies.LOG4J2}"
