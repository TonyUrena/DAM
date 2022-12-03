import java.util.Scanner;

public class Ejercicio08A {

    public static void main(String[] args) {
        
        double[] array100 = new double[100];
        double numeroR;
        int contadorIgualMayor = 0;
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            
            array100[i] = Math.random();

        }

        System.out.println("Introduce un número real: ");
        numeroR = reader.nextDouble();

        for (int i = 0; i < 100; i++) {

            if(array100[i] >= numeroR){
                contadorIgualMayor++;
            }

        }

        System.out.println("Hay " + contadorIgualMayor + " números iguales o mayores en el Array.");

    }
    
}
