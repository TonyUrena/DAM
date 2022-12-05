import java.util.Scanner;
import java.util.Arrays;

public interface Ejercicio15A {
     
    public static void main(String[] args) {
    
        int numeroN, numeroM;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
        numeroN = reader.nextInt();
        System.out.println("Introduce el número a almacenar");
        numeroM = reader.nextInt();

        int[] arrayN = new int[numeroN];

        Arrays.fill(arrayN, numeroM);

        System.out.println(Arrays.toString(arrayN));

    }
}
