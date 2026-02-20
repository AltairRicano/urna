# 🗳️ Sistema de Conteo de Votos - Urna Electoral

Sistema de conteo de votos desarrollado en **Java 25** para calcular el porcentaje de votos obtenido por cada candidato en una urna electoral.

## 📋 Descripción

Este programa permite gestionar el conteo de votos de manera interactiva mediante un menú con tres opciones:

1. **Mostrar porcentajes de votos**: Muestra todos los candidatos del 1 al máximo número registrado con sus porcentajes actuales
2. **Contar voto**: Permite ingresar un voto para un candidato
0. **Salir**: Finaliza el programa y muestra los resultados finales

Al seleccionar la opción 1, el sistema muestra:
- Lista de todos los candidatos desde el número 1 hasta el máximo registrado
- Porcentaje de votos para cada candidato (0.00% si no tiene votos)


## 💻 Uso

### Compilación

```bash
javac ContadorVotos.java
```

### Ejecución

```bash
java ContadorVotos
```

### Commit y Push

```bash
git add .
git commit -m "mensaje"
git push
```

---

## 🧪 PairProgramming.java – Manejo de Excepciones

Archivo desarrollado en pareja como práctica de manejo de excepciones (Ingeniería de Software, UV Coatzacoalcos).

### Ejercicios implementados

| # | Descripción |
|---|-------------|
| 1 | Lanza un `Exception` dentro de `try` e imprime su mensaje con `getMessage()`. |
| 2 | Añade impresión del *stack trace* (`printStackTrace`) y cláusula `finally`. |
| 3 | Define `OperacionInvalidaException`, subclase de `Exception` con constructor de mensaje. |
| 4 | Método `procesarValor()` lanza la excepción personalizada; `main` la controla. |
| 5 | Usa `null` en lugar de instanciar; captura `Exception` base y observa el `NullPointerException`. |
| 6 | Método `a()` lanza su excepción; `b()` la captura y relanza una propia; `main` imprime el *stack trace*. |

### Compilación y ejecución

```bash
javac PairProgramming.java
java PairProgramming
```
