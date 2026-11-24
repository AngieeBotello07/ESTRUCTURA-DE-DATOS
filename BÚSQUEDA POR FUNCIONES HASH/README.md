# 🗂️ Práctica e Investigación: Búsqueda por Funciones Hash en Java

![Institución](https://img.shields.io/badge/Institución-ITSX-800000?style=for-the-badge)
![Carrera](https://img.shields.io/badge/Carrera-Ingeniería%20en%20Sistemas%20Computacionales-003366?style=for-the-badge)
![Materia](https://img.shields.io/badge/Materia-AED--1026%20Estructura%20de%20Datos-2E7D32?style=for-the-badge)
![Lenguaje](https://img.shields.io/badge/Java-JDK%2017+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

---

## 🎓 Créditos Institucionales y Cátedra

Este proyecto académico fue desarrollado como parte de las actividades de la **Unidad 6: Búsqueda por Funciones Hash**, correspondiente a la asignatura **AED-1026 Estructura de Datos**.

* **Institución:** Instituto Tecnológico Superior de Xalapa (ITSX) — *Xalapa, Veracruz, México.*
* **Programa Educativo:** Ingeniería en Sistemas Computacionales (ISC)
* **Asignatura:** AED-1026 Estructura de Datos
* **Docente / Cátedra:** **Ing. Víctor Hugo Vásquez Herrera** (`victor.vasquez@itsx.edu.mx`)
* **Autora del Proyecto:** **María de los Angeles Rocha Botello**
* **Semestre y Grupo:** 3° Semestre — Grupo "B"

> *Proyecto elaborado y documentado por **María de los Angeles Rocha Botello** bajo la cátedra y supervisión académica del profesor **Víctor Hugo Vásquez Herrera** en el Instituto Tecnológico Superior de Xalapa (ITSX).*

---

## 📌 Descripción del Proyecto

El objetivo de esta práctica es comprender, implementar y evaluar el funcionamiento de las **Tablas Hash** utilizando arreglos convencionales en Java (`Producto[]`), aplicando la **función hash por división** y resolviendo conflictos de almacenamiento mediante **Exploración Lineal (*Linear Probing*)**. 

Asimismo, el programa realiza una comparativa empírica de rendimiento en nanosegundos (`System.nanoTime()`) frente a los algoritmos clásicos de **Búsqueda Secuencial** y **Búsqueda Binaria** sobre un conjunto de **10,000 registros**.

---

## 📂 Estructura del Repositorio

```text
├── BusquedaHashPractica.java                  # Código fuente principal en Java (Tabla Hash + Benchmark)
├── Investigacion_y_Practica_Hash_AED1026.docx # Documento formal con teoría, análisis y prueba de escritorio
└── README.md                                  # Documentación principal del proyecto
```

---

## ⚙️ Características Técnicas Implementadas

1. **Función Hash por División:**
   $$h(k) = |k| \bmod \text{TAM}$$
   * Uso de `Math.abs(codigo) % TAM` para evitar índices negativos por desbordamiento de enteros en Java.
   * Uso de tamaños de arreglo basados en números primos superiores a la cantidad de datos (`TAM = 15013` para 10,000 elementos) para minimizar el factor de carga ($\alpha \approx 0.66$) y reducir agrupamientos.
2. **Resolución de Colisiones (Exploración Lineal Circular):**
   * Manejo de colisiones mediante desplazamiento circular utilizando `indice = (indice + 1) % TAM` dentro de ciclos `while (tabla[indice] != null)` tanto en inserción como en búsqueda.
3. **Validación de Prueba de Escritorio:**
   * Simulación exacta del ejercicio de clase con un arreglo de tamaño `TAM = 7` e inserción secuencial de las claves `[15, 22, 18, 25, 32]`, verificando los índices finales y el conteo total de **3 colisiones**.
4. **Benchmark de Rendimiento (`System.nanoTime()`):**
   * Medición precisa en nanosegundos comparando:
     * **Búsqueda Secuencial:** Complejidad $O(n)$
     * **Búsqueda Binaria:** Complejidad $O(\log n)$
     * **Búsqueda por Tabla Hash:** Complejidad promedio $O(1)$

---

## 🚀 Instrucciones de Compilación y Ejecución

### Requisitos previos
* Tener instalado el **Java Development Kit (JDK 8 o superior)**.

### Pasos desde la terminal
1. Clonar o descargar los archivos del repositorio en una misma carpeta.
2. Compilar el archivo fuente:
   ```
   (https://github.com/AngieeBotello07/ESTRUCTURA-DE-DATOS/tree/main/B%C3%9ASQUEDA%20POR%20FUNCIONES%20HASH)
   ```
3. Ejecutar el programa:
   ```
   java BusquedaHashPractica
   ```

---

## 📊 Resumen Comparativo de Algoritmos

| Criterio | Búsqueda Secuencial | Búsqueda Binaria | Búsqueda por Hash |
| :--- | :---: | :---: | :---: |
| **¿Requiere datos ordenados?** | No | Sí | No |
| **Velocidad con 10,000 datos** | Lenta ($O(n)$) | Rápida ($O(\log n)$) | Muy rápida / Instantánea ($O(1)$) |
| **Ventaja principal** | Fácil implementación; funciona en arreglos desordenados. | Muy eficiente sin requerir memoria extra. | Acceso directo por clave sin recorrer el arreglo. |
| **Desventaja principal** | El tiempo crece linealmente con el volumen de datos. | Requiere mantener el arreglo previamente ordenado. | Requiere espacio extra (factor de carga) y manejo de colisiones. |

---

## 📜 Nota Académica y Autoría

Este material tiene fines estrictamente educativos para la materia **AED-1026 Estructura de Datos** del **Instituto Tecnológico Superior de Xalapa (ITSX)**.  
**Autoría:** María de los Angeles Rocha Botello (3° "B", ISC) — **Cátedra:** Prof. Víctor Hugo Vásquez Herrera.
