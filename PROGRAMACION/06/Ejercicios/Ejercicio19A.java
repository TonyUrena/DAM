import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19A {
    
    public static void main(String[] args) {
        
        int[] arrayPuntuaciones = new int[8];
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce las puntuaciones: ");

        for (int i = 0; i < 8; i++) {
            
            arrayPuntuaciones[i] = reader.nextInt();

        }

        Arrays.sort(arrayPuntuaciones);
        
        for (int i = 7; i > 0; i--) {
            System.out.print(arrayPuntuaciones[i] + " - ");
        }
        
    }

}
