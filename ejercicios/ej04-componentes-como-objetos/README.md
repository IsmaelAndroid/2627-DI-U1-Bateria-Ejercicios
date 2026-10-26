# Ej04 · Componentes como objetos 🟣

**Apartado 3 · Programación orientada a objetos** · ⏱️ 40 min

> 🎯 Las librerías clásicas de interfaces (Swing, las vistas de Android) modelan cada componente como un **objeto**: una clase base común (`JComponent`, `View`) y subclases (`JButton`, `TextView`…). Vas a hacer tu propia mini librería que «dibuja» en la consola.

```text
            Componente (abstracta)  →  dibujar(): String
     ┌──────────┬──────────┼──────────┐
 Etiqueta   CampoTexto   Casilla    Boton
```

## Pasos

Completa [`Componentes.kt`](Componentes.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej04-componentes-como-objetos/Componentes.kt
```

## ✅ Comprueba

```text
=== Registro ===
| Crea tu cuenta
| Usuario: [__________]
| Email: [ana@ies.es]
| [ ] Acepto las condiciones
| ( Registrarme )
5 componentes · 1 botón(es)
```
