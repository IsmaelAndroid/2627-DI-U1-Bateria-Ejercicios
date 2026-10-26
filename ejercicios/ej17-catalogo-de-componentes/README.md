# Ej17 · El autocompletado es la paleta 🤖

**Apartados 8.3 y 8.4 · Catálogo de componentes, parámetros = propiedades** · ⏱️ 45 min

> 🎯 En Compose no hay paleta para arrastrar: los componentes se insertan **escribiendo** y el **autocompletado** (`Ctrl + Espacio`) hace de paleta. Las **propiedades** de cada componente son los **parámetros** de su función.

## Pasos

Construye la pestaña **Catálogo** de AppDI1 (en `ui/Pantallas.kt`, busca **`EJ17`**). Sustituye el `Pendiente(...)` por una `Column` con scroll (`Modifier.verticalScroll(rememberScrollState())`) que contenga, **escribiendo cada componente con el autocompletado**:

1. Un **`Text`** con `style = MaterialTheme.typography.titleMedium`.
2. Un **`Button`** normal y otro con **`enabled = false`**.
3. Un **`OutlinedTextField`** con `label` y su estado: `var nombre by remember { mutableStateOf("") }`.
4. Un **`Checkbox`** con un texto al lado (dentro de un `Row`).
5. Un **`Switch`** con un texto al lado.
6. Un **`Slider`** y un texto que muestre su valor en %.
7. Un **`Icon`** con `painterResource(R.drawable.ic_launcher_foreground)` y su `contentDescription`.

> 💡 Escribe `But` y pulsa `Ctrl + Espacio`: verás `Button` con sus parámetros. Pulsa **`Ctrl + P`** dentro de los paréntesis para ver qué parámetros admite.

Después rellena la tabla de [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

En la pestaña **Catálogo** se ven los 7 tipos de componente y **todos funcionan**: se escribe en el campo, se marca la casilla, se mueve el deslizador…
