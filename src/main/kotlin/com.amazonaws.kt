import org.gradle.api.artifacts.dsl.DependencyHandler

object Aws {
    const val GROUP = "com.amazonaws"
}

object AwsJava {
    const val VERSION = "1.11.414"

    internal object Dependencies {
        const val SDK = "aws-java-sdk"
    }
}

val DependencyHandler.`aws-java-sdk-bom`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.SDK}-bom:${AwsJava.VERSION}"
val DependencyHandler.`aws-java-sdk-dynamodb`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.SDK}-dynamodb:${AwsJava.VERSION}"
val DependencyHandler.`aws-java-sdk-ecs`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.SDK}-ecs:${AwsJava.VERSION}"
val DependencyHandler.`aws-java-sdk-s3`: String
    get() = "${Aws.GROUP}:${AwsJava.Dependencies.SDK}-s3:${AwsJava.VERSION}"

object AwsLambda {
    internal object Dependencies {
        const val JAVA = "aws-lambda-java"
    }
}

val DependencyHandler.`aws-lambda-java-core`: String
    get() = "${Aws.GROUP}:${AwsLambda.Dependencies.JAVA}-core:1.2.0"
val DependencyHandler.`aws-lambda-java-events`: String
    get() = "${Aws.GROUP}:${AwsLambda.Dependencies.JAVA}-events:2.2.2"
val DependencyHandler.`aws-lambda-java-log4j2`: String
    get() = "${Aws.GROUP}:${AwsLambda.Dependencies.JAVA}-log4j2:1.1.0"
