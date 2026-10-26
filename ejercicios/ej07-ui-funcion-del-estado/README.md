# Ej07 · UI = f(State) 🟣

**PDF apartado 4 · De imperativo a declarativo** · ⏱️ 40 min

> 🎯 La fórmula de Compose es **UI = f(State)**: la interfaz es el **resultado de una función** aplicada al **estado**. No se modifica la vista: se cambia el estado y la vista se **vuelve a calcular** (se **recompone**). Y si el estado **no cambia**, no hace falta recomponer.

```text
 evento ──▶ reducir(estado, evento) ──▶ nuevo estado ──▶ render(estado) ──▶ "pantalla"
```

## Pasos

Completa [`Carrito.kt`](Carrito.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej07-ui-funcion-del-estado/Carrito.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
Inicio      -> Carrito: 0 ud · 0.00 €
AÑADIR      -> recompone: Carrito: 1 ud · 12.00 €
AÑADIR      -> recompone: Carrito: 2 ud · 24.00 €
QUITAR      -> recompone: Carrito: 1 ud · 12.00 €
QUITAR      -> recompone: Carrito: 0 ud · 0.00 €
QUITAR      -> sin cambios: no se recompone
CUPON       -> recompone: Carrito: 0 ud · 0.00 € (cupón -10 %)
AÑADIR      -> recompone: Carrito: 1 ud · 10.80 € (cupón -10 %)
Recomposiciones: 6 de 7 eventos
```
