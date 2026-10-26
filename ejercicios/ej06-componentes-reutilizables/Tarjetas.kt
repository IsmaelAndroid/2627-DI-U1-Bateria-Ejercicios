// Ej06 · Componentes reutilizables
// Cada "componente" es una función que devuelve las líneas de texto que ocupa.

typealias Ui = List<String>

// Ya hechos: los componentes más simples
fun texto(t: String): Ui = listOf(t)
fun boton(t: String): Ui = listOf("[ $t ]")

// PASO 1: columna: pone los hijos uno DEBAJO de otro.
//   fun columna(vararg hijos: Ui): Ui = hijos.flatMap { it }


// PASO 2: fila: pone los hijos uno AL LADO de otro, separados por 2 espacios
//   (para simplificar, cada hijo ocupa una sola línea):
//   fun fila(vararg hijos: Ui): Ui = listOf(hijos.joinToString("  ") { it.first() })


// PASO 3: tarjeta: dibuja un recuadro con un título y su contenido:
//   +----------------------+
//   | Ana                  |
//   +----------------------+
//   | 2º DAM               |
//   | [ Ver ]  [ Editar ]  |
//   +----------------------+
//   - ancho = el máximo de las longitudes del título y de las líneas del contenido
//     (Pista: (contenido + titulo).maxOf { it.length })
//   - el borde es "+" + "-" repetido (ancho + 2) + "+"
//   - cada línea es "| " + linea.padEnd(ancho) + " |"
//   fun tarjeta(titulo: String, contenido: Ui): Ui { ... }


// PASO 4: la tarjeta de un alumno es un componente hecho de otros componentes:
//   fun tarjetaAlumno(nombre: String, grupo: String): Ui =
//       tarjeta(nombre, columna(texto(grupo), fila(boton("Ver"), boton("Editar"))))


fun main() {
    // PASO 5: REUTILIZA tarjetaAlumno para Ana (2º DAM) y Luis (1º DAM), ponlas en una columna
    //         y muestra cada línea:   columna(...).forEach { println(it) }

}
