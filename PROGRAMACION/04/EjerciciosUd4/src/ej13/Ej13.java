package ej13;

import java.util.Scanner;

public class Ej13 {
    
    public static void main(String args[]){

        float numero01, numero02;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        numero01 = reader.nextFloat();
        System.out.println("Introduce el segundo numero");
        numero02 = reader.nextFloat();

        if (numero01 < numero02){
            System.out.println(numero01 + "\n" + numero02);
        } else {System.out.println(numero02 + "\n" + numero01);}
    }
}