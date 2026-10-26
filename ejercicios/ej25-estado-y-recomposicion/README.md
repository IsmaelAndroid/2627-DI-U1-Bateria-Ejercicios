# Ej25 · Estado y recomposición 🤖

**PDF apartado 4 · UI = f(State)** · ⏱️ 40 min

> 🎯 Llevar a Android lo del ejercicio 07: un **estado** (`likes`), una UI que **depende** de él y ver en **Logcat** cada vez que Compose **recompone** la pantalla.

## Pasos

En `ui/Pantallas.kt` busca **`EJ25`** y crea la pantalla **Estado**:

**PASO 1.** El estado: `var likes by remember { mutableIntStateOf(0) }`.

**PASO 2.** Para ver las recomposiciones, justo debajo:

```kotlin
SideEffect { Log.d("RECOMPOSICION", "EstadoScreen se ha recompuesto con likes = $likes") }
```

**PASO 3.** Una `Column` centrada con:
- `Text("$likes ❤")` en estilo `displayMedium`,
- **solo si** `likes >= 5`: `Text("¡Publicación popular!")`,
- una `Row` con un `Button` «Me gusta» que sume 1 y que esté **deshabilitado** cuando llegue a 10 (`enabled = likes < 10`), y un `OutlinedButton` «Reiniciar».

**PASO 4.** Ejecuta y filtra Logcat por `tag:RECOMPOSICION`. Pulsa «Me gusta» varias veces, después «Reiniciar» **dos veces seguidas**.

**PASO 5.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).
