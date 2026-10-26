package com.di.tema1.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.di.tema1.ui.theme.TemaDI

// CAPA 2 · EL COMPOSABLE RAÍZ: describe toda la interfaz. Una pestaña por ejercicio.
@Composable
fun AppDI1() {
    val pestanas = listOf("Inicio", "Botones", "Layouts", "Perfil", "Estado", "Colores", "Catálogo", "Login", "Accesible")
    var seleccionada by rememberSaveable { mutableIntStateOf(0) }

    TemaDI {
        Surface(Modifier.fillMaxSize()) {
            Column(Modifier.safeDrawingPadding()) {
                // EJ14 · PASO 2: este texto está "quemado" en el código. Llévalo a strings.xml
                //   y usa  stringResource(R.string.titulo_app)
                Text(
                    "Desarrollo de Interfaces · Tema 1",
                    Modifier.padding(16.dp),
                    style = MaterialTheme.typography.titleLarge,
                )
                ScrollableTabRow(selectedTabIndex = seleccionada) {
                    pestanas.forEachIndexed { i, titulo ->
                        Tab(selected = i == seleccionada, onClick = { seleccionada = i }, text = { Text(titulo) })
                    }
                }
                when (pestanas[seleccionada]) {
                    "Inicio" -> InicioScreen()
                    "Botones" -> BotonesScreen()
                    "Layouts" -> LayoutsScreen()
                    "Perfil" -> PerfilScreen()
                    "Estado" -> EstadoScreen()
                    "Colores" -> ColoresScreen()
                    "Catálogo" -> CatalogoScreen()
                    "Login" -> LoginScreen()
                    "Accesible" -> AccesibleScreen()
                }
            }
        }
    }
}
