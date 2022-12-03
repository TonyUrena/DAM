import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        int numero;
        int factorial = 1;

        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe un número para realizar su factorial: ");
        numero = reader.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }

    }
    
}
