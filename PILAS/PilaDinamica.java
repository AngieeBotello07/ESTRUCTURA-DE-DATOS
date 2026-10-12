public class PilaDinamica {
    Nodo cima; // Declarando un nodo llamado cima. El control remoto que apunta al elemento de arriba.

    // Constructor de la pila
    public PilaDinamica() {
        this.cima = null; // Arranca vacía
    }

    // Método PUSH (Meter elemento arriba)
    void push(int x) {
        Nodo nuevo = new Nodo(x); // 1. Creamos el nuevo nodo.
        nuevo.siguiente = cima;   // 2. El nuevo atrapa al viejo de la cima
        cima = nuevo;             // 3. Actualizamos la cima. El nuevo se convierte oficialmente en la cima
        System.out.println("Metiste a la pila dinámica: " + x);
    }

    // Método POP (Sacar el elemento de arriba)
    void pop() {
        if (!isEmpty()) { // Reutiliza isEmpty() para validar
            // NOTA: Si en tu clase Nodo usas 'valor' en lugar de 'dato', cámbialo aquí
            System.out.println("Sacaste de la pila: " + cima.dato);
            cima = cima.siguiente; // La cima se baja al siguiente nodo
        } else {
            System.out.println("¡Pila dinámica vacía! Subdesbordamiento de memoria (Stack Underflow).");
        }
    }

    // Método MOSTRAR (Recorrer e imprimir los elementos)
    void mostrar() {
        if (isEmpty()) {
            System.out.println("Pila Dinámica Actual: [Vacía]");
            return;
        }
        System.out.print("Pila Dinámica Actual: ");
        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.dato + " -> "); // Asegúrate de si es actual.dato o actual.valor
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // 4. Verificar si la cima no contiene nodos (AGREGADO)
    public boolean isEmpty() {
        return cima == null;
    }

    // 5. Consultar el valor en la cima sin desvincular el nodo (AGREGADO)
    public int peek() {
        if (!isEmpty()) {
            return cima.dato; // Retorna el dato apuntado por la cima actual
        } else {
            System.out.println("La pila dinámica está vacía. No hay elementos en la cima.");
            return -1; // Retorna un valor centinela por defecto
        }
    }
}
