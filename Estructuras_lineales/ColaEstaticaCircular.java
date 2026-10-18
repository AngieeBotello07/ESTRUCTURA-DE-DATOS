package Estructuras_lineales;

public class ColaEstaticaCircular {
    // --- APARTADO DE ATRIBUTOS ---
    private int[] info;   // Contenedor físico indexado.
    private int frente;   // Índice circular del frente de la fila.
    private int fin;      // Índice circular del final de la fila.
    private int MAX;      // Tamaño límite físico del arreglo.
    private int tamano;   // Contador explícito de elementos vigentes en la cola.

    // --- APARTADO DE CONSTRUCTOR ---
    public ColaEstaticaCircular(int tamanoMax) {
        this.MAX = tamanoMax;
        this.info = new int[MAX];
        this.frente = 0;
        this.fin = -1;
        this.tamano = 0; // Inicia con 0 elementos activos.
    }

    // --- APARTADO DE MÉTODOS DE VALIDACIÓN ---
    public boolean estaVacia() {
        return tamano == 0; // Depende directamente del contador de elementos activos.
    }

    public boolean estaLlena() {
        return tamano == MAX; // Está llena si el número de elementos iguala el espacio total del arreglo.
    }

    // --- APARTADO DE OPERACIONES PRINCIPALES ---
    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("Error: La cola circular está llena.");
            return;
        }
        // OPERACIÓN CLAVE: El operador % (módulo) hace que si 'fin' llega al final (ej. casilla 4 de 5),
        // vuelva automáticamente a reiniciar a la posición cero (4 + 1 = 5 % 5 = 0) de forma circular.
        fin = (fin + 1) % MAX;
        info[fin] = x;
        tamano++; // Incrementa los elementos en uso.
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("Error: La cola circular está vacía.");
            return -1;
        }
        int valor = info[frente];
        // OPERACIÓN CLAVE: Avanza el frente de manera envolvente y circular.
        frente = (frente + 1) % MAX;
        tamano--; // Decrementa los elementos vigentes.
        return valor;
    }

    // --- APARTADO SOLICITADO: MÉTODO PEEK COMPLEMENTADO ---
    public int peek() {
        // Valida si la cola está vacía (tamaño == 0)
        if (estaVacia()) {
            System.out.println("La cola circular está vacía.");
            return -1;
        }
        // Si no está vacía, retorna el elemento en 'frente' sin modificar los apuntadores.
        return info[frente];
    }

    // --- APARTADO DE DESPLIEGUE ---
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola circular vacía");
            return;
        }
        System.out.print("Frente -> ");
        int aux = frente; // Usa un índice auxiliar para no corromper la variable original 'frente'.
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + info[aux] + "] ");
            aux = (aux + 1) % MAX; // Avanza el auxiliar circularmente.
        }
        System.out.println("<- Fin");
    }
}
