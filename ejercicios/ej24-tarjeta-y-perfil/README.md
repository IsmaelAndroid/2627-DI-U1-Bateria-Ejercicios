# Ej24 · TarjetaSaludo y PerfilUsuario 🤖

**PDF apartado 6 y Práctica 2 · Primer componente visual** · ⏱️ 35 min

> 🎯 **Reutilizar** el componente `TarjetaSaludo` del tema (ya está en `ui/componentes/TarjetaSaludo.kt`) dentro de una pantalla nueva, `PerfilUsuario`, como pide la Práctica 2 del PDF.

## Pasos

**PASO 1.** Lee `ui/componentes/TarjetaSaludo.kt`: identifica la `Card`, la `Column`, los dos `Text`, el `Spacer` y los colores del tema.

**PASO 2.** En `ui/Pantallas.kt` busca **`EJ24`** y crea un `@Composable fun PerfilUsuario()` con una `Column` centrada que contenga:
- un `Text` con el título de tu app, en estilo `headlineSmall`,
- `TarjetaSaludo("<tu nombre>")`,
- un `Button("Saludar")` que, al pulsarlo, escriba en Logcat: `Log.d("PERFIL", "¡Bienvenido/a al módulo!")`.

**PASO 3.** Haz que `PerfilScreen()` llame a `PerfilUsuario()`.

**PASO 4.** Ejecuta, pulsa el botón y míralo en Logcat (`tag:PERFIL`). Si hiciste el ejercicio 16, añade también una `@Preview` de `PerfilUsuario`.

**PASO 5.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).
