# Práctica Unidad 5: Implementación y Comparativa de QuickSort y ShellSort

## 🎓 Datos Académicos y Autoría

Este proyecto fue desarrollado como parte de las actividades prácticas de la **Unidad 5** de la asignatura de **Estructura de Datos**, impartida bajo la cátedra y supervisión del docente:

* **Docente / Cátedra:** Ing. Víctor Hugo Vásquez Herrera (`victor.vasquez@itsx.edu.mx`)
* **Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)
* **Programa Educativo:** Ingeniería en Sistemas Computacionales (ISC)
* **Autora del Repositorio:** María de los Angeles Rocha Botello
* **Semestre y Grupo:** 3° Semestre — Grupo "B"
* **Ubicación:** Xalapa-Enríquez, Veracruz, México.

---

## 📋 Descripción del Proyecto

El repositorio contiene la implementación completa, modular y documentada en lenguaje **Java** de dos algoritmos fundamentales de ordenamiento interno:

1. **QuickSort (`QuickSort.java`):** Implementación recursiva basada en el paradigma *Divide y Vencerás* utilizando el esquema de particionamiento de Lomuto.
2. **ShellSort (`ShellSort.java`):** Implementación iterativa que optimiza el ordenamiento por inserción mediante la comparación y desplazamiento de elementos separados por intervalos decrecientes (`n / 2`).
3. **Clase Principal Unificada (`Main.java`):** Ejecuta ambos algoritmos sobre copias independientes (`clone()`) de un mismo arreglo de prueba para validar su correcto funcionamiento en consola.

---

## 📁 Estructura del Proyecto

```text
QUICKSORT Y SHELLSORT/
├── README.md
└── src/
    └── Metodos_de_ordenamiento/
        ├── QuickSort.java
        ├── ShellSort.java
        └── Main.java
```

---

## ⚙️ Requisitos del Entorno

* **Java Development Kit (JDK):** Versión 8 o superior (JDK 17 recomendado).
* **IDE sugerido (opcional):** IntelliJ IDEA, NetBeans, Eclipse o Visual Studio Code.

---

## 🚀 Instrucciones de Clonación, Compilación y Ejecución

Sigue estos pasos desde tu terminal o consola de comandos para ejecutar el proyecto localmente:

### 1. Clonar el repositorio
```bash
git clone https://github.com
cd "ESTRUCTURA-DE-DATOS/QUICKSORT  Y SHELLSORT"
```

### 2. Compilar el código fuente
Sitúate dentro de la carpeta `src` y compila todas las clases del paquete `Metodos_de_ordenamiento`:
```bash
cd src
javac Metodos_de_ordenamiento/*.java
```

### 3. Ejecutar el programa principal
Ejecuta la clase `Main` indicando el nombre completo del paquete:
```bash
java Metodos_de_ordenamiento.Main
```

---

## 🖥️ Salida Esperada en Consola

```text
=== MÉTODO QUICKSORT ===
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado con QuickSort:
[1, 2, 3, 4, 5, 6, 7, 8]

=== MÉTODO SHELLSORT ===
Arreglo original:
[6, 1, 5, 8, 3, 2, 7, 4]
Arreglo ordenado con ShellSort:
[1, 2, 3, 4, 5, 6, 7, 8]
```

---

## 📊 Resumen Comparativo

| Criterio | QuickSort | ShellSort |
| :--- | :--- | :--- |
| **Enfoque** | Recursivo (*Divide y Vencerás*) | Iterativo (Inserción por saltos) |
| **Complejidad Promedio** | $O(n \log n)$ | $O(n^{4/3})$ a $O(n^{3/2})$ |
| **Peor Caso** | $O(n^2)$ | $O(n^2)$ |
| **Memoria Auxiliar** | $O(\log n)$ (pila de recursión) | $O(1)$ (constante) |
| **Estabilidad** | Inestable | Inestable |

---
*Trabajo académico elaborado por **María de los Angeles Rocha Botello** bajo la cátedra del docente **Víctor Hugo Vásquez Herrera** — ISC, ITSX.*

