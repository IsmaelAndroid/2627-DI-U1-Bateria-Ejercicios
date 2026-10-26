# Ej28 · Del wireframe a Compose: Login 🤖

**PDF apartados 3 y 8 · Del diseño al código** · ⏱️ 60 min

> 🎯 Programar la pantalla de **inicio de sesión** que diseñaste en el **ejercicio 27**, con su estado y una **regla de validación** que se pueda probar.

## Pasos

**PASO 1. La regla, fuera de la UI.** Crea `util/Validacion.kt` (paquete `com.di.tema1.util`) con:

```kotlin
fun puedeIniciarSesion(usuario: String, clave: String): Boolean =
    usuario.isNotBlank() && clave.length >= 4
```

**PASO 2. La pantalla.** En `ui/Pantallas.kt` busca **`EJ28`**. Siguiendo tu wireframe, crea una `Column` centrada con márgenes de 16 dp y separación de 16 dp que tenga:
- el título o logo,
- un `OutlinedTextField` **Usuario** (`singleLine = true`, todo el ancho),
- un `OutlinedTextField` **Contraseña** con `visualTransformation = PasswordVisualTransformation()` y un botón «Ver/Ocultar» en `trailingIcon`,
- un `Button` **Iniciar sesión** de todo el ancho, **habilitado solo** si `puedeIniciarSesion(usuario, clave)`,
- un `TextButton` **¿Has olvidado la contraseña?**,
- un `Text` con un mensaje al pulsar (`"Bienvenido/a, $usuario"`).

Usa `rememberSaveable` para el usuario y la contraseña (no se pierden al girar el móvil).

**PASO 3. Pruébalo.** Crea `app/src/test/java/com/di/tema1/ValidacionTest.kt` con 4 pruebas: vacío, solo espacios, contraseña de 3 caracteres y datos correctos. Clic derecho → **Run**.

**PASO 4.** Ejecuta la app, compara con tu wireframe y contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

- El botón está **gris** hasta que escribes un usuario y una contraseña de 4 o más caracteres.
- Las 4 pruebas pasan ✅.
