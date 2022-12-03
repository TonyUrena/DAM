package ej15;

import java.util.Scanner;

import ej16.Ej16;

public class Ej15 {
    
    public static void main(String args[]){

        float numero01, numero02, numero03;
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        numero01 = reader.nextFloat();
        System.out.println("Escribe el segundo numero: ");
        numero02 = reader.nextFloat();
        System.out.println("Escribe el tercer numero: ");
        numero03 = reader.nextFloat();

        // Ifs anidados para determinar el número mayor.
        if (numero01 > numero02){
            if (numero02 > numero03){
                System.out.println("El número mayor es: " + numero01);
            } else if (numero01 > numero03){
                System.out.println("El número mayor es: " + numero01);
            } else {
                System.out.println("El número mayor es: " + numero03);
            }
        } else if (numero02 > numero03) {
            if (numero01 > numero03) {
                System.out.println("El número mayor es: " + numero02);
            } else {
                System.out.println("El número mayor es: " + numero02);
            }
        } else {
            System.out.println("El número mayor es: " + numero03);
        }
    }
}
