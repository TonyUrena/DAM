import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
            
            Scanner reader = new Scanner(System.in);
            double numero1, numero2;

            System.out.println("Introduce dos números reales: ");
            numero1 = reader.nextDouble();
            numero2 = reader.nextDouble();

        }

    public static double multiplica(double a, double b){

        double producto;

        producto = a * b;

        return producto;
    }
}
