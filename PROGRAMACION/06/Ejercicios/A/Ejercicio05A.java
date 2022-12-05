import java.util.Scanner;

public class Ejercicio05A {
    
    public static void main(String[] args) {

        float[] numeros = new float[20];
        float sumaNumeros = 0, media;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 20 números");

        for (int i = 0; i < 20; i++) {

            numeros[i] = reader.nextFloat();
            sumaNumeros = sumaNumeros + numeros[i];
        }

        media = sumaNumeros / 20;

        System.out.println("Los media de los números que introduciste es: " + media);
            
    }
}
