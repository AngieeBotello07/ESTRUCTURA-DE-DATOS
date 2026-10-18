package Estructuras_lineales;

import Estructuras_lineales.ColaEstaticaCircular;

public class MainColaCircular {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");
        // Instanciamos la clase correcta que tienes en tu proyecto
        ColaEstaticaCircular colaCirc = new ColaEstaticaCircular(3);

        System.out.println("Encolando elementos...");
        colaCirc.encolar(100);
        colaCirc.encolar(200);
        colaCirc.encolar(300);
        colaCirc.mostrar();

        System.out.println("Elemento al frente (peek): " + colaCirc.peek());
        System.out.println("Desencolando: " + colaCirc.desencolar());

        System.out.println("Encolando elemento circular (400):");
        colaCirc.encolar(400);
        colaCirc.mostrar();
        System.out.println("Elemento al frente actual (peek): " + colaCirc.peek());
    }
}
