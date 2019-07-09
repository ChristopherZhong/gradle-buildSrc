@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object AwsSdk {
    const val GROUP = "software.amazon.awssdk"
    const val VERSION = "2.7.1"
}

val DependencyHandler.`awssdk-bom`: String
    get() = "${AwsSdk.GROUP}:bom:${AwsSdk.VERSION}"
val DependencyHandler.`awssdk-dynamodb`: String
    get() = "${AwsSdk.GROUP}:dynamodb:${AwsSdk.VERSION}"
