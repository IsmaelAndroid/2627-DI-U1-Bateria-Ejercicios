// build.gradle.kts del MÓDULO :app → cómo se construye la app
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.di.tema1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.di.tema1"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.12.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.9.3")
    // EJ15 · PASO 1: añade aquí las dos librerías de la vista previa (@Preview)

    testImplementation("junit:junit:4.13.2")
}
