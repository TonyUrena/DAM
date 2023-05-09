package ejercicio04;

import java.util.ArrayList;

public class Cliente {
    
    ArrayList listaPedidos = new <Pedido>ArrayList();
    ArrayList listaEmpresas = new <Empresa>ArrayList();

    public Cliente(ArrayList <Empresa>listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }
    
}
