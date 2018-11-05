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

const val `aws-java-sdk-bom`: String = "${Aws.group}:${Aws.Java.bom}:${Aws.Java.version}"
const val `aws-java-sdk-dynamodb`: String = "${Aws.group}:${Aws.Java.dynamodb}"
const val `aws-java-sdk-ecs`: String = "${Aws.group}:${Aws.Java.ecs}"
const val `aws-java-sdk-s3`: String = "${Aws.group}:${Aws.Java.s3}"
const val `aws-lambda-java-core`: String = "${Aws.group}:${Aws.Lambda.core}"
const val `aws-lambda-java-events`: String = "${Aws.group}:${Aws.Lambda.events}"
const val `aws-lambda-java-log4j2`: String = "${Aws.group}:${Aws.Lambda.log4j2}"
