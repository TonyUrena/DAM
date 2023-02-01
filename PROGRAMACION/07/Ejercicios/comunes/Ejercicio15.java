import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        int[] naturales100 = new int[100];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < naturales100.length; i++) {
            naturales100[i] = i + 1;
        }

        System.out.println("Sumatorio: " + sumaTotalArray(naturales100));
        System.out.println("Media: " + mediaTotalArray(naturales100));

    }

    public static int sumaTotalArray(int[] numeros){

        int sumatorio = 0;

        for (int i = 0; i < numeros.length; i++) {
            sumatorio = sumatorio + numeros[i];
        }

        return sumatorio;
    }

    public static double mediaTotalArray(int[] numeros){

        return sumaTotalArray(numeros) / numeros.length;

    }

}
