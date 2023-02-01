import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        double kilometros;

        System.out.println("Introduce los kilómetros: ");
        kilometros = reader.nextDouble();

        System.out.println(kilometros + "km. son " + calculaMillas(kilometros) + " millas.");

    }

    public static double calculaMillas(double kilometros){

        return kilometros * 1.60934;

    }
}
