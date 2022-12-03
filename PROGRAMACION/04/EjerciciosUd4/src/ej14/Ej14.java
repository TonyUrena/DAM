package ej14;

import java.util.Scanner;

public class Ej14 {
    
    public static void main(String args[]){

        float numero01, numero02;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        numero01 = reader.nextFloat();
        System.out.println("Introduce el segundo numero: ");
        numero02 = reader.nextFloat();

        if (numero01 == numero02){
            System.out.println("Ambos números son iguales.");
        } else if (numero01 > numero02){
            System.out.println("El número mayor es: " + numero01);
            } else {System.out.println("El número mayor es: " + numero02);}
    }
}