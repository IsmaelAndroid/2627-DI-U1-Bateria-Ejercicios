# Ej26 · Los colores de Material Design 3 🤖

**PDF apartado 7 · El color y Material Design 3** · ⏱️ 45 min

> 🎯 Ver los **roles de color** de Material 3 (primary/onPrimary, surface/onSurface…), cambiar entre **modo claro y oscuro** con un interruptor y activar el **color dinámico** de Android 12+.

## Pasos

**PASO 1. El modo oscuro es estado.** En `ui/AppDI1.kt`, crea el estado:

```kotlin
val sistemaOscuro = isSystemInDarkTheme()
var oscuro by rememberSaveable { mutableStateOf(sistemaOscuro) }
```
y pásalo al tema: `TemaDI(oscuro = oscuro) { ... }`.

**PASO 2. La pantalla.** En `ui/Pantallas.kt` (busca **`EJ26`**) cambia la firma a `fun ColoresScreen(oscuro: Boolean, alCambiarOscuro: (Boolean) -> Unit)` y dibuja:
- una `Row` con `Text("Modo oscuro")` y un `Switch(checked = oscuro, onCheckedChange = alCambiarOscuro)`,
- una **muestra** por cada pareja de colores: un `Box` de 48 dp con `background(fondo)` y un `Text` con el color «on» encima. Parejas: `primary/onPrimary`, `primaryContainer/onPrimaryContainer`, `secondary/onSecondary`, `surface/onSurface`, `background/onBackground` y `error/onError`.

En `AppDI1.kt`, llama a la pantalla así: `ColoresScreen(oscuro = oscuro, alCambiarOscuro = { oscuro = it })`.

**PASO 3. Color dinámico.** En `ui/theme/Tema.kt` (busca **`EJ26`**), si el dispositivo tiene Android 12 o superior, usa la paleta del fondo de pantalla:

```kotlin
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
    val contexto = LocalContext.current
    if (oscuro) dynamicDarkColorScheme(contexto) else dynamicLightColorScheme(contexto)
}
```

**PASO 4.** Ejecuta. Cambia el **fondo de pantalla** del emulador (mantén pulsado el escritorio → *Wallpaper & style*) y vuelve a la app: los colores cambian.

**PASO 5.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

Al activar el interruptor, **toda la app** se pone en modo oscuro, no solo esta pestaña.
