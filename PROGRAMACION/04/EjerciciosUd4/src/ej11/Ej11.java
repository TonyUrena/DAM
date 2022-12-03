package ej11;

import java.util.Scanner;

public class Ej11 {

    public static void main(String args[]){

        float numero01, numero02;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        numero01 = reader.nextFloat();
        System.out.println("Introduce el segundo número: ");
        numero02 = reader.nextFloat();

        if (numero01 > numero02){
            System.out.println("El número mayor es: " + numero01);
        } else {System.out.println("El número mayor es: " + numero02);}

    }
    
}
