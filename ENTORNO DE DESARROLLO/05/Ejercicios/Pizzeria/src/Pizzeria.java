import java.util.Scanner;

public class Pizzeria {

    static Empleado[] listaEmpleados = new Empleado[5];
    static Pedido[] listaPedidos = new Pedido[10];

    public static void leerEmpleados(String archivoEmpleados) {

        int contadorEmpleados = 0;
        String opcionMenu = "A";
        boolean salirMenu = false;
        Scanner reader = new Scanner(System.in);

        listaEmpleados = (Empleado[]) Serializa.deserializa(archivoEmpleados);

        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i] != null) {
                contadorEmpleados++;
            }
        }

        System.out.println("Cantidad de empleados: " + contadorEmpleados);

        do {
            System.out.println("¿Introducir manualmente más empleados?");
            opcionMenu = reader.nextLine();

            if(opcionMenu.equalsIgnoreCase("SI")){
                //TODO introducir empleados
                salirMenu = false;
                contadorEmpleados++;
            } else if(opcionMenu.equalsIgnoreCase("NO")){
                System.out.println(contadorEmpleados);
                if (contadorEmpleados > 0){
                    salirMenu = true;
                } else {
                    salirMenu = false;
                    System.out.println("ERROR: Introduce minimo un empleado");
                }
            } else {
                System.out.println("ERROR: Introduce una opcion valida");
            }

            if(contadorEmpleados >= 5){
                salirMenu = true;
            }

        } while (!salirMenu);

        //TODO mostrar el listado de empleados.

    }

    public static void leerPedidos(String archivoPedidos) {

        int contadorPedidos = 0;
        String opcionMenu = "A";
        boolean salirMenu = false;
        Scanner reader = new Scanner(System.in);

        listaPedidos = (Pedido[]) Serializa.deserializa(archivoPedidos);

        for (int i = 0; i < listaPedidos.length; i++) {
            if (listaPedidos[i] != null) {
                contadorPedidos++;
            }
        }

        System.out.println("Cantidad de pedidos: " + contadorPedidos);

        do {
            System.out.println("¿Introducir manualmente más pedidos?");
            opcionMenu = reader.nextLine();

            if(opcionMenu.equalsIgnoreCase("SI")){
                //TODO introducir pedidos
                salirMenu = false;
                contadorPedidos++;
            } else if(opcionMenu.equalsIgnoreCase("NO")){
                System.out.println(contadorPedidos);
                if (contadorPedidos > 0){
                    salirMenu = true;
                } else {
                    salirMenu = false;
                    System.out.println("ERROR: Introduce minimo un pedido");
                }
            } else {
                System.out.println("ERROR: Introduce una opcion valida");
            }

            if(contadorPedidos >= 10){
                salirMenu = true;
            }

        } while (!salirMenu);

        //TODO mostrar el listado de pedidos.

    }

    public static float calculaMedia(Pedido[] listaPedidos) {
        // TODO calcula media de todos los pedidos
    }

    public static float calculaPedidoMaximo(Pedido[] listaPedidos) {
        // TODO calcula importe maximo en la lista
    }

    public static float calculaPedidoMinimo(Pedido[] listaPedidos) {
        // TODO calcula importe minimo en la lista
    }

    public static float calculaTotales(Pedido[] listPedidos) {
        // TODO calcula cantidad pedidos y el importe total del dia
    }

    public static float calculaComision(String codigoEmpleado) {
        // TODO devuelve comisión del 2% para el total de ventas del empleado
    }
}
