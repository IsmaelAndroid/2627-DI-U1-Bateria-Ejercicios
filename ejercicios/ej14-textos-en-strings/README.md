# Ej14 · Textos fuera del código 🤖

**Apartado 7.1 · La estructura del proyecto: `res/values/strings.xml`** · ⏱️ 25 min

> 🎯 Buena práctica: **ningún texto «quemado» en el código Kotlin**. Los textos van en `res/values/strings.xml`, para poder **traducir** la app cambiando un solo fichero.

## Pasos

**PASO 1.** Abre `app/src/main/res/values/strings.xml` (busca **`EJ14`**) y añade:

```xml
<string name="titulo_app">Desarrollo de Interfaces · Tema 1</string>
```

**PASO 2.** En `ui/AppDI1.kt` (busca **`EJ14 · PASO 2`**), cambia el texto escrito a mano por `stringResource(R.string.titulo_app)`. Importa `androidx.compose.ui.res.stringResource` y `com.di.tema1.R`.

**PASO 3.** Ejecuta: debe verse igual que antes.

**PASO 4. Traduce la app.** Clic derecho en `res/values/strings.xml` → **Open Translations Editor** → 🌐 **Add Locale** → *English (en)*. Escribe la traducción: `Interface Development · Unit 1`.

**PASO 5.** En el emulador, cambia el idioma a inglés (**Settings → System → Languages**) y abre la app. Después vuelve a ponerlo en español.

**PASO 6.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

Con el emulador en inglés, el título dice **Interface Development · Unit 1**.
