# 🎨 Batería de ejercicios · Tema 1 · Desarrollo de Interfaces

**Desarrollo de Interfaces · 2º DAM** · IES Rafael Alberti · Curso 2026-27

> 🎯 **Para qué sirve:** son **30 ejercicios para aprender y repasar** el tema 1, *Introducción a la confección de interfaces*. **No cuentan para nota.** Son tu entrenamiento para las prácticas y el examen.
>
> 📚 **Teoría:** [revilofe · DI · U1.1 Introducción a la confección de interfaces](https://revilofe.github.io/section6/u01/teoria/DI-U1.1.-IntroduccionConfeccionInterfaces/) y el PDF *Tema 1: Diseño de Interfaces y Entornos Declarativos* de Moodle.

Hay **tres tipos** de ejercicios:

| Tipo | Qué es | Dónde se hace |
|---|---|---|
| 🟣 **Kotlin** | Un programa de consola (`fun main()`) en un único `.kt`, con los pasos comentados (`// PASO 1`…) | Codespaces, Android Studio o [play.kotlinlang.org](https://play.kotlinlang.org) |
| 🤖 **Android** | Una pantalla de la app **[AppDI1](AppDI1)**: busca los comentarios `// EJ23 · PASO 1`… | **Android Studio** |
| ✏️ **Diseño** | Bocetos, wireframes y análisis | Papel, [Excalidraw](https://excalidraw.com) o [Figma](https://figma.com) |

Cada ejercicio tiene su carpeta en `ejercicios/` con un **`README.md`** paso a paso y la salida o el resultado que debes obtener. Algunos tienen un **`RESPUESTAS.md`** para contestar con tus palabras.

> 🖼️ **AppDI1** tiene una **pestaña por ejercicio** (Inicio, Botones, Layouts, Perfil…). Al principio cada pestaña solo dice «Ejercicio NN: pendiente»: tú la vas construyendo.

---

## 🚀 Cómo empezar

### Paso 1 · Haz tu copia (solo la primera vez)

1. Entra en GitHub con **tu cuenta**.
2. Arriba a la derecha pulsa **`Use this template` → `Create a new repository`**.
3. Deja **tu usuario** como *Owner*, llámalo `DI-U1-Bateria-Ejercicios` y pulsa **`Create repository`**.

Trabaja **siempre en tu copia**.

### Paso 2 · Ábrela

- **🤖 Android:** en Android Studio, **File → New → Project from Version Control** con la URL de tu copia; después **File → Open → `AppDI1`**. Espera al *Gradle sync*.
- **🟣 Kotlin**, elige una opción:
  - **Codespaces**: en tu copia, **`<> Code` → `Codespaces` → `Create codespace on main`** (trae Java y `kotlinc`) y ejecuta:
    ```bash
    ./ejecutar.sh ejercicios/ej01-alto-y-bajo-nivel/Maquina.kt
    ```
  - **Android Studio**: **File → New → Scratch File → Kotlin**, pega el código y pulsa ▶️.
  - **Navegador**: [play.kotlinlang.org](https://play.kotlinlang.org).

---

## 📌 La regla de los commits

- **Un commit al terminar cada ejercicio**: `Ej23: Column, Row y Box`.
- **`git push` al final de cada clase** (en Android Studio: `Ctrl + K` y `Ctrl + Mayús + K`).

---

## 🗺️ Índice de ejercicios

| Nº | Ejercicio | Tipo | Apartado |
|---|---|---|---|
| **1-3** | **Lenguajes y paradigmas** | | |
| 01 | [Alto y bajo nivel: una máquina de juguete](ejercicios/ej01-alto-y-bajo-nivel) | 🟣 Kotlin | 1 |
| 02 | [Del monolito a las funciones](ejercicios/ej02-del-monolito-a-funciones) | 🟣 Kotlin | 2 |
| 03 | [Imperativo o declarativo](ejercicios/ej03-imperativo-o-declarativo) | 🟣 Kotlin | 2 |
| 04 | [Componentes como objetos](ejercicios/ej04-componentes-como-objetos) | 🟣 Kotlin | 3 |
| 05 | [Programación basada en eventos](ejercicios/ej05-eventos) | 🟣 Kotlin | 3 |
| 06 | [Componentes reutilizables](ejercicios/ej06-componentes-reutilizables) | 🟣 Kotlin | 3 |
| 07 | [UI = f(State)](ejercicios/ej07-ui-funcion-del-estado) | 🟣 Kotlin | PDF 4 |
| 08 | [El fallo típico de la UI imperativa](ejercicios/ej08-fallo-imperativo) | 🟣 Kotlin | PDF 4 |
| **4-6** | **Herramientas, librerías e instalación** | | |
| 09 | [¿Qué herramienta elegirías?](ejercicios/ej09-que-herramienta) | 📝 Análisis | 4 |
| 10 | [Tu Android Studio por dentro](ejercicios/ej10-tu-android-studio) | 🤖 Android | 6 |
| 11 | [Arregla los imports](ejercicios/ej11-arregla-los-imports) | 🤖 Android | 5 |
| **7** | **Primer proyecto: actividad y composable** | | |
| 12 | [Tu primer proyecto desde cero](ejercicios/ej12-primer-proyecto) | 🤖 Android | 7 |
| 13 | [El edificio y la decoración](ejercicios/ej13-actividad-y-composable) | 🤖 Android | 7 |
| 14 | [Textos fuera del código](ejercicios/ej14-textos-en-strings) | 🤖 Android | 7.1 |
| 15 | [Añade una dependencia con Gradle](ejercicios/ej15-dependencia-gradle) | 🤖 Android | 7.1 |
| **8** | **El entorno de diseño de Android Studio** | | |
| 16 | [Previews a la carta](ejercicios/ej16-previews) | 🤖 Android | 8.2 |
| 17 | [El autocompletado es la paleta](ejercicios/ej17-catalogo-de-componentes) | 🤖 Android | 8.3-8.4 |
| 18 | [Inspecciona la jerarquía](ejercicios/ej18-layout-inspector) | 🤖 Android | 8.4 |
| 19 | [¿Qué plantilla elijo?](ejercicios/ej19-que-plantilla) | 🟣 Kotlin | 8.5 |
| 20 | [Una app en todos los sistemas (KMP)](ejercicios/ej20-kotlin-multiplatform) | 🤖 Android | 8.6 |
| **9-10** | **Casos prácticos y layouts** | | |
| 21 | [Caso práctico 1: una pantalla](ejercicios/ej21-caso-una-pantalla) | 🤖 Android | 9 |
| 22 | [Caso práctico 2: dos botones](ejercicios/ej22-caso-dos-botones) | 🤖 Android | 10 |
| 23 | [Column, Row y Box](ejercicios/ej23-column-row-box) | 🤖 Android | PDF 3.1 |
| 24 | [TarjetaSaludo y PerfilUsuario](ejercicios/ej24-tarjeta-y-perfil) | 🤖 Android | PDF 6 |
| 25 | [Estado y recomposición](ejercicios/ej25-estado-y-recomposicion) | 🤖 Android | PDF 4 |
| **Diseño** | **IPO, prototipado, color y accesibilidad** | | |
| 26 | [Los colores de Material Design 3](ejercicios/ej26-colores-material3) | 🤖 Android | PDF 7 |
| 27 | [Del boceto al wireframe](ejercicios/ej27-boceto-y-wireframe) | ✏️ Diseño | PDF 3 |
| 28 | [Del wireframe a Compose: Login](ejercicios/ej28-login-en-compose) | 🤖 Android | PDF 3 y 8 |
| 29 | [¿Se lee bien? Contraste de colores](ejercicios/ej29-contraste) | 🟣 Kotlin | PDF 2 |
| 30 | [Una pantalla accesible](ejercicios/ej30-accesibilidad) | 🤖 Android | PDF 2 |

---

## 🆘 Si te atascas

1. Vuelve a leer el paso: la pista suele estar en el comentario.
2. Si algo sale en **rojo** en Android Studio, pon el cursor encima y pulsa **`Alt + Intro`** (suele faltar un `import`).
3. Lee el error entero en la pestaña **Build**.
4. Pregunta a tu compañero o compañera y, después, al profesor.
