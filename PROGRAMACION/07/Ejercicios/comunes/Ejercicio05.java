import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        int millas;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce las millas: ");
        millas = reader.nextDouble();

        System.out.println(millas + " millas son: " + millas_a_kilometros(millas) + " Kilómetros");

    }
    public static double millas_a_kilometros(int millas){

        double kilometros;

        kilometros = millas * 1.60934;

        return kilometros;
    }
}
