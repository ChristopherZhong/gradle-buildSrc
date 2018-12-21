# gradle-buildSrc

Using Gradle's `buildSrc` to manage dependencies is awesome because of type-safety and autocomplete in IDEs. However, when I first started using `buildSrc`, I made all sorts of mistakes.

This project is my contribution back to the community on what I learned in my trial and errors.

One of the problems I discovered was autocomplete pollution. The autocompletion would offer the declared functions and variables suggestions in places where they are not used.

Fortunately, Kotlin has the feature of extensions. This allows me to scope them to the appropriate context.
