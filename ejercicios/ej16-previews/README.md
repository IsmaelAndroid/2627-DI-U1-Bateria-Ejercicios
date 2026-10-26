# Ej16 · Previews a la carta 🤖

**Apartado 8.2 · La vista de diseño: Code, Split y Design** · ⏱️ 35 min

> 🎯 Ver un componente **sin ejecutar la app**, con `@Preview`, y probarlo en varias situaciones a la vez: tema claro y oscuro, pantalla estrecha y **texto grande** (accesibilidad).

> ⚠️ Necesitas haber hecho el **ejercicio 15**.

## Pasos

**PASO 1.** Abre `ui/componentes/TarjetaSaludo.kt` (busca **`EJ16`**) y añade, debajo de la tarjeta:

```kotlin
@Preview(name = "Clara", showBackground = true)
@Composable
fun PreviewTarjetaClara() {
    TemaDI(oscuro = false) { TarjetaSaludo("Ana") }
}
```

**PASO 2.** Cambia a la vista **Split** (arriba a la derecha del editor) y pulsa **Build & Refresh** si te lo pide.

**PASO 3.** Añade **dos previews más**:
- `"Oscura"`: con `TemaDI(oscuro = true)` y `backgroundColor = 0xFF000000`.
- `"Texto grande y estrecha"`: con `fontScale = 1.5f`, `widthDp = 280` y un nombre largo, `"María del Carmen"`.

**PASO 4.** Prueba la **Live Edit**: cambia el texto de la tarjeta y mira cómo se actualizan las tres previews.

**PASO 5.** Haz una captura de la vista Split con las tres previews (`captura.png`) y contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

En la vista Split se ven **tres** tarjetas: clara, oscura y con texto grande.
