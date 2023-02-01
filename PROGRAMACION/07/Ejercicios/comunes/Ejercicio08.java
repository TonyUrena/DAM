import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        int numero;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        numero = reader.nextInt();
        
        System.out.println("Sumatorio de 1 a tu número: ");
        suma1aN(numero);
        System.out.println("Productorio de 1 a tu número: ");
        producto1aN(numero);
        System.out.println("Valor intermedio de 1 a tu número: ");
        intermedio1aN(numero);
    }

    public static int suma1aN(int n){
        
        for (int i = 0; i < n; i++) {
            n = n + i;
        }

        return n;
    }

    public static int producto1aN(int n){

        for (int i = 0; i < n; i++) {
            n = n * i;
        }

        return n;
    }

    public static double intermedio1aN(int n){

        int sumatorio = 0;
        double intermedio;
        for (int i = 0; i < n; i++) {
            sumatorio = sumatorio + i;
        }
        intermedio = sumatorio / n;

        return intermedio;
    }
}
