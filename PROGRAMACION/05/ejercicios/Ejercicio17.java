import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int numero1, numero2, numerosFallados = 0, numerosTotales = 0;

        System.out.print("Dime un número inicial: ");
        numero1 = reader.nextInt();

        do {
            System.out.print("Dime un número: ");
            numero2 = reader.nextInt();

            if (numero2 <= numero1) {
                System.out.println("Fallo es menor.");
                numerosFallados++;
            } else {
            }

            numero1 = numero2;
            numerosTotales++;

        } while (numero2 != 0);

        System.out.println("Total de números introducidos: " + numerosTotales);
        System.out.println("Números Fallados: " + numerosFallados);

    }
    
}
