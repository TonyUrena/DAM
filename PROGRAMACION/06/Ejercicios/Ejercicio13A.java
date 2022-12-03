import java.util.Scaner;
import java.util.Scanner;


public class Ejercicio13A {

    public static void main(String[] args) {
        
        int numeroV, numeroI, numeroN, numeroIncrementado;
        int[] secAritmetica;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el valor inicial:");
        numeroV = reader.nextInt();
        System.out.println("Introduce el incremento: ");
        numeroI = reader.nextInt();
        System.out.println("Introduce el numero de valores a crear: ");
        numeroN = reader.nextInt();
        System.out.println();

        secAritmetica = new int[numeroN];
        secAritmetica[0] = numeroV;

        for (int i = 1; i < numeroN; i++) {
            
            numeroIncrementado = secAritmetica[i - 1] + numeroI;
            secAritmetica[i] = numeroIncrementado;

        }

        for (int i = 0; i < numeroN; i++) {
            
            System.out.print(secAritmetica[i] + " ");

        }

        System.out.println();

    }
}