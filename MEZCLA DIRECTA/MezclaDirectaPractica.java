import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MezclaDirectaPractica {

    public static void intercalarBloques(String archivoF1, String archivoF2, String archivoSalida, int L) {
        try (
                BufferedReader lector1 = new BufferedReader(new FileReader(archivoF1));
                BufferedReader lector2 = new BufferedReader(new FileReader(archivoF2));
                PrintWriter escritor = new PrintWriter(new FileWriter(archivoSalida))
        ) {
            String linea1 = lector1.readLine();
            String linea2 = lector2.readLine();

            int elementosEscritos1 = 0;
            int elementosEscritos2 = 0;

            while (linea1 != null && linea2 != null) {
                // CASO 1: Todavía quedan elementos por comparar en AMBOS bloques de tamaño L
                if (elementosEscritos1 < L && elementosEscritos2 < L) {
                    int val1 = Integer.parseInt(linea1.trim());
                    int val2 = Integer.parseInt(linea2.trim());

                    if (val1 <= val2) {
                        escritor.println(val1);
                        linea1 = lector1.readLine();
                        elementosEscritos1++;
                    } else {
                        escritor.println(val2);
                        linea2 = lector2.readLine();
                        elementosEscritos2++;
                    }
                }
                // CASO 2: El bloque de F2 ya llegó a L, vaciamos lo que sobró del bloque de F1
                else if (elementosEscritos1 < L) {
                    escritor.println(linea1.trim());
                    linea1 = lector1.readLine();
                    elementosEscritos1++;
                }
                // CASO 3: El bloque de F1 ya llegó a L, vaciamos lo que sobró del bloque de F2
                else if (elementosEscritos2 < L) {
                    escritor.println(linea2.trim());
                    linea2 = lector2.readLine();
                    elementosEscritos2++;
                }

                // Si ambos bloques completaron L elementos, reiniciamos los contadores para el siguiente bloque
                if (elementosEscritos1 == L && elementosEscritos2 == L) {
                    elementosEscritos1 = 0;
                    elementosEscritos2 = 0;
                }
            }

            // Vaciar los elementos restantes si F1 aún tiene datos y F2 ya terminó
            while (linea1 != null) {
                escritor.println(linea1.trim());
                linea1 = lector1.readLine();
            }

            // Vaciar los elementos restantes si F2 aún tiene datos y F1 ya terminó
            while (linea2 != null) {
                escritor.println(linea2.trim());
                linea2 = lector2.readLine();
            }

            System.out.println("Bloques intercalados con exito!");

        } catch (IOException e) {
            System.out.println("Error en E/S de archivos: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        intercalarBloques("f1.txt", "f2.txt", "f3.txt", 1);
    }
}
