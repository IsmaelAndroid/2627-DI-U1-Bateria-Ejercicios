# Ej08 · El fallo típico de la UI imperativa 🟣

**PDF apartado 4 · El cambio de paradigma** · ⏱️ 30 min

> 🎯 Con la UI **imperativa** (Swing, vistas XML) tú creas los componentes y **los modificas a mano** (`etiqueta.setTexto(...)`). El fallo típico es **olvidarse de actualizar la vista** en algún sitio: los datos cambian, pero la pantalla no. Vas a encontrar ese fallo y ver cómo el enfoque **declarativo** lo evita.

## Pasos

**PASO 1.** Ejecuta [`Imperativo.kt`](Imperativo.kt) **sin cambiar nada** y mira la salida. Hay una línea en la que la pantalla **miente**.

```bash
./ejecutar.sh ejercicios/ej08-fallo-imperativo/Imperativo.kt
```

**PASO 2.** Busca el fallo en el código imperativo y anótalo en [`RESPUESTAS.md`](RESPUESTAS.md). **No lo arregles todavía.**

**PASO 3.** Completa la parte **declarativa** del fichero (busca `PASO 3`), en la que la pantalla se calcula siempre a partir del estado.

**PASO 4.** Ahora sí, arregla el fallo de la parte imperativa.

## ✅ Comprueba

Al final, las dos versiones muestran lo mismo:

```text
--- Imperativo ---
Pulsa +1        -> pantalla: Likes: 1 | datos: 1
Pulsa +1        -> pantalla: Likes: 2 | datos: 2
Pulsa Reiniciar -> pantalla: Likes: 0 | datos: 0
--- Declarativo ---
Pulsa +1        -> pantalla: Likes: 1 | datos: 1
Pulsa +1        -> pantalla: Likes: 2 | datos: 2
Pulsa Reiniciar -> pantalla: Likes: 0 | datos: 0
```
