import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        
        int numeroA, numeroB, contadorPares = 0;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Dime un número: ");
        numeroA = reader.nextInt();
        
        do {
            System.out.println("Dime otro número mayor al anterior: ");
            numeroB = reader.nextInt();

            if (numeroB <= numeroA) {
                System.out.print("ERROR, " + numeroB + " no es mayor a " + numeroA);
            }

        } while (numeroB <= numeroA);

        for (int i = numeroA; i <= numeroB; i++) {
            System.out.print(i + " ");
            
            if (i % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("\nLa cantidad de pares son: " + contadorPares);
    }
    
}