public class EjercicioSerializa {
    public static void main(String[] args) throws Exception {
        
        //Empleado[] listaEmpleados = new Empleado[5];
        //Pedido[] listaPedidos = new Pedido[10];

        //Serializa.serializa(listaEmpleados,"src/empleados.dat");
        //Serializa.serializa(listaPedidos,"src/pedidos.dat");
        
        Pizzeria.leerEmpleados("src/empleados.dat");
        Pizzeria.leerPedidos("src/pedidos.dat");

        Pizzeria.calculaMedia(null);
        Pizzeria.calculaPedidoMaximo(null);
        Pizzeria.calculaPedidoMinimo(null);
        Pizzeria.calculaTotales(null);
        Pizzeria.calculaComision(null);

    }
}