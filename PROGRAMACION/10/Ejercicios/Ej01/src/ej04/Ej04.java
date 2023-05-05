package ej04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {

        int vector[], numPosicion;
        Scanner reader = new Scanner(System.in);

        try {

            vector = new int[(int) (Math.random() * 100 + 1)];

            for (int i = 0; i < vector.length; i++) {

                vector[i] = (int) (Math.random() * 10 + 1);
            }

            do {
                System.out.println("Introduce la posicion: ");
                numPosicion = reader.nextInt();
                
                System.out.println("Valor de la posicion " + numPosicion + ": " + vector[numPosicion]);

            } while (numPosicion >= 0);

        } catch (InputMismatchException ex1) {
            System.err.println("ERROR: carácter no válido introducido.");
        } catch (ArrayIndexOutOfBoundsException ex2){
            System.err.println("ERROR: Posición fuera del rango del vector.");
        }
    }

}
