package Estructuras_lineales;

public class ColaEstatica {
    // --- APARTADO DE ATRIBUTOS ---
    private int[] info;  // Arreglo físico que almacenará los datos de la cola.
    private int frente;  // Índice que apunta a la posición del elemento que va a salir.
    private int fin;     // Índice que apunta a la posición del último elemento insertado.
    private int MAX;     // Capacidad máxima de almacenamiento establecida.

    // --- APARTADO DE CONSTRUCTOR ---
    public ColaEstatica(int tamano) {
        this.MAX = tamano;
        this.info = new int[MAX]; // Se reserva el espacio contiguo en memoria RAM.
        this.frente = 0;          // El frente inicia en la casilla 0.
        this.fin = -1;            // El fin inicia en -1 porque aún no hay datos encolados.
    }

    // --- APARTADO DE MÉTODOS DE VALIDACIÓN ---
    public boolean estaVacia() {
        // Si el frente sobrepasa al fin, significa que ya se extrajo todo.
        return frente > fin;
    }

    public boolean estaLlena() {
        // Si el fin llegó a la última casilla del arreglo, la estructura está llena.
        return fin == MAX - 1;
    }

    // --- APARTADO DE OPERACIONES PRINCIPALES ---
    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("Error: La cola estática está llena.");
            return; // Termina la función prematuramente para evitar un desbordamiento de índice.
        }
        fin++;            // 1. Mueve el puntero "fin" a la siguiente casilla libre.
        info[fin] = x;    // 2. Coloca el dato en dicha casilla.
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("Error: La cola estática está vacía.");
            return -1; // Retorna un código de error si no hay datos.
        }
        int valor = info[frente]; // 1. Copia el valor del elemento que está al frente.
        frente++;                 // 2. Desplaza el frente hacia adelante para "eliminar" el acceso lógico al dato.
        return valor;             // 3. Devuelve el número extraído.
    }

    // --- APARTADO EXTENDIDO: OPERACIÓN PEEK ---
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía (No hay elementos al frente).");
            return -1;
        }
        return info[frente]; // Retorna el dato actual del frente SIN incrementar la variable 'frente'.
    }

    // --- APARTADO DE DESPLIEGUE ---
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Frente -> ");
        // Recorre únicamente el segmento activo del arreglo desde 'frente' hasta 'fin'
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + info[i] + "] ");
        }
        System.out.println("<- Fin");
    }
}
