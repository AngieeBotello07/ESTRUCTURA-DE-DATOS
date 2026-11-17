# Práctica: Ordenamiento Externo — Mezcla Directa (Straight Merge)

## Datos Académicos y de Autoría
- **Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)
- **Carrera:** Ingeniería en Sistemas Computacionales
- **Asignatura:** AED-1026 Estructura de Datos (Unidad 5: Ordenamiento Externo)
- **Alumna / Autores:** María de los Angeles Rocha Botello bajo la cátedra del Ing. Víctor Hugo Vásquez Herrera.  — 3° "B"
- **Docente:** Ing. Víctor Hugo Vásquez Herrera (`victor.vasquez@itsx.edu.mx`)
- **Repositorio Oficial:** [https://github.com/AngieeBotello07/ESTRUCTURA-DE-DATOS/tree/main/MEZCLA%20DIRECTA](https://github.com/AngieeBotello07/ESTRUCTURA-DE-DATOS/tree/main/MEZCLA%20DIRECTA)

## Descripción del Proyecto
Implementación en **Java** del algoritmo de intercalación de bloques (`intercalarBloques`) correspondiente al método de ordenamiento externo **Mezcla Directa**. El programa lee registros numéricos desde dos archivos auxiliares de texto plano (`f1.txt` y `f2.txt`) y los fusiona de manera ordenada en bloques de longitud `L` dentro del archivo de salida `f3.txt`.

## Requisitos Previos
- Java Development Kit (**JDK 11** o superior).
- Entorno de desarrollo integrado (**IntelliJ IDEA**, **NetBeans** o **Visual Studio Code**) o terminal con `javac`.
- **Git** instalado para clonar el repositorio.

## Instrucciones de Clonación, Configuración y Ejecución
1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/AngieeBotello07/ESTRUCTURA-DE-DATOS.git
   cd "ESTRUCTURA-DE-DATOS/MEZCLA DIRECTA"
   ```
2. **Preparar los archivos de entrada:**
   Verifica que en la carpeta raíz del proyecto existan los archivos `f1.txt` y `f2.txt` con un número entero por línea:
   - `f1.txt`: `3, 12, 27, 60`
   - `f2.txt`: `8, 15, 45, 89`
3. **Compilar y ejecutar:**
   - Desde IDE: Abrir `MezclaDirectaPractica.java` y presionar **Run**.
   - Desde consola:
     ```bash
     javac MezclaDirectaPractica.java
     java MezclaDirectaPractica
     ```

## Salida Esperada en Consola y Archivo Resultante
Al ejecutarse correctamente, la consola muestra:
```text
Bloques intercalados con exito!
```
Y el archivo `f3.txt` se genera con los datos fusionados en orden ascendente:
```text
3
8
12
15
27
45
60
89
```
