package Estructuras_lineales;

public class MainColaDinamica {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE COLA DINÁMICA ---");

        // Inicialización directa y correcta de la clase ColaDinamica
        ColaDinamica colaDin = new ColaDinamica();

        // Apartado de prueba de extensiones
        colaDin.encolar(5);
        colaDin.encolar(15);
        colaDin.encolar(25);
        colaDin.mostrar();

        // Despliega el resultado de los dos métodos de análisis añadidos
        System.out.println("Total de nodos activos recorridos: " + colaDin.contarElementos());
        System.out.println("Nodo al frente detectado (peek): " + colaDin.peek());
    }
}
