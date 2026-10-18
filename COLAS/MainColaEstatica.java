package Estructuras_lineales;

public class MainColaEstatica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA LINEAL ===");

        // Inicialización directa sin subpaquetes inventados
        ColaEstatica cola = new ColaEstatica(3);

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Desencolando: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Nuevo elemento al frente (peek): " + cola.peek());
    }
}
