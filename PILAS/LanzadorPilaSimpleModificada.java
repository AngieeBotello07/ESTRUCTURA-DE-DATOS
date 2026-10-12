public class LanzadorPilaSimpleModificada {
    public static void main(String[] args) {
        PilaSimpleModificada p = new PilaSimpleModificada();

        // Demostración de isEmpty al inicio
        System.out.println("¿La pila está vacía inicialmente?: " + p.isEmpty());

        p.push(10);
        p.push(20);
        p.push(30);
        p.mostrar();

        // Demostración de peek()
        System.out.println("Elemento en el tope (peek): " + p.peek());

        p.pop(); // Saca el 30
        p.mostrar();

        System.out.println("Nuevo elemento en el tope (peek): " + p.peek());
        System.out.println("¿La pila está llena?: " + p.isFull());
    }
}
