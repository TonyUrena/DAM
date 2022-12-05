import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01B {

    public static void main(String[] args) {
        
        String frase;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        frase = reader.nextLine();

        System.out.println(Arrays.toString(frase.split(" ")));
    }
}
