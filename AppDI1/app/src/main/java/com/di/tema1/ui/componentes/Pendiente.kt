package com.di.tema1.ui.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Lo que se ve en una pestaña cuyo ejercicio aún no está hecho. Bórralo de cada pantalla al hacerla.
@Composable
fun Pendiente(ejercicio: Int, titulo: String) {
    Column(
        Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Ejercicio $ejercicio", style = MaterialTheme.typography.headlineSmall)
        Text("$titulo: pendiente", color = MaterialTheme.colorScheme.outline)
    }
}
