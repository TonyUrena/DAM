import java.util.Scanner;

public class Ejercicio06A {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int numeroN, numeroM;

        System.out.println("Introduce la longitud del Array: ");
        numeroN = reader.nextInt();

        System.out.println("Escribe el número a introducir en el Array: ");
        numeroM = reader.nextInt();

        int[] arrayN = new int[numeroN];

        for (int i = 0; i < numeroN; i++) {
            arrayN[i] = numeroM;
            
            System.out.print(arrayN[i] + " ");

        }
        
        System.out.println();
    }
}
