package ej12;

import java.util.Scanner;

public class Ej12 {

    public static void main(String args[]){

        float numero;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el número: ");
        numero = reader.nextFloat();

        if (numero >= 0){
            System.out.println("El número es positivo.");
        } else { 
            System.out.println("El número es negativo.");
        }
    }
}
