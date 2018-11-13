package com.amazonaws

object Aws {
    const val GROUP = "com.amazonaws"
    // libraries below

    object Java {
        const val VERSION = "1.11.414"
        // libraries below
        const val BOM = "aws-java-sdk-bom"
        const val DYNAMODB = "aws-java-sdk-dynamodb"
        const val ECS = "aws-java-sdk-ecs"
        const val S3 = "aws-java-sdk-s3"
    }

    object Lambda {
        // libraries below
        const val CORE = "aws-lambda-java-core:1.2.0"
        const val EVENTS = "aws-lambda-java-events:2.2.2"
        const val LOG4J2 = "aws-lambda-java-log4j2:1.1.0"
    }
}

const val `aws-java-sdk-bom`: String = "${Aws.GROUP}:${Aws.Java.BOM}:${Aws.Java.VERSION}"
const val `aws-java-sdk-dynamodb`: String = "${Aws.GROUP}:${Aws.Java.DYNAMODB}"
const val `aws-java-sdk-ecs`: String = "${Aws.GROUP}:${Aws.Java.ECS}"
const val `aws-java-sdk-s3`: String = "${Aws.GROUP}:${Aws.Java.S3}"
const val `aws-lambda-java-core`: String = "${Aws.GROUP}:${Aws.Lambda.CORE}"
const val `aws-lambda-java-events`: String = "${Aws.GROUP}:${Aws.Lambda.EVENTS}"
const val `aws-lambda-java-log4j2`: String = "${Aws.GROUP}:${Aws.Lambda.LOG4J2}"