@file:Suppress("unused", "ObjectPropertyName")

import org.gradle.api.artifacts.dsl.DependencyHandler

object Stripe {
    const val GROUP = "com.stripe"
    const val VERSION = "7.0.0"
}

val DependencyHandler.`stripe-java`: String
    get() = "${Stripe.GROUP}:stripe-java:${Stripe.VERSION}"
