# Práctica de Programación en Java: Arquitectura Modular y Colas

Este repositorio contiene la solución a la práctica de:
___________________________________________________________________________________________________________________________
**Estructura de Datos** 
Docente **Víctor Hugo Vásquez Herrera**
**ESTRUCTURA DE DATOS**
**Instituto Tecnológico Superior de Xalapa**.
ISC SABATINO
___________________________________________________________________________________________________________________________


## 📌 Descripción del Proyecto
El proyecto implementa y contrasta las tres variantes principales de la estructura de datos lineal de tipo **Cola (FIFO - First In, First Out)** utilizando un enfoque estrictamente modular bajo el paquete único `Estructuras_lineales`:
1. **Cola Estática Lineal:** Basada en arreglos con límites físicos fijos.
2. **Cola Estática Circular:** Optimizada mediante aritmética modular (`%`) para reutilizar posiciones de memoria liberadas.
3. **Cola Dinámica:** Estructura basada en nodos enlazados en memoria dinámica (Heap) sin restricciones rígidas de tamaño.

## 📂 Estructura del Código Fuente
El código está organizado de manera plana y modular dentro del paquete original para evitar subpaquetes redundantes:

* `Nodo.java` - Plantilla base para los eslabones de la estructura dinámica.
* `ColaEstatica.java` - Implementación con arreglos tradicionales de capacidad fija.
* `ColaEstaticaCircular.java` - Variación circular con control explícito de tamaño.
* `ColaDinamica.java` - Estructura dinámica enlazada extendida con métodos de análisis.
* `MainColaEstatica.java` - Punto de entrada independiente para la cola lineal.
* `MainColaCircular.java` - Punto de entrada independiente para la cola circular.
* `MainColaDinamica.java` - Punto de entrada independiente para la cola dinámica.

## 🚀 Instrucciones de Ejecución
Cada variante cuenta con su propia clase `Main` independiente. Puedes compilar y ejecutar cualquiera de los archivos de prueba directamente desde tu IDE de preferencia (NetBeans, IntelliJ, Eclipse) o desde la terminal de comandos:


**RESULTADOS DE LA PRÁCTICA**
_____________________________________________
=== PRUEBA DE COLA ESTÁTICA LINEAL ===
Frente -> [10] [20] [30] <- Fin
Elemento al frente (peek): 10
Desencolando: 10
Frente -> [20] [30] <- Fin
Nuevo elemento al frente (peek): 20

Process finished with exit code 0

___________________________________________
=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===
Encolando elementos...
Frente -> [100] [200] [300] <- Fin
Elemento al frente (peek): 100
Desencolando: 100
Encolando elemento circular (400):
Frente -> [200] [300] [400] <- Fin
Elemento al frente actual (peek): 200
=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===
Encolando elementos...
Frente -> [100] [200] [300] <- Fin
Elemento al frente (peek): 100
Desencolando: 100
Encolando elemento circular (400):
Frente -> [200] [300] [400] <- Fin
Elemento al frente actual (peek): 200

Process finished with exit code 0

______________________________________________
--- PRUEBA DE COLA DINÁMICA ---
Frente ->  [5] [15] [25] <- Fin
Total de nodos activos recorridos: 3
Nodo al frente detectado (peek): 5

Process finished with exit code 0
______________________________________________
java Estructuras_lineales.MainColaCircular
```
