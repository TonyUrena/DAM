import java.util.Scanner;

public class Ejercicio02A {
    
    public static void main(String[] args) {
            
        float[] numeros = new float[10];
        float sumaNumeros = 0;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 10 números");

        for (int i = 0; i < 10; i++) {
            numeros[i] = reader.nextfloat();
            sumaNumeros = sumaNumeros + numeros[i];
        }

        System.out.println("Los suma de los números que introduciste es: " + sumaNumeros);
            
        }
}