package circulo;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author profesor
 */
public class Main {
    public static void main(String[] args) {
        Circulito circulo = new Circulito(37,43,2.5);
        String salida =
                "La coordenada X es "+circulo.getCoordenadasX()+
                "\nLa coordenada Y es "+circulo.getCoordenadasY()+
                "\nEl radio es "+circulo.getRadio();
        circulo.setCoordenadasX(35);
        circulo.setCoordenadasY(20);
        circulo.setRadio(4.2);
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerAreaCirculo());
        System.out.println(salida);
    }

}
