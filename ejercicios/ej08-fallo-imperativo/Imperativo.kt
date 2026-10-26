// Ej08 · El fallo típico de la UI imperativa

// ====================== Versión IMPERATIVA (estilo Swing) ======================
// Un "componente" con estado propio que hay que actualizar A MANO.
class EtiquetaImperativa {
    var texto = "Likes: 0"
        private set

    fun setTexto(nuevo: String) {
        texto = nuevo
    }
}

class PantallaImperativa {
    var likes = 0                     // los DATOS
    val etiqueta = EtiquetaImperativa()  // la VISTA (tiene su propia copia del texto)

    fun pulsarMas() {
        likes++
        etiqueta.setTexto("Likes: $likes")
    }

    fun pulsarReiniciar() {
        likes = 0
        // ⚠ ¿Aquí falta algo?
    }
}

// ====================== Versión DECLARATIVA (estilo Compose) ======================
// La vista NO guarda nada: se calcula siempre a partir del estado.

// PASO 3a: escribe  fun vista(likes: Int): String = "Likes: $likes"


fun main() {
    println("--- Imperativo ---")
    val p = PantallaImperativa()
    p.pulsarMas(); println("Pulsa +1        -> pantalla: ${p.etiqueta.texto} | datos: ${p.likes}")
    p.pulsarMas(); println("Pulsa +1        -> pantalla: ${p.etiqueta.texto} | datos: ${p.likes}")
    p.pulsarReiniciar(); println("Pulsa Reiniciar -> pantalla: ${p.etiqueta.texto} | datos: ${p.likes}")

    // PASO 3b: haz lo mismo con un  var likes = 0  y la función vista(likes):
    //   "--- Declarativo ---"
    //   likes++;  println("Pulsa +1        -> pantalla: ${vista(likes)} | datos: $likes")
    //   ... (+1, +1 y Reiniciar)

}
