// Ej02 · Del monolito a las funciones
import java.util.Locale

// Ya hecha: da formato de euros con 2 decimales y punto decimal
fun euros(x: Double): String = String.format(Locale.US, "%.2f €", x)

// PASO 2: crea  fun subtotal(entradas: Int, precio: Double): Double   (entradas * precio)
// PASO 3: crea  fun descuento(total: Double, carneJoven: Boolean): Double
//         (el 20 % del total si tiene carné joven; 0.0 si no)
// PASO 4: crea  fun iva(base: Double): Double   (el 21 % de la base)
// PASO 5: crea  fun imprimirTicket(entradas: Int, precio: Double, carneJoven: Boolean)
//         que use las tres funciones anteriores y haga los cinco println del final de main.
//         Después BORRA todo el contenido de main y deja solo:
//             imprimirTicket(3, 8.50, true)

fun main() {
    val entradas = 3
    val precio = 8.50
    val carneJoven = true

    val subtotal = entradas * precio
    var descuento = 0.0
    if (carneJoven) {
        descuento = subtotal * 0.20
    }
    val base = subtotal - descuento
    val iva = base * 0.21
    val total = base + iva

    println("Entradas: $entradas x ${euros(precio)} = ${euros(subtotal)}")
    println("Descuento carné joven: -${euros(descuento)}")
    println("Base: ${euros(base)}")
    println("IVA (21 %): ${euros(iva)}")
    println("TOTAL: ${euros(total)}")
}
