# Ej13 · El edificio y la decoración 🤖

**Apartado 7 · La actividad y el composable raíz** · ⏱️ 30 min

> 🎯 Distinguir las dos capas de una app con Compose: la **actividad** (el *edificio*: la gestiona Android) y el **composable raíz** (la *decoración*: lo que se dibuja). El único punto de contacto es **`setContent { }`**.

## Pasos

**PASO 1.** Abre `AppDI1/app/src/main/java/com/di/tema1/MainActivity.kt` y `ui/AppDI1.kt`. Léelos con los comentarios.

**PASO 2. Provoca el error típico.** En `MainActivity.kt`, en el sitio marcado con **`EJ13 · PASO 2`** (fuera de `setContent`), escribe `Text("Hola")` y añade su import. Compila (`Ctrl + F9`) y **copia el error**.

**PASO 3.** Borra esa línea y comprueba que vuelve a compilar.

**PASO 4.** Busca en `AndroidManifest.xml` dónde está **registrada** la actividad.

**PASO 5.** Rellena la tabla de [`RESPUESTAS.md`](RESPUESTAS.md).
