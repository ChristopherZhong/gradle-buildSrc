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

const val `aws-java-sdk-bom`: String = "${Aws.GROUP}:${AwsJava.Dependencies.BOM}:${AwsJava.VERSION}"
const val `aws-java-sdk-dynamodb`: String = "${Aws.GROUP}:${AwsJava.Dependencies.DYNAMODB}"
const val `aws-java-sdk-ecs`: String = "${Aws.GROUP}:${AwsJava.Dependencies.ECS}"
const val `aws-java-sdk-s3`: String = "${Aws.GROUP}:${AwsJava.Dependencies.S3}"

object AwsLambda {
    object Dependencies {
        const val CORE = "aws-lambda-java-core:1.2.0"
        const val EVENTS = "aws-lambda-java-events:2.2.2"
        const val LOG4J2 = "aws-lambda-java-log4j2:1.1.0"
    }
}

const val `aws-lambda-java-core`: String = "${Aws.GROUP}:${AwsLambda.Dependencies.CORE}"
const val `aws-lambda-java-events`: String = "${Aws.GROUP}:${AwsLambda.Dependencies.EVENTS}"
const val `aws-lambda-java-log4j2`: String = "${Aws.GROUP}:${AwsLambda.Dependencies.LOG4J2}"
