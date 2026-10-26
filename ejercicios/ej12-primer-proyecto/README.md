# Ej12 · Tu primer proyecto desde cero 🤖

**Apartado 7 · Primer proyecto con Kotlin** · ⏱️ 40 min

> 🎯 Crear **un proyecto nuevo** con la plantilla **Empty Activity**, como harás en cada práctica, y ejecutarlo.

## Pasos

**PASO 1.** En Android Studio: **File → New → New Project → Phone and Tablet → Empty Activity → Next**.

**PASO 2.** Configúralo así y pulsa **Finish**:
- **Name:** `MiPrimeraInterfaz`
- **Package name:** `com.di.miprimerainterfaz`
- **Save location:** la carpeta `ejercicios/ej12-primer-proyecto/` **de tu repositorio**
- **Minimum SDK:** API 24
- **Build configuration language:** Kotlin DSL (`build.gradle.kts`)

**PASO 3.** Espera al *Gradle sync* y abre `MainActivity.kt`. Localiza:
- la **actividad** (`class MainActivity : ComponentActivity()`),
- el **puente** `setContent { ... }`,
- el **composable** de ejemplo `Greeting` y su **`@Preview`**.

**PASO 4.** Cambia `Greeting` para que diga `¡Hola, <tu nombre>!` y comprueba que la **preview** se actualiza (vista **Split**, arriba a la derecha del editor).

**PASO 5.** Ejecuta en el emulador (▶️). Haz una captura y guárdala aquí como `captura.png`.

**PASO 6.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

> ⚠️ Antes de hacer commit, comprueba que **no** subes la carpeta `build/` (el `.gitignore` del proyecto nuevo ya la excluye).
