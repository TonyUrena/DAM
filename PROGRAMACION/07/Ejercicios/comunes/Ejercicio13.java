import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double precioDescontado, precioReal;

        System.out.println("Introduce el precio con el descuento aplicado.");
        precioDescontado = reader.nextDouble();
        System.out.println("Introduce el precio real.");
        precioReal = reader.nextDouble();

        System.out.println("El descuento aplicado al precio es del " +
                calculaDescuento(precioDescontado, precioReal) + "%");

    }

    public static double calculaDescuento(double precioDescontado, double precioReal) {

        return 100 / (precioReal / precioDescontado);

    }
}
