// Ej05 · Programación basada en eventos

class Boton(val texto: String) {
    // La lista de oyentes: funciones que se ejecutarán al pulsar. (String) -> Unit es
    // "una función que recibe un texto y no devuelve nada".
    private val oyentes = mutableListOf<(String) -> Unit>()

    // PASO 1: escribe  fun alPulsar(oyente: (String) -> Unit)  que añada el oyente a la lista.


    // PASO 2: escribe  fun pulsar()  que muestre "» Pulsado: $texto" y después llame a cada
    //         oyente pasándole el texto:  for (o in oyentes) o(texto)

}

fun main() {
    var contador = 0
    val mas = Boton("+1")
    val reiniciar = Boton("Reiniciar")

    // PASO 3: suscribe DOS oyentes al botón mas (se ejecutan en orden):
    //   - el primero suma 1 al contador y muestra "  contador = 1"
    //   - el segundo muestra "  [registro] clic en +1"   (usa el texto que recibe: { t -> ... })
    //   Ejemplo:  mas.alPulsar { contador++; println("  contador = $contador") }


    // PASO 4: suscribe un oyente a reiniciar que ponga el contador a 0 y lo muestre.


    // PASO 5: simula lo que hace el usuario: pulsa +1, +1, Reiniciar y +1.
    //   listOf(mas, mas, reiniciar, mas).forEach { it.pulsar() }

}
