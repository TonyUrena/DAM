package ej06;

import java.util.Scanner;

public class Ej06 {

    public static void main(String args[]){
    
        float precioArticulo, precioVenta, porcenDescuento;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el precio original del artículo: ");
        precioArticulo = reader.nextFloat();

        System.out.println("Introduce el precio de Venta Final: ");
        precioVenta = reader.nextFloat();

        porcenDescuento = precioVenta / precioArticulo * 100;

        System.out.println("El porcentaje de descuento aplicado al precio era de: " + porcenDescuento +"%");
    }
}
