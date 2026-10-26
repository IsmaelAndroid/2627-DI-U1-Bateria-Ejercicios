// Ej01 · Alto y bajo nivel: una máquina de juguete

val programa = listOf(
    "LOAD A 7",
    "LOAD B 5",
    "ADD A B",
    "LOAD C 2",
    "SUB A C",
    "PRINT A",
)

fun main() {
    // Los registros de la máquina: nombre -> valor. linkedMapOf mantiene el orden de creación.
    val registros = linkedMapOf<String, Int>()

    println("Bajo nivel (${programa.size} instrucciones):")
    for (instruccion in programa) {
        // PASO 1: separa la instrucción en partes:  val partes = instruccion.split(" ")
        //         partes[0] es la operación; partes[1] y partes[2], los operandos.

        // PASO 2: con  when (partes[0]) { ... }  ejecuta la instrucción:
        //   "LOAD"  -> registros[partes[1]] = partes[2].toInt()
        //   "ADD"   -> registros[partes[1]] = registros.getValue(partes[1]) + registros.getValue(partes[2])
        //   "SUB"   -> igual que ADD pero restando
        //   "PRINT" -> no cambia nada (la salida se muestra en el PASO 3)

        // PASO 3: muestra la instrucción ocupando 13 caracteres (padEnd(13)), una barra y:
        //   - si es PRINT:  "salida: " + el valor del registro
        //   - si no: el estado de los registros, así: "A=12 B=5"
        //     Pista: registros.entries.joinToString(" ") { "${it.key}=${it.value}" }

    }

    // PASO 4: haz LO MISMO en alto nivel, en una línea de Kotlin, y muestra:
    //   Alto nivel (1 línea): 10

}
