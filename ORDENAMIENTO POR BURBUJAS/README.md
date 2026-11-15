# 📚 Práctica Unidad 5: Implementación del Algoritmo de Ordenamiento por Burbuja

---

## 🏛️ Información Académica e Institucional

| **Institución** | **Instituto Tecnológico Superior de Xalapa (ITSX)** |
| **Carrera** | **Ingeniería en Sistemas Computacionales (ISC)** |
| **Asignatura** | **AED-1026 Estructura de Datos** (Unidad 5: Métodos de Ordenamiento) |
| **Docente** | **Ing. Víctor Hugo Vásquez Herrera** |
| **Contacto Docente** | `victor.vasquez@itsx.edu.mx` |
| **Alumna** | **María de los Angeles Rocha Botello** |
| **Semestre y Grupo** | **3° "B"** |
| **Repositorio GitHub** | [ESTRUCTURA-DE-DATOS / ORDENAMIENTO POR BURBUJAS](https://github.com/AngieeBotello07/ESTRUCTURA-DE-DATOS/tree/main/ORDENAMIENTO%20POR%20BURBUJAS) |

---

## 📖 Descripción de la Práctica

Este repositorio contiene la implementación en lenguaje **Java** del algoritmo de **Ordenamiento por Burbuja (*Bubble Sort*)** desarrollado como parte de las actividades prácticas de la Unidad 5 de la materia **Estructura de Datos**.

El proyecto incluye una versión optimizada del algoritmo mediante una **bandera booleana (`intercambiado`)** que permite detener la ejecución de forma anticipada cuando el arreglo ya se encuentra ordenado, mejorando el rendimiento en el mejor caso a complejidad lineal $O(n)$.

---

## 🗂️ Estructura del Proyecto

```text
ESTRUCTURA-DE-DATOS/
└── ORDENAMIENTO POR BURBUJAS/
    ├── README.md
    └── Burbuja.java        # Lógica del algoritmo de ordenamiento e impresión
    └── Mainburbuja.java    # Clase principal con el método main y pruebas
```

---

## ⚙️ Requisitos Previos

* **Java Development Kit (JDK):** Versión 8 o superior (probado en OpenJDK 26).
* **Git:** Para clonar el repositorio localmente.
* **IDE (Opcional):** IntelliJ IDEA, NetBeans, Eclipse o Visual Studio Code.

---

## 🚀 Instrucciones de Clonación, Compilación y Ejecución

Sigue estos pasos en tu terminal o línea de comandos para ejecutar el programa localmente:

### 1. Clonar el repositorio
```bash
git clone https://github.com/AngieeBotello07/ESTRUCTURA-DE-DATOS.git
```

### 2. Acceder a la carpeta de la práctica
```bash
cd "ESTRUCTURA-DE-DATOS/ORDENAMIENTO POR BURBUJAS"
```

### 3. Compilar los archivos fuente (`.java`)
```bash
javac Metodos_de_ordenamiento/*.java
```

### 4. Ejecutar la clase principal
```bash
java Metodos_de_ordenamiento.Mainburbuja
```

---

## 💻 Salida Esperada en Consola

Al ejecutar el programa con el arreglo de prueba `{6, 1, 5, 8, 3, 2, 7, 4}`, la consola mostrará el estado inicial y el resultado final ordenado de manera ascendente:

```text
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]

Arreglo ordenado:
[1, 2, 3, 4, 5, 6, 7, 8]

Process finished with exit code 0
```

---

## 👩‍💻 Autoría

Desarrollado por **María de los Angeles Rocha Botello** (3° "B" - ISC, ITSX) bajo la cátedra y conocimientos del **Ing. Víctor Hugo Vásquez Herrera**.
