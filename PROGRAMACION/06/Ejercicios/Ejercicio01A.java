import java.util.Scanner;

public class Ejercicio01A {

    public static void main(String[] args) {
        
        float[] numeros = new float[10];
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 10 números");

        for (int i = 0; i < 10; i++) {
            numeros[i] = reader.nextfloat();
        }

        System.out.println("Los números que introduciste son:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " - ");
        }

    }
}