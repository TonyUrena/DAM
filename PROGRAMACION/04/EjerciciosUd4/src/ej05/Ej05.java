package ej05;

import java.util.Scanner;

public class Ej05 {
    
    public static void main(String[] args) {
        
        double radio, longCircunf, areaCirculo, volumEsfera;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce un valor para el radio en: ");
        radio = reader.nextFloat();
        
        longCircunf = 2 * Math.PI * radio;
        areaCirculo = Math.pow(longCircunf,2);
        volumEsfera = Math.pow(longCircunf,3);
        
        System.out.println("Longitud de la Circunferencia: " + longCircunf + "\n" +
                           "Área del Círculo: " + areaCirculo + "\n" +
                           "Volumen de la Esfera: " + volumEsfera);
    }
    
}