import java.util.Arrays;
import java.util.Random;

/**
 * Unidad 6: Búsqueda por Funciones Hash (AED-1026 Estructura de Datos)
 * Instituto Tecnológico Superior de Xalapa
 * Implementación de Tabla Hash con arreglo normal (Producto[]),
 * función hash por división, resolución de colisiones por Exploración Lineal
 * y comparativa de tiempos de búsqueda (Secuencial, Binaria y Hash).
 */
public class BusquedaHashPractica {

    // Tamaño primo mayor a la cantidad de datos (ej. 10,000 productos -> 15013)
    private static final int TAM = 15013;

    // Clase modelo Producto
    static class Producto implements Comparable<Producto> {
        int codigo;
        String nombre;
        double precio;

        public Producto(int codigo, String nombre, double precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public int compareTo(Producto otro) {
            return Integer.compare(this.codigo, otro.codigo);
        }

        @Override
        public String toString() {
            return "Producto{codigo=" + codigo + ", nombre='" + nombre + "', precio=$" + String.format("%.2f", precio) + "}";
        }
    }

    // Estructura de Tabla Hash sobre un arreglo convencional
    static class TablaHash {
        private Producto[] tabla;
        private int tamano;
        private int colisionesTotales;

        public TablaHash(int tamano) {
            this.tamano = tamano;
            this.tabla = new Producto[tamano];
            this.colisionesTotales = 0;
        }

        // Función Hash por división: h(k) = |k| mod TAM
        private int funcionHash(int codigo) {
            return Math.abs(codigo) % tamano;
        }

        // Inserción con Exploración Lineal (Linear Probing)
        public void insertar(Producto producto) {
            int indice = funcionHash(producto.codigo);
            int intentos = 0;

            while (tabla[indice] != null) {
                colisionesTotales++;
                indice = (indice + 1) % tamano; // Avance circular
                intentos++;
                if (intentos >= tamano) {
                    System.out.println("Error: La tabla hash está llena.");
                    return;
                }
            }
            tabla[indice] = producto;
        }

        // Búsqueda con Exploración Lineal
        public Producto buscar(int codigo) {
            int indice = funcionHash(codigo);
            int intentos = 0;

            while (tabla[indice] != null && intentos < tamano) {
                if (tabla[indice].codigo == codigo) {
                    return tabla[indice];
                }
                indice = (indice + 1) % tamano;
                intentos++;
            }
            return null; // No encontrado
        }

        public int getColisionesTotales() {
            return colisionesTotales;
        }
    }

    // Búsqueda Secuencial tradicional
    public static Producto busquedaSecuencial(Producto[] arreglo, int codigo) {
        for (Producto p : arreglo) {
            if (p != null && p.codigo == codigo) {
                return p;
            }
        }
        return null;
    }

    // Búsqueda Binaria (requiere arreglo previamente ordenado)
    public static Producto busquedaBinaria(Producto[] arregloOrdenado, int codigo) {
        int inicio = 0;
        int fin = arregloOrdenado.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arregloOrdenado[medio].codigo == codigo) {
                return arregloOrdenado[medio];
            }
            if (arregloOrdenado[medio].codigo < codigo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }

    // Prueba de escritorio del ejercicio práctico (Arreglo tamaño 7)
    public static void ejecutarPruebaEscritorio() {
        System.out.println("=== 1. PRUEBA DE ESCRITORIO (TAM = 7) ===");
        int tamPrueba = 7;
        Integer[] tablaPrueba = new Integer[tamPrueba];
        int[] claves = {15, 22, 18, 25, 32};
        int colisiones = 0;

        for (int k : claves) {
            int indice = Math.abs(k) % tamPrueba;
            System.out.print("Insertando " + k + " -> h(" + k + ") = " + indice);
            while (tablaPrueba[indice] != null) {
                colisiones++;
                indice = (indice + 1) % tamPrueba;
                System.out.print(" [Colisión -> nuevo índice " + indice + "]");
            }
            tablaPrueba[indice] = k;
            System.out.println(" -> Guardado en [" + indice + "]");
        }

        System.out.println("\nEstado final del arreglo:");
        for (int i = 0; i < tamPrueba; i++) {
            System.out.println("Índice [" + i + "]: " + (tablaPrueba[i] != null ? tablaPrueba[i] : "null"));
        }
        System.out.println("Total de colisiones ocurridas: " + colisiones + "\n");
    }

    public static void main(String[] args) {
        // Ejecutar demostración de la prueba de escritorio
        ejecutarPruebaEscritorio();

        // Comparativa con 10,000 productos
        System.out.println("=== 2. COMPARATIVA DE RENDIMIENTO (10,000 PRODUCTOS) ===");
        int cantidadDatos = 10000;
        Producto[] arregloSecuencial = new Producto[cantidadDatos];
        Producto[] arregloOrdenado = new Producto[cantidadDatos];
        TablaHash tablaHash = new TablaHash(TAM);

        Random rand = new Random(42);
        int codigoObjetivo = -1;

        for (int i = 0; i < cantidadDatos; i++) {
            // Generamos códigos únicos positivos y negativos para probar Math.abs()
            int codigo = (i + 1) * 13 + rand.nextInt(10);
            if (i % 500 == 0) codigo = -codigo; // Algunos códigos negativos
            Producto p = new Producto(codigo, "Producto_" + (i + 1), 10.0 + rand.nextDouble() * 500);

            arregloSecuencial[i] = p;
            arregloOrdenado[i] = p;
            tablaHash.insertar(p);

            if (i == 9500) {
                codigoObjetivo = codigo; // Elegimos un elemento insertado al final
            }
        }

        // Ordenar el arreglo para Búsqueda Binaria
        Arrays.sort(arregloOrdenado);

        System.out.println("Datos insertados: " + cantidadDatos + " | Tamaño Tabla Hash: " + TAM);
        System.out.println("Colisiones totales en inserción: " + tablaHash.getColisionesTotales());
        System.out.println("Buscando código objetivo: " + codigoObjetivo + "\n");

        // Medición Búsqueda Secuencial
        long inicioSec = System.nanoTime();
        Producto resSec = busquedaSecuencial(arregloSecuencial, codigoObjetivo);
        long finSec = System.nanoTime();
        long tiempoSec = finSec - inicioSec;

        // Medición Búsqueda Binaria
        long inicioBin = System.nanoTime();
        Producto resBin = busquedaBinaria(arregloOrdenado, codigoObjetivo);
        long finBin = System.nanoTime();
        long tiempoBin = finBin - inicioBin;

        // Medición Búsqueda Hash
        long inicioHash = System.nanoTime();
        Producto resHash = tablaHash.buscar(codigoObjetivo);
        long finHash = System.nanoTime();
        long tiempoHash = finHash - inicioHash;

        System.out.println("1. Búsqueda Secuencial -> Encontrado: " + (resSec != null) + " | Tiempo: " + tiempoSec + " ns");
        System.out.println("2. Búsqueda Binaria    -> Encontrado: " + (resBin != null) + " | Tiempo: " + tiempoBin + " ns");
        System.out.println("3. Búsqueda por Hash   -> Encontrado: " + (resHash != null) + " | Tiempo: " + tiempoHash + " ns");
    }
}

