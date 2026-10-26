# Ej23 · Column, Row y Box 🤖

**PDF apartado 3.1 · Arquitectura de la información y layouts** · ⏱️ 45 min

> 🎯 Dominar los **tres contenedores básicos** de Compose reproduciendo la **Figura 1** del tema:

```text
Column            Row                    Box (apilado)
┌────────┐        ┌──────────────────┐   ┌──────────────────┐
│ ██████ │        │ ████  ████  ████ │   │   ███████●████   │
│ ██████ │        └──────────────────┘   └──────────────────┘
│ ██████ │                                 círculo rojo ENCIMA
└────────┘                                 de la barra naranja
```

## Pasos

En `ui/Pantallas.kt` busca **`EJ23`** y construye la pantalla **Layouts**:

**PASO 1.** Una `Column` con scroll y separación de 8 dp. Dentro, un título `Text("Column")` y una `Column` con **tres cajas azules** (`0xFF3B82F6`) de 32 dp de alto y todo el ancho.

> 💡 Una «caja» es `Box(Modifier.fillMaxWidth().height(32.dp).background(Color(0xFF3B82F6)))`. Crea una función `@Composable fun Caja(color: Color, modifier: Modifier = Modifier)` para no repetir.

**PASO 2.** `Text("Row")` y una `Row` con **tres cajas verdes** (`0xFF10B981`) que se repartan el ancho a partes iguales con **`Modifier.weight(1f)`**.

**PASO 3.** `Text("Box (apilado)")` y un `Box` de 80 dp de alto con `contentAlignment = Alignment.Center` que contenga, **en este orden**:
- una barra naranja (`0xFFF59E0B`) de 180 × 40 dp,
- un círculo rojo (`0xFFEF4444`) de 24 dp: `Modifier.size(24.dp).clip(CircleShape).background(...)`.

**PASO 4.** Ponle a cada contenedor un borde gris para verlo: `Modifier.border(1.dp, Color.Gray).padding(8.dp)`.

**PASO 5.** Cambia el **orden** de la barra y el círculo dentro del `Box`. ¿Qué pasa? Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).
