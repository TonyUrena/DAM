package ej07;

import java.util.Scanner;

public class Ej07 {
    
    public static void main(String args[]){

        float distanciaMillas, distanciaMetros;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce la distancia en millas marinas: ");
        distanciaMillas = reader.nextFloat();

        distanciaMetros = distanciaMillas * 1852;

        System.out.println(distanciaMillas + " millas marinas equivalen a " + distanciaMetros + "m.");
    }

}