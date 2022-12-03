import java.util.Scanner;

/**
 * Ejercicio15
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        float numero;
        int contMultiplos = 0;
        Scanner reader = new Scanner(System.in);

        System.out.print("Dime un número: ");
        numero = reader.nextFloat();

        for (int i = 1; i < numero; i++) {

            if (i % 3 == 0) {
                contMultiplos++;
            }
            
        }

        System.out.println("Cantidad de multiplos de 3: " + contMultiplos);
        
    }
}