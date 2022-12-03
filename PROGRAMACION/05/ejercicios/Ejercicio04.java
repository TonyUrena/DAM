import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        int numero;
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe un número hasta el que contaremos: ");
        numero = reader.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }

    }
    
}
