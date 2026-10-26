# Ej05 · Programación basada en eventos 🟣

**Apartado 3 · Modelo basado en eventos** · ⏱️ 35 min

> 🎯 En una interfaz, el programa **no sigue un orden fijo**: espera a que pase algo (un **evento**, como pulsar un botón) y entonces ejecuta el código que se **suscribió** a ese evento (un **oyente** o *listener*). Es lo que haces en Compose con `Button(onClick = { ... })`.

## Pasos

Completa [`Eventos.kt`](Eventos.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej05-eventos/Eventos.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
» Pulsado: +1
  contador = 1
  [registro] clic en +1
» Pulsado: +1
  contador = 2
  [registro] clic en +1
» Pulsado: Reiniciar
  contador = 0
» Pulsado: +1
  contador = 1
  [registro] clic en +1
```
