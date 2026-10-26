# Ej20 · Una app en todos los sistemas (KMP) 🤖

**Apartado 8.6 · Kotlin Multiplatform y Compose Multiplatform** · ⏱️ 60 min

> 🎯 Generar un proyecto **Kotlin Multiplatform** con el asistente de JetBrains y comprobar que **la misma interfaz Compose** funciona en **Android** y en **escritorio**.

## Pasos

**PASO 1.** Abre el asistente: [kmp.jetbrains.com](https://kmp.jetbrains.com/?android=true&desktop=true&includeTests=true). Marca **Android** y **Desktop**. *Project name:* `MiAppKmp`, *Project ID:* `com.di.miappkmp`. Pulsa **Download**.

**PASO 2.** Descomprime el ZIP **dentro de esta carpeta** (`ejercicios/ej20-kotlin-multiplatform/MiAppKmp`) y ábrelo con Android Studio (**File → Open**). Espera al *sync* (la primera vez tarda).

**PASO 3.** Localiza las carpetas de `composeApp/src/`: **`commonMain`**, **`androidMain`** y **`desktopMain`** (o `jvmMain`). Abre `commonMain/.../App.kt`: es la interfaz **compartida**.

**PASO 4. Ejecútala en escritorio.** En la terminal de Android Studio, dentro de `MiAppKmp`:

```bash
./gradlew :composeApp:run
```
(En Windows: `gradlew.bat :composeApp:run`.) Se abre una **ventana de escritorio** con la app.

**PASO 5. Ejecútala en Android**: elige la configuración *composeApp* y el emulador, y pulsa ▶️.

**PASO 6.** En `App.kt`, cambia el texto del botón por `Pulsa aquí, <tu nombre>`. Vuelve a ejecutar en escritorio y en Android: el cambio sale **en los dos**.

**PASO 7.** Haz capturas (`escritorio.png`, `android.png`) y contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

> ⚠️ Para no subir cientos de megas, comprueba que el `.gitignore` del proyecto excluye `build/` y `.gradle/`.
