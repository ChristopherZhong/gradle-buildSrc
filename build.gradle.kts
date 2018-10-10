plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:+")
    testImplementation("org.assertj:assertj-core:+")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:+")
}