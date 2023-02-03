/*
 * TONY UREÑA FORTUÑO
 */

import java.util.Scanner;

public class Obligatorio07 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String numeroContrato;
        double potenciaContratada, kwConsumidos, importeSubtotal, importeTotal, incremento;

        mensajeAlerta("-----", "Introduce el número de contrato. (ddd-dddd)");
        numeroContrato = pideNumeroContrato(reader);

        mensajeAlerta("-----", "Introduce la potencia contratada (en kW)");
        potenciaContratada = pidePotenciaContratada(reader);

        mensajeAlerta("-----", "Introduce los kW consumidos en el mes");
        kwConsumidos = pideKwConsumidos(reader);

        importeSubtotal = calculaTarifa(potenciaContratada, kwConsumidos);
        incremento = calculaIncremento(importeSubtotal, kwConsumidos);

        importeTotal = importeSubtotal + (importeSubtotal * incremento);

        dibujaFactura(numeroContrato, kwConsumidos, potenciaContratada, incremento, importeTotal);
    }

    public static String pideNumeroContrato(Scanner reader) {

        String numCont;

        do {

            numCont = reader.nextLine();

            if (!(numCont.indexOf("-") == 3 && numCont.length() == 8)) {
                mensajeAlerta("ERROR", "El código no sigue el patrón \"ddd-dddd\"");
            }

            if (!numCont.matches("[0-9-]+")){
                mensajeAlerta("ERROR", "Por favor, introduce un código númerico.");
            }

        } while (!(numCont.indexOf("-") == 3 && numCont.length() == 8) || !numCont.matches("[0-9-]+"));

        return numCont;
    }

    public static double pidePotenciaContratada(Scanner reader) {

        double potCont;
        do {

            potCont = reader.nextDouble();

            if (!(potCont >= 3.45 && potCont <= 8.05)) {
                mensajeAlerta("ERROR", "Introduce un número entre 3,45 y 8,05");
            }

        } while (!(potCont >= 3.45 && potCont <= 8.05));

        return potCont;
    }

    public static double pideKwConsumidos(Scanner reader) {

        double kwCons;

        do {
            
            kwCons = reader.nextDouble();
            
            if (kwCons < 0) {
                mensajeAlerta("ERROR", "Introduce un valor válido");
            }

        } while (kwCons < 0);
        

        return kwCons;
    }

    public static double calculaTarifa(double potenciaContratada, double kwConsumidos) {

        double tarifa = 0, importeSubtotal;

        importeSubtotal = kwConsumidos * 0.1684;

        if (potenciaContratada < 3.45 || potenciaContratada >= 3.45 && potenciaContratada < 4.60) {
            tarifa = 10.23;
        } else if (potenciaContratada >= 4.60 && potenciaContratada < 5.75) {
            tarifa = 14.45;
        } else if (potenciaContratada >= 5.75 && potenciaContratada < 6.90) {
            tarifa = 18.69;
        } else if (potenciaContratada >= 6.90 && potenciaContratada < 8.05) {
            tarifa = 21.34;
        } else if (potenciaContratada >= 8.05) {
            tarifa = 25.99;
        }

        importeSubtotal += tarifa;

        return importeSubtotal;
    }

    public static double calculaIncremento(double importeSubtotal, double kwConsumidos) {

        double incremento = 0;

        if (kwConsumidos >= 150 && kwConsumidos < 300) {
            incremento = 0.05;
        } else if (kwConsumidos >= 300 && kwConsumidos < 400) {
            incremento = 0.08;
        } else if (kwConsumidos >= 400) {
            incremento = 0.12;
        }

        return incremento;
    }

    public static void dibujaFactura(String numeroContrato, double kwConsumidos, double potenciaContratada,
            double incremento, double importeTotal) {

        System.out.println("Num contrato: " + numeroContrato);
        System.out.println("Total kW: " + kwConsumidos);
        System.out.println("Potencia: " + potenciaContratada);
        System.out.println("Incremento Precio a pagar: " + incremento);
        System.out.println("Total kW Facturado: " + importeTotal);

    }

    public static void mensajeAlerta(String tipo, String mensaje) {
        System.out.println();
        System.out.println("+----------------------" + tipo + "----------------------------+");
        System.out.println(mensaje);
        System.out.println("+-------------------------------------------------------+");
        System.out.println();
    }

}
