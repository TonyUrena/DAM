/*
 *
 *  Toni Ureña Fortuño 
 * 
 */

import java.util.Scanner;

public class Ecuacion {

    public static void main(String[] args) {

        double numeroA, numeroB, numeroC, numeroXSuma,
               numeroXResta, numeroXIguales, discriminante, raizCuadrada;
        Scanner reader = new Scanner(System.in);

        // Necesitamos que el programa se ejecute una vez, por lo que igualamos siNo a S
        String siNo = "s";

        // Utilizamos un do while con dos condiciones relacionadas con un OR:
        // así se ejecuta el código si la respuesta es S o distinto a N.
        // Con esto se ejecutará con S o cualquier otra letra.
        do {

            // Pedimos números y calculamos sólo si el usuario ha respondido "s"
            // Con esto saltamos el código si se introduce cualquier otra letra.
            // El else pedimos al usuario que introduzca S o N.
            if (siNo.equalsIgnoreCase("s")) {

                System.out.println("Introduce el número a");
                numeroA = reader.nextFloat();
                System.out.println("Introduce el número b");
                numeroB = reader.nextFloat();
                System.out.println("Introduce el número c");
                numeroC = reader.nextFloat();

                // nextLine para borrar el \n del buffer debido al bug de scanner
                siNo = reader.nextLine();

                discriminante = Math.pow(numeroB, 2) - 4 * numeroA * numeroC;

                if (discriminante > 0) {

                    raizCuadrada = Math.sqrt(discriminante);
                    numeroXSuma = 0 - numeroB + raizCuadrada;
                    numeroXResta = 0 - numeroB - raizCuadrada;

                    System.out.println("x1=" + numeroXSuma + " x2=" + numeroXResta);

                } else if (discriminante == 0) {

                    numeroXIguales = 0 - (numeroB / (2 * numeroA));

                    System.out.println("Raíces iguales x1=x2=" + numeroXIguales);

                } else if (discriminante < 0) {

                    System.out.println("Raíces Complejas");

                }

            } else {
                System.out.println("Responde S o N por favor.");
            }

            System.out.println("¿Desea resolver otra ecuación de 2º grado s/n?");
            siNo = reader.nextLine();

        } while (siNo.equalsIgnoreCase("s") || !siNo.equalsIgnoreCase("n"));

    }

}
