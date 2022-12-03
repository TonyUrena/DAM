package ej04;

import java.util.Scanner;

public class Ej04 {
    
    public static void main(String[] args) {
        
        float num01, num02;
        float suma, resta, multi, divis;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        num01 = reader.nextFloat();
        System.out.println("Introduce el segundo número: ");
        num02 = reader.nextFloat();
        
        suma  = num01 + num02;
        resta = num01 - num02;
        multi = num01 * num02;
        divis = num01 / num02;
        
        System.out.println(
                "Suma: "  + suma + "\n" +
                "Resta: " + resta + "\n" +
                "Multiplicacion: " + multi + "\n" +
                "División: " + divis);
    }
    
}