import java.util.Scanner;

public class Ejercicio12{

    public static void main(String[] args) {

        float base, potencia, numElevado = 1;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        base = reader.nextFloat();
        System.out.println("Introduce la potencia: ");
        potencia = reader.nextFloat();

        for (int i = 1; i <= potencia; i++) {
            numElevado = numElevado * base;
        }

        System.out.println(numElevado);
    }
}