# Estructura de Datos (AED-1026) - Unidad 3: Pilas Estáticas y Dinámicas

**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa  
**Carrera:** Ingeniería en Sistemas Computacionales  

---

## 1. Estructura del Proyecto y Diferencias Conceptuales

El proyecto se encuentra dividido de forma limpia y modular en las siguientes clases de Java:
*   **`PilaSimple.java`**: Implementación de una pila con almacenamiento estático.
*   **`LanzadorPilaSimple.java`**: Clase de prueba para la ejecución de la pila estática.
*   **`PilaSimpleModificada.java`**: Implementación de una pila con almacenamiento estático adicionado con  isEmpty(), isFull() y peek().
*   **`LanzadorPilaSimpleModificada.java`**: Clase de prueba para la ejecución de la pila estática modificada.
*   **`Nodo.java`**: Estructura base para el almacenamiento enlazado (contiene el dato y la referencia al siguiente nodo).
*   **`PilaDinamica.java`**: Implementación de una pila con almacenamiento dinámico.
*   **`LanzadorPilaDinamica.java`**: Clase de prueba para la ejecución de la pila dinámica.

### Diferencias Conceptuales de Almacenamiento

| Característica | Almacenamiento Estático (`PilaSimple`) | Almacenamiento Dinámico (`PilaDinamica`) |
| :--- | :--- | :--- |
| **Distribución en Memoria** | **Contiguo.** Los elementos se guardan juntos de forma consecutiva en la memoria RAM dentro de un arreglo. | **No contiguo.** Los nodos pueden estar dispersos en diferentes direcciones de la memoria RAM. |
| **Dimensionamiento** | **Fijo.** Su capacidad máxima se define en el código y no puede cambiar durante la ejecución del programa. | **Flexible / Variable.** Crece o disminuye según los requerimientos del programa en tiempo de ejecución. |
| **Límites de Capacidad** | Regulado por la propiedad `.length` del arreglo. Puede sufrir de desbordamiento de memoria (**Stack Overflow**). | Limitado únicamente por la cantidad de memoria disponible en la *Heap* de la RAM. No utiliza el método `isFull()`. |
| **Acceso Físico** | Utiliza un índice entero (`tope`) para controlar la posición activa del último elemento ingresado. | Utiliza un puntero de objeto (`cima`) para apuntar al nodo superior, enlazando los elementos mediante referencias. |

---

## 2. Guía de Compilación y Ejecución desde la Terminal

Siga estos pasos para compilar de forma nativa desde la consola del sistema operativo utilizando el JDK de Java:

1. Abra la terminal o símbolo del sistema en el directorio raíz donde guardó sus archivos de código fuente (`.java`).
2. **Compilar todas las clases** del proyecto al mismo tiempo para resolver dependencias:
   ```bash
   javac *.java
   ```
3. **Ejecutar la Pila Estática**:
   ```bash
   java LanzadorPilaSimple
   ```
4. **Ejecutar la Pila Dinámica**:
   ```bash
   java LanzadorPilaDinamica
   ```

---

## 3. Pruebas de Ejecución y Salidas por Consola (Texto Plano)

### A) Prueba de la Pila Estática (`LanzadorPilaSimple`)

```text
Metiste: 10
Metiste: 20
Metiste: 30
Pila Actual: 10 20 30 
Sacaste: 30
Pila Actual: 10 20 
```

### B) Prueba de la Pila Estática (`LanzadorPilaSimpleModificada`)

```text
¿La pila está vacía inicialmente?: true
Metiste: 10
Metiste: 20
Metiste: 30
Pila Actual: 10 20 30 
Elemento en el tope (peek): 30
Sacaste: 30
Pila Actual: 10 20 
Nuevo elemento en el tope (peek): 20
¿La pila está llena?: false
Process finished with exit code 0

```
### B) Prueba de la Pila Dinámica (`LanzadorPilaDinamica`)

```text
¿La pila dinámica está vacía?: true
Metiste a la pila dinámica: 50
Metiste a la pila dinámica: 60
Metiste a la pila dinámica: 70
Pila Dinámica Actual: 70 -> 60 -> 50 -> null
Elemento en la cima (peek): 70
Pila Dinámica Actual: 70 -> 60 -> 50 -> null
Sacaste de la pila: 70
Pila Dinámica Actual: 60 -> 50 -> null
Nueva cima (peek): 60
¿La pila dinámica está vacía ahora?: false
```
