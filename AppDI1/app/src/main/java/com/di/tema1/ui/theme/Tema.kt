package com.di.tema1.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// El tema de la app: todas las pantallas toman sus colores y tipografía de aquí.
// EJ26 · PASO 3: añade el color dinámico de Android 12+ (dynamicLightColorScheme / dynamicDarkColorScheme)
@Composable
fun TemaDI(oscuro: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (oscuro) darkColorScheme() else lightColorScheme(),
        content = content,
    )
}
