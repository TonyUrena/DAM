package ej16;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {

        float nota;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce la nota: ");
        nota = reader.nextFloat();

        // Recorremos todas las condiciones y mostramos
        // la calificación alfabética en la que pueda 
        // incluirse la nota
        if(nota < 3){
            System.out.println("Muy deficiente.");
        } else if (nota >= 3 && nota < 5){
            System.out.println("Insuficiente.");
        } else if (nota >= 5 && nota < 6){
            System.out.println("Bien.");
        } else if (nota >= 6 && nota < 9){
            System.out.println("Notable.");
        } else if (nota >= 9 && nota <= 10){
            System.out.println("Sobresaliente.");
        }
    }
}
