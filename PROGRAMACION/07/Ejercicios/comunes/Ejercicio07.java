import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        double anchoRect, altoRect;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el alto del rectangulo:");
        altoRect = reader.nextDouble();
        System.out.println("Introduce el ancho del rectángulo:");
        anchoRect = reader.nextDouble();

        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo(anchoRect, altoRect));
        System.out.println("El área del rectángulo es: " + areaRectangulo(anchoRect, altoRect));

    }

    public static double perimetroRectangulo(double ancho, double alto){
        return ancho * 2 + alto * 2;
    }

    private static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }

}
