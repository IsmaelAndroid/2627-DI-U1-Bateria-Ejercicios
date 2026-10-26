# Ej11 · Arregla los imports 🤖

**Apartado 5 · Librerías: Jetpack Compose** · ⏱️ 25 min

> 🎯 Para usar los componentes de una librería hay que **importarlos**. Vas a arreglar un fichero al que le faltan **todos** los `import`, primero con la ayuda del IDE y después entendiendo cada uno.

## Pasos

**PASO 1.** Copia [`FichaImports.kt.txt`](FichaImports.kt.txt) a la carpeta `AppDI1/app/src/main/java/com/di/tema1/ui/` y quítale el `.txt` del final: `FichaImports.kt`.

**PASO 2.** Ábrelo en Android Studio: está todo en **rojo**. Pon el cursor sobre cada palabra roja y pulsa **`Alt + Intro` → Import**. Ojo: si te ofrece varias opciones, elige la de **`androidx.compose`** (no la de `java.awt` ni la de `android.widget`).

> 💡 Para `by remember`, el IDE también necesita `getValue` y `setValue`. Si `by` sigue en rojo, pulsa `Alt + Intro` sobre él.

**PASO 3.** Compila (**Build → Make Project**, `Ctrl + F9`): no debe quedar ningún error.

**PASO 4.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

*Build → Make Project* termina con **BUILD SUCCESSFUL**.
