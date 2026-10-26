# Ej22 · Caso práctico 2: dos botones 🤖

**Apartado 10 · Caso práctico «Creación de un botón»** · ⏱️ 30 min

> 🎯 Hacer el **caso práctico 2** (dos botones, *Aceptar* y *Cancelar*) y darle **comportamiento**: mostrar qué botón se ha pulsado y escribirlo en **Logcat**.

## Pasos

**PASO 1.** En `ui/Pantallas.kt` busca **`EJ22`**. Crea una `Column` centrada que contenga:
- una `Row` con un `Button("Aceptar")` y un `OutlinedButton("Cancelar")` separados 16 dp (`horizontalArrangement = Arrangement.spacedBy(16.dp)`),
- debajo, un `Text("Has pulsado: ...")`.

**PASO 2.** Crea el estado `var ultimo by remember { mutableStateOf("ninguno") }` y, en el `onClick` de cada botón, cámbialo y escribe en el log:

```kotlin
Log.d("BOTONES", "Pulsado Aceptar")
```

**PASO 3.** Ejecuta, pulsa los botones y mira **Logcat** filtrando por `tag:BOTONES`.

**PASO 4.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
┌─────────────────────────────┐
│    [Aceptar]  (Cancelar)    │
│    Has pulsado: Cancelar    │
└─────────────────────────────┘
```
Y en Logcat: `D  Pulsado Cancelar`.
