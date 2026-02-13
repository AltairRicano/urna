# 🗳️ Sistema de Conteo de Votos - Urna Electoral

Sistema de conteo de votos desarrollado en **Java 25** para calcular el porcentaje de votos obtenido por cada candidato en una urna electoral.

## 📋 Descripción

Este programa permite registrar votos de manera interactiva, donde cada voto se ingresa con el número identificador del candidato. Al finalizar el conteo (ingresando `0`), el sistema calcula y muestra:

- Total de votos contados
- Cantidad de votos por candidato
- Porcentaje de votos para cada candidato
- Representación visual mediante barras de progreso

## 🚀 Requisitos

- **Java 25** o superior
- Sistema operativo: Linux, Windows o macOS

## 📦 Instalación

1. Clonar el repositorio:
```bash
git clone <URL_DEL_REPOSITORIO>
cd urna
```

2. Verificar la versión de Java:
```bash
java --version
```

## 💻 Uso

### Compilación

```bash
javac ContadorVotos.java
```

### Ejecución

```bash
java ContadorVotos
```

## 📝 Ejemplo de Uso

```
╔════════════════════════════════════════════════╗
║   SISTEMA DE CONTEO DE VOTOS - URNA ELECTORAL  ║
╚════════════════════════════════════════════════╝

Instrucciones:
- Ingrese el número del candidato por cada voto
- Ingrese 0 cuando termine el conteo

Ingrese número de candidato (0 para finalizar): 1
✓ Voto registrado (1 votos totales)
Ingrese número de candidato (0 para finalizar): 2
✓ Voto registrado (2 votos totales)
Ingrese número de candidato (0 para finalizar): 1
✓ Voto registrado (3 votos totales)
Ingrese número de candidato (0 para finalizar): 3
✓ Voto registrado (4 votos totales)
Ingrese número de candidato (0 para finalizar): 1
✓ Voto registrado (5 votos totales)
Ingrese número de candidato (0 para finalizar): 0

==================================================
RESULTADOS DEL CONTEO DE VOTOS
==================================================
Total de votos contados: 5
==================================================
Candidato 1: 3 votos (60.00%)
  [██████████████████████████████░░░░░░░░░░░░░░░░░░░░]
Candidato 2: 1 votos (20.00%)
  [██████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░]
Candidato 3: 1 votos (20.00%)
  [██████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░]
==================================================
```

## 🎯 Características

- ✅ Interfaz de usuario intuitiva y amigable
- ✅ Validación de datos de entrada
- ✅ Cálculo automático de porcentajes
- ✅ Visualización gráfica de resultados
- ✅ Manejo de errores robusto
- ✅ Soporte para número ilimitado de candidatos

## 🔧 Funcionamiento

1. El programa solicita ingresar el número del candidato para cada voto
2. Cada voto se registra y se incrementa el contador
3. Al ingresar `0`, el sistema finaliza el conteo
4. Se muestran los resultados ordenados por número de candidato
5. Cada resultado incluye:
   - Número del candidato
   - Cantidad de votos
   - Porcentaje del total
   - Barra visual de progreso

## 🛠️ Estructura del Código

- **`ContadorVotos`**: Clase principal que gestiona el conteo
  - `registrarVoto(int)`: Registra un voto para un candidato
  - `mostrarResultados()`: Calcula y muestra los resultados finales
  - `mostrarBarraProgreso(double)`: Crea representación visual del porcentaje
  - `main(String[])`: Punto de entrada del programa

## 📊 Tecnologías Utilizadas

- **Lenguaje**: Java 25
- **Estructuras de datos**: HashMap para almacenamiento eficiente
- **API**: Java Collections Framework, Scanner para entrada de datos

## 📄 Licencia

Este proyecto es de código abierto y está disponible bajo los términos que el usuario desee especificar.

## 👤 Autor

Desarrollado como sistema de conteo electoral.

---

**Nota**: Este programa es ideal para prácticas de conteo electoral, simulaciones de votaciones, o cualquier escenario donde se requiera calcular porcentajes de votos de manera rápida y visual.
