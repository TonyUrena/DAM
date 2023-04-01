package obligatorio09;

import java.util.ArrayList;
import java.util.Scanner;

public class Obligatorio09 {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculosEmpresa = new ArrayList();

        System.out.println("1. Añade Vehiculo.");
        System.out.println("2. Obtener precio alquiler.");
        System.out.println("3. Muestra todos los precios.");
        System.out.println("0. Salir.");

        Scanner reader = new Scanner(System.in);
        int opcionMenu;

        do {
            opcionMenu = reader.nextInt();
            switch (opcionMenu) {
                case 1:
                    añadeVehiculo();
                    break;
                case 2:
                    obtienePrecioAlquiler();
                    break;
                case 3:
                    muestraPrecios();
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (opcionMenu != 0);
    }

    public static void añadeVehiculo() {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el tipo de vehiculo: ");
        String tipoVehiculo = reader.nextLine();
        System.out.println("Introduce matrícula: ");
        String matricula = reader.nextLine();
        System.out.println("Introduce marca: ");
        String marca = reader.nextLine();
        System.out.println("Introduce color: ");
        String color = reader.nextLine();
        System.out.println("Introduce Motor");
        String motor = reader.nextLine();
        System.out.println("Introduce Cilindrada: ");
        int cilindrada = reader.nextInt();
        System.out.println("Introduce años:");
        int anyos = reader.nextInt();

        if (tipoVehiculo.equalsIgnoreCase("coche")) {
            // Pide datos
            Coche coche = new Coche();
        }
        if (tipoVehiculo.equalsIgnoreCase("camion")) {
            // Pide datos
            Camion camion = new Camion();
        }
        if (tipoVehiculo.equalsIgnoreCase("furgoneta")) {
            // Pide datos
            Furgoneta furgoneta = new Furgoneta();
        }
        if (tipoVehiculo.equalsIgnoreCase("microbus")) {
            // Pide datos
            MicroBus microbus = new MicroBus();
        }

    }

    public static void obtienePrecioAlquiler() {

    }

    public static void muestraPrecios() {

    }

}
