# Ej03 · Imperativo o declarativo 🟣

**Apartado 2 · Paradigmas de programación** · ⏱️ 30 min

> 🎯 Resolver el mismo problema de dos formas: **imperativa** (dices **paso a paso cómo** hacerlo) y **declarativa** (dices **qué** quieres). Es la diferencia que hay entre Swing o las vistas XML y **Jetpack Compose**.

**El problema:** de la lista de alumnos, obtener los **nombres de los aprobados de 2º DAM**, ordenados **de mayor a menor nota**.

## Pasos

Completa [`Paradigmas.kt`](Paradigmas.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej03-imperativo-o-declarativo/Paradigmas.kt
```

## ✅ Comprueba

```text
Imperativo:  [Marta, Ana, Sara]
Declarativo: [Marta, Ana, Sara]
En SQL (declarativo): SELECT nombre FROM alumnos WHERE grupo = '2DAM' AND nota >= 5 ORDER BY nota DESC
```
