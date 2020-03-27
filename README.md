# A Gradle `buildSrc` Example

[Gradle](https://gradle.org/) release the `buildSrc` in version XXX.
One of the uses for the `buildSrc` is to manage dependencies.
This is awesome because the `buildSrc` provides type-safety and autocompletion support in IDEs.

However, the `buildSrc` is fairly new when I started using it to manage dependencies of my projects.
In the process, I made a lot mistakes and through trial and errors.
I created this project to document what I learned.

## Try #1

The first thing I did was to create global scope variables `val X_VERSION = "X.X.X"` and used it as follows.

```kotlin
dependencies {
    implementation("..." + X_VERSION)
}
```

However, there were two problems that I discovered with this approach.

One of the problems is that this approach caused autocomplete pollution in IDEs.
The autocompletion would offer the declared variables (e.g., `X_VERSION`) as suggestions in places where they are not relevant.
As the number of variables increased, so would the autocomplete list, and cause slowdowns in the IDEs.

The second problem was not so much as caused by this approach but rather one that this approach did not resolve.
The group and artifact are still strings.
You see, I love typed data, and I believe that declaration of dependencies should be typed.

Fortunately, Kotlin has the feature of extensions.
This could allow me to scope them to the appropriate context, which leads me to my next attempt.

## Try #2

Using the extension feature of Kotlin, I decided to scope the version variables `val DependencyHandler.X_VERSION`.
I can still declare dependencies as in [try 1](#try-1) without the autocomplete pollution in IDEs.

Furthermore, I also decided to use this approach to scope versions for plugins.
E.g., `val PluginDependenciesSpec.X_VERSION`.

Now, that autocomplete pollution is no longer a problem, it is time to attempt to address the second problem described earlier.
This lead me to the next attempt.

## Try #3

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
