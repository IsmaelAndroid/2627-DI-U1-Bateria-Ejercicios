// Ej29 · ¿Se lee bien? Contraste de colores
import java.util.Locale
import kotlin.math.pow

// PASO 1: escribe  fun canal(valor: Int): Double  que linealice un canal (0-255) con la fórmula del README.


// PASO 2: escribe  fun luminancia(hex: String): Double
//   "#6750A4" -> r = hex.substring(1, 3).toInt(16), g = hex.substring(3, 5)..., b = hex.substring(5, 7)...
//   y devuelve 0.2126 * canal(r) + 0.7152 * canal(g) + 0.0722 * canal(b)


// PASO 3: escribe  fun contraste(texto: String, fondo: String): Double
//   con la luminancia más alta arriba:  (max + 0.05) / (min + 0.05)


// PASO 4: escribe  fun nivel(ratio: Double): String  -> "AAA" (≥ 7), "AA" (≥ 4.5), "AA texto grande" (≥ 3)
//         o "NO accesible"


fun main() {
    val parejas = listOf(
        "#000000" to "#FFFFFF",   // negro sobre blanco
        "#757575" to "#FFFFFF",   // gris medio sobre blanco
        "#9E9E9E" to "#FFFFFF",   // gris claro sobre blanco
        "#FFFFFF" to "#6750A4",   // texto blanco sobre el "primary" morado de Material 3
        "#1D1B20" to "#FEF7FF",   // "onSurface" sobre "surface" de Material 3
        "#FFEB3B" to "#FFFFFF",   // amarillo sobre blanco
    )
    // PASO 5: para cada pareja muestra:  "#000000 sobre #FFFFFF -> 21.00:1 · AAA"
    //   Usa String.format(Locale.US, "%.2f", ratio)

}
