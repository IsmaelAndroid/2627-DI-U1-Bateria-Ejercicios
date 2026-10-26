// Ej07 · UI = f(State)
import java.util.Locale

// El ESTADO: inmutable (val). Para "cambiarlo" se crea uno nuevo con copy().
data class EstadoCarrito(val unidades: Int = 0, val cupon: Boolean = false)

enum class Evento { AÑADIR, QUITAR, CUPON }

const val PRECIO = 12.0

// PASO 1: la función f de UI = f(State). Debe ser PURA: el mismo estado da siempre el mismo texto.
//   Calcula el importe (unidades * PRECIO, con un 10 % menos si hay cupón) y devuelve:
//     "Carrito: 1 ud · 10.80 € (cupón -10 %)"   (sin el paréntesis si no hay cupón)
//   Para el importe usa  String.format(Locale.US, "%.2f", importe)
fun render(e: EstadoCarrito): String {
    return ""
}

// PASO 2: el "reductor": recibe el estado y un evento y DEVUELVE el estado nuevo (sin modificar nada):
//   AÑADIR -> una unidad más · QUITAR -> una menos, pero nunca por debajo de 0 (coerceAtLeast(0))
//   CUPON  -> invierte cupon (activa/desactiva)
fun reducir(e: EstadoCarrito, evento: Evento): EstadoCarrito {
    return e
}

fun main() {
    val eventos = listOf(Evento.AÑADIR, Evento.AÑADIR, Evento.QUITAR, Evento.QUITAR,
                         Evento.QUITAR, Evento.CUPON, Evento.AÑADIR)
    var estado = EstadoCarrito()
    var recomposiciones = 0
    println("${"Inicio".padEnd(12)}-> ${render(estado)}")

    // PASO 3: para cada evento:
    //   - calcula val nuevo = reducir(estado, evento)
    //   - si nuevo == estado  ->  muestra "QUITAR      -> sin cambios: no se recompone"
    //   - si no               ->  suma 1 a recomposiciones, muestra "AÑADIR      -> recompone: " + render(nuevo)
    //   - estado = nuevo
    //   Pista: evento.name.padEnd(12)


    // PASO 4: muestra  "Recomposiciones: 6 de 7 eventos"

}
