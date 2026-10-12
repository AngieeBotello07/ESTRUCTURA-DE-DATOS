public class PilaSimple {
    int[] datos = new int[5]; // Capacidad Fija de 5
    int tope = -1;            // Empieza Vacía

    // 1. Meter dato (Push) // Llenar la Pila
    void push(int x) {
        if (tope < datos.length - 1) {
            tope++;
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        } else {
            System.out.println("¡Pila Llena!");
        }
    }

    // 2. Sacar dato (Pop)
    void pop() {
        if (tope >= 0) {
            System.out.println("Sacaste: " + datos[tope]);
            tope--;
        } else
        {
            System.out.println("¡Pila Vacía!");
        }
    }
    // Ver la pila
    void mostrar() {
        System.out.print("Pila Actual: ");
        for (int i = 0; i <= tope; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}