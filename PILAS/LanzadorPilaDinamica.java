public class LanzadorPilaDinamica {
    public static void main(String[] args) {
        PilaDinamica pd = new PilaDinamica();

        // 1. Comprobación de pila vacía inicial
        System.out.println("¿La pila dinámica está vacía?: " + pd.isEmpty());

        // 2. Insertar elementos (Push)
        pd.push(50);
        pd.push(60);
        pd.push(70);
        pd.mostrar();

        // 3. Consultar la cima (Peek) sin alterar la estructura
        System.out.println("Elemento en la cima (peek): " + pd.peek());
        pd.mostrar(); // Sigue teniendo los mismos elementos

        // 4. Extraer elemento (Pop)
        pd.pop(); // Elimina y muestra el 70
        pd.mostrar();

        // 5. Nueva consulta tras la extracción
        System.out.println("Nueva cima (peek): " + pd.peek());
        System.out.println("¿La pila dinámica está vacía ahora?: " + pd.isEmpty());
    }
}
