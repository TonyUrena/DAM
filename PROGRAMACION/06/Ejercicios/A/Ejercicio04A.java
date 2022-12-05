import java.util.Scanner;

public class Ejercicio04A {
    
    public static void main(String[] args) {

        float[] numeros = new float[20];
        float sumaNumerosPos = 0, sumaNumerosNeg = 0;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 20 números");

        for (int i = 0; i < 20; i++) {

            numeros[i] = reader.nextFloat();

        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] > 0) {
                sumaNumerosPos = sumaNumerosPos + numeros[i];
            } else {
                sumaNumerosNeg = sumaNumerosNeg + numeros[i];
            }
        }

        System.out.println("Los suma de los números positivos que introduciste es: " + sumaNumerosPos);
        System.out.println("Los suma de los números negativos que introduciste es: " + sumaNumerosNeg);
            
    }
}
