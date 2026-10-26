// Ej19 · ¿Qué plantilla elijo?

enum class Plantilla(val genera: String) {
    NO_ACTIVITY("solo la estructura del proyecto, sin pantallas"),
    EMPTY_ACTIVITY("una actividad con Compose y un composable vacío"),
    GEMINI_API("una actividad conectada a la IA de Google (Gemini)"),
    NAVIGATION_UI_ACTIVITY("una actividad con menú de navegación y varias pantallas"),
    BASIC_VIEWS_ACTIVITY("una actividad con vistas XML clásicas y menú básico"),
    EMPTY_VIEWS_ACTIVITY("una actividad con un layout XML vacío"),
    RESPONSIVE_VIEWS_ACTIVITY("una actividad adaptativa a móvil, tablet y escritorio con vistas"),
    GAME_ACTIVITY_CPP("un proyecto de videojuego con motor en C++"),
    NATIVE_CPP("una app con código nativo C++ (NDK) enlazado con Kotlin"),
}

// PASO 2: cambia cada EMPTY_ACTIVITY por la plantilla correcta (cada caso usa una distinta)
val respuestas = mapOf(
    "Empezar desde cero una pantalla con Jetpack Compose" to Plantilla.EMPTY_ACTIVITY,
    "Una app con Inicio, Perfil y Ajustes en una barra inferior" to Plantilla.EMPTY_ACTIVITY,
    "Mantener una app antigua hecha con layouts XML vacíos" to Plantilla.EMPTY_ACTIVITY,
    "Una librería de componentes, sin ninguna pantalla" to Plantilla.EMPTY_ACTIVITY,
    "Un juego 3D en C++" to Plantilla.EMPTY_ACTIVITY,
    "Un chat que responde con IA generativa" to Plantilla.EMPTY_ACTIVITY,
    "Reutilizar una librería de procesado de audio escrita en C++" to Plantilla.EMPTY_ACTIVITY,
    "Una app con vistas XML que se adapte a móvil, tablet y escritorio" to Plantilla.EMPTY_ACTIVITY,
)

fun main() {
    // PASO 3: muestra cada caso con su plantilla y lo que genera:
    //   "Un juego 3D en C++ -> GAME_ACTIVITY_CPP (un proyecto de videojuego con motor en C++)"
    //   y al final:  "Plantillas distintas usadas: 8 de 9"

}
