# A Gradle `buildSrc` Example

[Gradle][gradle] release the `buildSrc` in version XXX.
One of the uses for the `buildSrc` is to manage dependencies.
This is awesome because the `buildSrc` provides type-safety and autocompletion support in IDEs.

However, the `buildSrc` is fairly new when I started using it to manage dependencies of my projects.
In the process, I made a lot mistakes and through trial and errors.
I created this project to document what I learned.

The first thing I did was to create global scope variables `const val X_VERSION = "X.X.X"`

```kotlin
dependencies {
    implementation("" + Versions)
}
```

One of the problems I discovered was autocomplete pollution. The autocompletion would offer the declared functions and variables suggestions in places where they are not used.

Fortunately, Kotlin has the feature of extensions. This allows me to scope them to the appropriate context.

[gradle]: https://gradle.org/

## Usage

```kotlin
plugins {
    `kotlin-jvm` // no version is specified
}
```

Or

```kotlin
plugins {
    `kotlin-jvm`() // use default version specified in the Versions.kt file
}
```

Or

```kotlin
plugins {
    `kotlin-jvm`("1.3.50") // use 1.3.50 as the version
}
```
