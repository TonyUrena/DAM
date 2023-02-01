import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número: ");
        numero = reader.nextInt();

        dibujaTabla(numero);

    }

    public static void dibujaTabla(int numero){

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }

    }
}
