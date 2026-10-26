// Ej04 · Componentes como objetos

// La clase base: todo componente sabe dibujarse
abstract class Componente {
    abstract fun dibujar(): String
}

// Ya hecha: una etiqueta solo muestra su texto
class Etiqueta(val texto: String) : Componente() {
    override fun dibujar() = texto
}

// PASO 1: crea la clase CampoTexto(val pista: String, val valor: String = "") que herede de Componente.
//   dibujar(): si el valor está vacío -> "Usuario: [__________]"   (10 guiones bajos)
//              si no                 -> "Email: [ana@ies.es]"


// PASO 2: crea Casilla(val texto: String, val marcada: Boolean = false)
//   dibujar() -> "[x] texto" si está marcada, "[ ] texto" si no


// PASO 3: crea Boton(val texto: String)
//   dibujar() -> "( Registrarme )"


// PASO 4: crea Pantalla(val titulo: String, val componentes: List<Componente>) con un método dibujar()
//   que muestre "=== titulo ===", después cada componente con "| " delante y, al final:
//   "5 componentes · 1 botón(es)"   Pista: componentes.filterIsInstance<Boton>().size


fun main() {
    // PASO 5: quita las // cuando tengas las clases
    // val registro = Pantalla(
    //     "Registro",
    //     listOf(
    //         Etiqueta("Crea tu cuenta"),
    //         CampoTexto("Usuario"),
    //         CampoTexto("Email", "ana@ies.es"),
    //         Casilla("Acepto las condiciones"),
    //         Boton("Registrarme"),
    //     ),
    // )
    // registro.dibujar()
}
