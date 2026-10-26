# Ej30 · Una pantalla accesible 🤖

**PDF apartado 2 · Accesibilidad inclusiva** · ⏱️ 45 min

> 🎯 La pestaña **Accesible** de AppDI1 funciona, pero **no es accesible**. Vas a encontrar sus problemas con **TalkBack** (el lector de pantalla de Android) y la **preview con texto grande**, y a arreglarlos.

## Pasos

**PASO 1.** Abre `ui/Accesible.kt` y ejecuta la app en la pestaña **Accesible**.

**PASO 2. Escúchala.** En el emulador: **Settings → Accessibility → TalkBack → On**. (Con TalkBack se navega deslizando un dedo y se activa con doble toque.) Recorre la pantalla y anota qué lee y qué **no** lee. Después **desactívalo**.

**PASO 3.** Encuentra los **5 problemas** y anótalos en [`RESPUESTAS.md`](RESPUESTAS.md). Pistas:
- ¿Qué dice TalkBack de la imagen pulsable?
- ¿Cuánto mide la zona que hay que tocar?
- ¿Se lee bien el gris claro sobre blanco? (Calcúlalo con el **ejercicio 29**.)
- ¿Qué hace la «x»? ¿Lo sabría alguien que no ve la pantalla?
- ¿El título es un título para TalkBack?

**PASO 4. Arréglalos:**
- `IconButton` en lugar de `Modifier.clickable` sobre la imagen (da **48 dp** de zona táctil),
- `contentDescription = "Añadir a favoritos"`,
- colores del tema (`MaterialTheme.colorScheme.onSurface`) en lugar del gris,
- un `TextButton("Quitar de favoritos")` en lugar de la «x»,
- `Modifier.semantics { heading() }` en el título y estilos de `MaterialTheme.typography`.

**PASO 5.** Vuelve a recorrerla con TalkBack y contesta las preguntas.

## ✅ Comprueba

Con TalkBack, la pantalla se entiende **sin mirarla**: «Oferta del día, encabezado», «Añadir a favoritos, botón», «Quitar de favoritos, botón».
