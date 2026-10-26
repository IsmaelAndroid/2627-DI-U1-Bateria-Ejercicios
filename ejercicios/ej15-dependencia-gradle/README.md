# Ej15 · Añade una dependencia con Gradle 🤖

**Apartado 7.1 · Gradle** · ⏱️ 20 min

> 🎯 **Gradle** es el sistema de construcción: descarga las librerías, compila y genera el APK. Vas a **añadir una dependencia** a la app: la librería que hace funcionar las **vistas previas** (`@Preview`), que la usarás en el ejercicio 16.

## Pasos

**PASO 1.** Abre `AppDI1/app/build.gradle.kts` (el del **módulo app**, no el del proyecto) y busca **`EJ15`**. Añade dentro de `dependencies { }`:

```kotlin
implementation("androidx.compose.ui:ui-tooling-preview")
debugImplementation("androidx.compose.ui:ui-tooling")
```

**PASO 2.** Arriba aparece una barra amarilla: **Sync Now**. Púlsala y espera.

**PASO 3.** Abre la ventana **Build** (abajo) y mira qué ha descargado Gradle.

**PASO 4.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

El *sync* termina sin errores y en un `.kt` ya puedes escribir `import androidx.compose.ui.tooling.preview.Preview` sin que salga en rojo.
