package ej08;

import java.util.Scanner;

public class Ej08 {
    
    public static void main(String args[]){

        int edad;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        edad = reader.nextInt();
        
        if (edad >= 18){
            System.out.println("Eres mayor de edad.");
        }
    }
}
