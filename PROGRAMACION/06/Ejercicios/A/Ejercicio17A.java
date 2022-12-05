import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio17A {
    
    public static void main(String[] args) {
        
        int[] array10A = new int[10];
        int[] array10B = new int[10];
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 20 números:");
        for (int i = 0; i < 10; i++) {
            array10A[i] = reader.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            array10B[i] = reader.nextInt();
        }

        if (Arrays.equals(array10A, array10B)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }

    }

}
