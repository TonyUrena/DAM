package ej17;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
        
        int horas, minutos, segundos;
        Scanner reader = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        horas = reader.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = reader.nextInt();
        System.out.print("Introduce los segundos: ");
        segundos = reader.nextInt();

        // Incrementamos un segundo. 
        // Si alguno de los valores alcanza el límite,
        // volvemos su valor a 0 y acarreamos 1 al 
        // siguiente valor.

        segundos++;

        if (segundos == 60){
            segundos = 0;
            minutos++;
        }
        if (minutos == 60){
            minutos = 0;
            horas++;
        }
        if (horas == 24){
            horas = 0;
        }

        System.out.println("La nueva hora después de un segundo será: " +
                           horas + ":" + minutos + ":" + segundos);
    }
}