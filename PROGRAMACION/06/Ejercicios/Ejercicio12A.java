import java.util.Scanner;

public class Ejercicio12A {
    
    public static void main(String[] args) {
        
        int[] array10 = new int[10];
        int valorV, posicionP;
        Scanner reader = new Scanner(System.in);
        String selector;

        do {
            
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir.");

            selector = reader.nextLine();

            switch (selector) {
                case "a":

                    System.out.println();

                    for (int i = 0; i < 10; i++) {

                        System.out.print(array10[i] + " ");

                    }

                    System.out.println("\n");
                    
                    break;
            
                case "b":

                    System.out.println("\nIntroduce un valor: ");
                    valorV = reader.nextInt();
                    System.out.println("Introduce la posición en el array: ");
                    posicionP = reader.nextInt();

                    array10[posicionP] = valorV;
                    
                    System.out.println();

                    //Para prevenir el bug de Scanner
                    reader.nextLine();

                    break;

                case "c":
                    break;

                default:
                    System.err.println("\nSelecciona una opción correcta.\n");
                    break;
            }

        } while (!selector.equalsIgnoreCase("c"));

    }
}
