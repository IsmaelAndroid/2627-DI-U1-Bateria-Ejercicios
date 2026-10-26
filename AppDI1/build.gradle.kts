// build.gradle.kts del PROYECTO → declara los plugins (sin aplicarlos). AGP 9 ya trae Kotlin integrado.
plugins {
    id("com.android.application") version "9.4.1" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.4.20" apply false
}
