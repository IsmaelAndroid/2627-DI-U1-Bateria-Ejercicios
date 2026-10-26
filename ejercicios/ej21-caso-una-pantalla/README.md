# Ej21 · Caso práctico 1: una pantalla 🤖

**Apartado 9 · Caso práctico «Creación de una pantalla»** · ⏱️ 20 min

> 🎯 Hacer en AppDI1 el **caso práctico 1** del tema: una pantalla con un texto **centrado**, escrita solo con código.

## Pasos

**PASO 1.** En `ui/Pantallas.kt` busca **`EJ21`** y sustituye `Pendiente(...)` por:
- una `Column` que ocupe toda la pantalla (`Modifier.fillMaxSize()`),
- centrada en vertical (`verticalArrangement = Arrangement.Center`) y en horizontal (`horizontalAlignment = Alignment.CenterHorizontally`),
- con un `Text("Mi primera interfaz")` en estilo `headlineMedium`.

> Como la función ya no es de una línea, cambia `fun InicioScreen() = Pendiente(...)` por `fun InicioScreen() { ... }`.

**PASO 2.** Ejecuta y ve a la pestaña **Inicio**.

**PASO 3.** **Mejora** (ejercicio 14): lleva el texto a `strings.xml` como `mi_primera_interfaz`.

**PASO 4.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
┌─────────────────────────┐
│                         │
│   Mi primera interfaz   │
│                         │
└─────────────────────────┘
```
