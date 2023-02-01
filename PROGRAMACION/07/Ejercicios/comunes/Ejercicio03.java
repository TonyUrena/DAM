import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        int a, b;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce dos numeros.");
        a = reader.nextInt();
        b = reader.nextInt();

        System.out.println("El número menor es: " +  minimo(a, b));

    }

    public static int minimo(int a, int b){
        
        int minimo;

        if (a < b){
            minimo = a;
        } else {
            minimo = b;
        }

        return minimo;
    }

}
