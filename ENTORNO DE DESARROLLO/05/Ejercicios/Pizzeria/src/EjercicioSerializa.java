public class EjercicioSerializa {
    public static void main(String[] args) throws Exception {
        
        Empleado emp1 = new Empleado(1,"a","a",1,"a");
        Pedido ped1 = new Pedido(1,1,1);


        Serializa.serializa(emp1,"src/empleados.dat");
        Serializa.serializa(ped1,"src/pedidos.dat");

        System.out.println(Serializa.deserializa("src/empleados.dat"));
        System.out.println(Serializa.deserializa("src/pedidos.dat"));
        
    }
}
