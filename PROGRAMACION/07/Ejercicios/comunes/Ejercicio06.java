import java.util.Scanner;

public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        double precios[] = new double[5];
        double precioIva;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 5 precios: ");
        for (int i = 0; i < precios.length; i++) {
            precios[i] = reader.nextDouble();
        }

        System.out.println("Precios con iva: ");

        for (int i = 0; i < precios.length; i++) {
            precioIva = precioConIVA(precios[i]);
            System.out.println(precioIva);
        }

    }

    public static double precioConIVA(double precio){

        precio = precio + (precio * 0.21);

        return precio;

    }

}
