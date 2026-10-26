package com.di.tema1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.di.tema1.ui.AppDI1

// CAPA 1 · LA ACTIVIDAD (el "edificio"): no dibuja nada, solo aloja la interfaz.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // EJ13 · PASO 2: prueba a escribir aquí  Text("Hola")  (fuera de setContent) y mira el error.

        setContent {      // ← el PUENTE entre la actividad y Compose
            AppDI1()      // ← CAPA 2 · el composable raíz (la "decoración")
        }
    }
}
