package com.di.tema1.ui

import androidx.compose.runtime.Composable
import com.di.tema1.ui.componentes.Pendiente

// Cada pestaña de la app. Los ejercicios te piden SUSTITUIR el Pendiente(...) por la pantalla de verdad.
// Si lo prefieres, mueve cada pantalla a su propio fichero (InicioScreen.kt, BotonesScreen.kt...).

// EJ21 · Caso práctico 1: una pantalla con un texto centrado
@Composable
fun InicioScreen() = Pendiente(21, "Una pantalla")

// EJ22 · Caso práctico 2: dos botones
@Composable
fun BotonesScreen() = Pendiente(22, "Dos botones")

// EJ23 · Column, Row y Box
@Composable
fun LayoutsScreen() = Pendiente(23, "Column, Row y Box")

// EJ24 · TarjetaSaludo y PerfilUsuario
@Composable
fun PerfilScreen() = Pendiente(24, "Perfil de usuario")

// EJ25 · Estado y recomposición
@Composable
fun EstadoScreen() = Pendiente(25, "Estado y recomposición")

// EJ26 · Los colores de Material Design 3
@Composable
fun ColoresScreen() = Pendiente(26, "Colores de Material 3")

// EJ17 · El autocompletado es la paleta
@Composable
fun CatalogoScreen() = Pendiente(17, "Catálogo de componentes")

// EJ28 · Del wireframe a Compose: Login
@Composable
fun LoginScreen() = Pendiente(28, "Pantalla de login")

// EJ30 · Una pantalla accesible
@Composable
fun AccesibleScreen() = AccesibleSinArreglar()
