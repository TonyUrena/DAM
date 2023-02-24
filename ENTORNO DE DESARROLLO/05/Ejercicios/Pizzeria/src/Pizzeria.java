public class Pizzeria {
    
    Empleado[] listaEmpleados = new Empleado[5];
    Pedido[] listaPedidos = new Pedido[10];

    public static void leerEmpleados(){
        //TODO lee el archivo serializado pasado como argumento
        //TODO menu que pide si queremos introducir manualmente mas empleados

        
    }

    public static void leerPedidos(){
        //TODO lee el archivo serializado pasado como argumento
        //TODO menu que pide si queremos introducir manualmente mas pedidos
    }

    public static float calculaMedia(Pedido[] listaPedidos){
        //TODO calcula media de todos los pedidos
    }

    public static float calculaPedidoMaximo(Pedido[] listaPedidos){
        //TODO calcula importe maximo en la lista
    }

    public static float calculaPedidoMinimo(Pedido[] listaPedidos){
        //TODO calcula importe minimo en la lista
    }

    public static float calculaTotales(Pedido[] listPedidos){
        //TODO calcula cantidad pedidos y el importe total del dia
    }
    
    public static float calculaComision(String codigoEmpleado){
        //TODO devuelve comisión del 2% para el total de ventas del empleado
    }
}
