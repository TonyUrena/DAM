import java.util.Scanner;
import java.math;

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce un valor");

        double valores[] = new double[reader.nextInt()];

        rellenaAleatorio(valores);
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

    }

    public static void rellenaAleatorio (double[]valores){
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Math.random();
        }

    }

}
