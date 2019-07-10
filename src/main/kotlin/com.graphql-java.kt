@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object GraphQLJava {
    const val GROUP = "com.graphql-java"
}

val DependencyHandler.`graphql-java`: String
    get() = "${GraphQLJava.GROUP}:graphql-java:13.0"
val DependencyHandler.`graphql-java-spring-boot-starter-webflux`: String
    get() = "${GraphQLJava.GROUP}:graphql-java-spring-boot-starter-webflux:1.0"
val DependencyHandler.`graphiql-spring-boot-starter`: String
    get() = "${GraphQLJava.GROUP}:graphiql-spring-boot-starter:5.0.2"
