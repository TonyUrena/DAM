package ej10;

import java.util.Scanner;

public class Ej10 {
    
    public static void main(String args[]){

        float numero01, numero02, suma, resta, producto, division;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        numero01 = reader.nextFloat();

        System.out.println("Introduce el segundo número");
        numero02 = reader.nextFloat();

        suma = numero01 + numero02;
        resta = numero01 - numero02;
        producto = numero01 * numero02;
        division = numero01 / numero02;

        System.out.println("Suma: " + suma + "\n" +
                           "Resta: " + resta + "\n" +
                           "Producto: " + producto + "\n" +
                           "División: " + division);
    }
}