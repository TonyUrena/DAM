import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20A {

    public static void main(String[] args) {
        
        int[] array1000 = new int[1000];
        int valorN;
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 1000; i++) {
            
            array1000[i] = (int)(Math.random() * 100);

        }

        System.out.println("Dame un valor y lo buscaré en el array: ");
        valorN = reader.nextInt();
        
        Arrays.sort(array1000);

        Arrays.binarySearch(array1000, valorN);

        if 
    }
    
}
