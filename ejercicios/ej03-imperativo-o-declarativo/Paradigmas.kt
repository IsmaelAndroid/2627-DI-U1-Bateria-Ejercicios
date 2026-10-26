// Ej03 · Imperativo o declarativo

data class Alumno(val nombre: String, val nota: Double, val grupo: String)

val alumnos = listOf(
    Alumno("Ana", 8.5, "2DAM"),
    Alumno("Luis", 4.2, "2DAM"),
    Alumno("Marta", 9.6, "2DAM"),
    Alumno("Pablo", 7.0, "1DAM"),
    Alumno("Sara", 5.0, "2DAM"),
)

// PASO 1 · IMPERATIVO: dices CÓMO, paso a paso.
//   a) crea una lista vacía que se pueda modificar:  val aprobados = mutableListOf<Alumno>()
//   b) recorre los alumnos con un for y, si son de "2DAM" y tienen 5 o más, añádelos.
//   c) ordénala de mayor a menor nota:  aprobados.sortByDescending { it.nota }
//   d) crea otra lista mutable con solo los nombres (otro for) y devuélvela.
fun imperativo(): List<String> {
    return emptyList()
}

// PASO 2 · DECLARATIVO: dices QUÉ quieres, encadenando funciones y SIN variables que cambian:
//   alumnos.filter { ... }.sortedByDescending { ... }.map { ... }
fun declarativo(): List<String> {
    return emptyList()
}

fun main() {
    println("Imperativo:  ${imperativo()}")
    println("Declarativo: ${declarativo()}")
    // PASO 3: SQL también es declarativo. Escribe la consulta equivalente y muéstrala:
    //   En SQL (declarativo): SELECT nombre FROM alumnos WHERE ... ORDER BY ...

}
