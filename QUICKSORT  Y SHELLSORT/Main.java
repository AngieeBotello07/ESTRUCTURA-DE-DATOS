package Metodos_de_ordenamiento;

public class Main {
    public static void main(String[] args) {
        // Arreglo original de prueba
        int[] arregloOriginal = {6, 1, 5, 8, 3, 2, 7, 4};

        // --- PRUEBA CON QUICKSORT ---
        // Hacemos una copia del arreglo original para que ShellSort reciba los datos sin ordenar
        int[] arregloQuick = arregloOriginal.clone();

        System.out.println("=== MÉTODO QUICKSORT ===");
        System.out.println("Arreglo original:");
        QuickSort.imprimirArreglo(arregloQuick);

        QuickSort.ordenar(arregloQuick, 0, arregloQuick.length - 1);

        System.out.println("Arreglo ordenado con QuickSort:");
        QuickSort.imprimirArreglo(arregloQuick);

        System.out.println(); // Línea en blanco para separar resultados

        // --- PRUEBA CON SHELLSORT ---
        // Hacemos otra copia del arreglo original
        int[] arregloShell = arregloOriginal.clone();

        System.out.println("=== MÉTODO SHELLSORT ===");
        System.out.println("Arreglo original:");
        ShellSort.imprimirArreglo(arregloShell);

        ShellSort.ordenar(arregloShell);

        System.out.println("Arreglo ordenado con ShellSort:");
        ShellSort.imprimirArreglo(arregloShell);
    }
}
