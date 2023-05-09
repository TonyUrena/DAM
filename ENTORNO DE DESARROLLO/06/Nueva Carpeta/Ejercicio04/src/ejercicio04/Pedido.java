package ejercicio04;

import java.util.ArrayList;

public class Pedido {
    
    ArrayList listaPagos = new <Pago>ArrayList();
    Cliente cliente;    
    ArrayList listaLineaPedidos = new <LineaPedido>ArrayList();

    public Pedido(Cliente cliente, ArrayList <Pago>listaPagos, ArrayList <LineaPedido>listaLineaPedidos) {
        this.cliente = cliente;
        this.listaPagos = listaPagos;
        this.listaLineaPedidos = listaLineaPedidos;
    }
    
}
