# Ej01 · Alto y bajo nivel: una máquina de juguete 🟣

**Apartado 1 · Lenguajes de alto y bajo nivel** · ⏱️ 35 min

> 🎯 Sentir la diferencia entre **bajo nivel** (instrucciones muy simples, cerca de la máquina: cargar un número en un registro, sumar dos registros…) y **alto nivel** (una línea legible para una persona). Vas a programar el **intérprete** de una mini máquina con 4 instrucciones.

| Instrucción | Qué hace | Ejemplo |
|---|---|---|
| `LOAD r n` | Guarda el número `n` en el registro `r` | `LOAD A 7` → A = 7 |
| `ADD r1 r2` | Suma: `r1 = r1 + r2` | `ADD A B` |
| `SUB r1 r2` | Resta: `r1 = r1 - r2` | `SUB A C` |
| `PRINT r` | Muestra el valor del registro | `PRINT A` |

## Pasos

Completa [`Maquina.kt`](Maquina.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej01-alto-y-bajo-nivel/Maquina.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
Bajo nivel (6 instrucciones):
LOAD A 7     | A=7
LOAD B 5     | A=7 B=5
ADD A B      | A=12 B=5
LOAD C 2     | A=12 B=5 C=2
SUB A C      | A=10 B=5 C=2
PRINT A      | salida: 10
Alto nivel (1 línea): 10
```
