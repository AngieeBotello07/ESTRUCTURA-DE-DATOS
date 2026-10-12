public class PilaSimpleModificada {
    int[] datos = new int[5]; // Capacidad Fija de 5
    int tope = -1;            // Empieza Vacía

    // 1. Meter dato (Push) // Llenar la Pila
    void push(int x) {
        if (!isFull()) { // Utiliza el nuevo método isFull()
            tope++;
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        } else {
            System.out.println("¡Pila Llena! Desbordamiento de memoria (Stack Overflow).");
        }
    }

    // 2. Sacar dato (Pop)
    void pop() {
        if (!isEmpty()) { // Utiliza el nuevo método isEmpty()
            System.out.println("Sacaste: " + datos[tope]);
            tope--;
        } else {
            System.out.println("¡Pila Vacía! Subdesbordamiento de memoria (Stack Underflow).");
        }
    }

    // 3. Ver la pila
    void mostrar() {
        if (isEmpty()) {
            System.out.println("Pila Actual: [Vacía]");
            return;
        }
        System.out.print("Pila Actual: ");
        for (int i = 0; i <= tope; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    // 4. Verificar si la Pila está Vacía (AGREGADO)
    boolean isEmpty() {
        return tope == -1;
    }

    // 5. Verificar si el arreglo alcanzó su límite (AGREGADO)
    boolean isFull() {
        return tope == datos.length - 1;
    }

    // 6. Consultar el elemento en el tope sin eliminarlo (AGREGADO)
    int peek() {
        if (!isEmpty()) {
            return datos[tope];
        } else {
            System.out.println("La Pila está Vacía. No hay elementos en el tope.");
            return -1; // Retorna un valor centinela por defecto
        }
    }
}
