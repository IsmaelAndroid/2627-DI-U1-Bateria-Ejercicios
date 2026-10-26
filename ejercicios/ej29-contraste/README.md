# Ej29 · ¿Se lee bien? Contraste de colores 🟣

**PDF apartado 2 · Accesibilidad inclusiva** · ⏱️ 40 min

> 🎯 Una interfaz accesible tiene **suficiente contraste** entre el texto y el fondo. Las pautas **WCAG** lo miden con una fórmula: la **relación de contraste**, que va de **1:1** (mismo color) a **21:1** (negro sobre blanco). Vas a programarla.

| Nivel WCAG | Texto normal | Texto grande (≥ 18 pt o 14 pt en negrita) |
|---|---|---|
| **AA** (mínimo recomendado) | ≥ 4.5 | ≥ 3 |
| **AAA** (óptimo) | ≥ 7 | ≥ 4.5 |

## La fórmula

1. Cada canal (R, G, B, de 0 a 255) se pasa a 0-1 y se «linealiza»:
   `c = canal / 255` → si `c <= 0.03928`, entonces `c / 12.92`; si no, `((c + 0.055) / 1.055)^2.4`
2. **Luminancia**: `L = 0.2126 × R + 0.7152 × G + 0.0722 × B` (con los canales ya linealizados).
3. **Contraste** = `(L_clara + 0.05) / (L_oscura + 0.05)`

## Pasos

Completa [`Contraste.kt`](Contraste.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej29-contraste/Contraste.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

La primera línea debe ser exactamente:

```text
#000000 sobre #FFFFFF -> 21.00:1 · AAA
```
y el gris claro `#9E9E9E` sobre blanco **no** debe llegar a AA.
