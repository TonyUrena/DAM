import java.util.Scanner;

public class Ejercicio03A {

    public static void main(String[] args) {
            
        float[] numeros = new float[10];
        float numeroMayor, numeroMenor;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 10 números");

        for (int i = 0; i < 10; i++) {
            
            numeros[i] = reader.nextFloat();

        }

        numeroMayor = numeros[0];
        numeroMenor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            } else if( numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }

        }

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);

        }
}
