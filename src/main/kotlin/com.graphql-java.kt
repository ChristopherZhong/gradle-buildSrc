@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object GraphQLJava {
    const val GROUP = "com.graphql-java"
    const val VERSION = "13.0"
}

val DependencyHandler.`graphql-java`: String
    get() = "${GraphQLJava.GROUP}:graphql-java:${GraphQLJava.VERSION}"
