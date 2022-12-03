import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int numero;

        System.out.print("Dime un número: ");
        numero = reader.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }

    }

}
