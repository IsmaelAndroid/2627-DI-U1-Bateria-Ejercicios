package com.di.tema1.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.di.tema1.R

// EJ30 · Esta pantalla FUNCIONA, pero tiene 5 problemas de accesibilidad. Encuéntralos y arréglalos
// (mira el README del ejercicio 30). Puedes arreglarla aquí mismo.
@Composable
fun AccesibleSinArreglar() {
    var favoritos by remember { mutableIntStateOf(0) }
    Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Oferta del día", fontSize = 22.sp)
        Text(
            "Auriculares inalámbricos con cancelación de ruido. Batería para 30 horas.",
            color = Color(0xFFBDBDBD),
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.size(24.dp).clickable { favoritos++ },
            )
            Text("$favoritos", fontSize = 10.sp)
        }
        Text("x", Modifier.clickable { favoritos = 0 })
    }
}
