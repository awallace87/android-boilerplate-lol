# Android (Internal) Boilerplate Project

This project is a boilerplate/start for personal Android applications. Specifically, this project is
targeted for supported a minimum Android API level of 21 (Lollipop) and above.

This includes integrated and configured common libraries, common UI components, and shared Android
/framework components (built for Dagger/Hilt use).

## Libraries and tools included:

- [AndroidX](https://developer.android.com/jetpack/androidx)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Kotlin](https://kotlinlang.org/)
- [Kotlin Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)
- [Dagger 2](https://dagger.dev/)
- [Hilt](https://dagger.dev/hilt/)
- [Room](https://developer.android.com/training/data-storage/room)
- [Proto DataStore](https://developer.android.com/topic/libraries/architecture/datastore)
- [OkHttp](https://square.github.io/okhttp/)
- [Timber Logging](https://github.com/JakeWharton/timber)
- [Moshi](https://github.com/square/moshi)
- [Picasso](https://square.github.io/picasso/)
- [Truth Assertion Library](https://truth.dev/)

## How to use this project

* Download this repository as a zip
* Change the package name
    * Rename packages in main, androidTest, and test directories
    * In 'app/build.gradle' file, 'packageName' and 'testInstrumentationRunner' fields
    * In 'src/main/AndroidManifest.xml' file, the 'android:name' field
* Replace the example code with your app code following the same architecture.
* Update README with information relevant to the new project.
* Update LICENSE to match the requirements of the new project.
