#!/usr/bin/env bash
# Compila y ejecuta un ejercicio de Kotlin de consola.
# Uso:  ./ejecutar.sh ejercicios/ej01-alto-y-bajo-nivel/Maquina.kt
set -e
if [ -z "$1" ]; then echo "Uso: ./ejecutar.sh ruta/al/Fichero.kt"; exit 1; fi
kotlinc "$1" -include-runtime -d /tmp/ejercicio.jar 2>&1 | grep -v "^warning" || true
java -jar /tmp/ejercicio.jar
