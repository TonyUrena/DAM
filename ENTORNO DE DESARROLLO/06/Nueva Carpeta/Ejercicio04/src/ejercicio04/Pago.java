package ejercicio04;

import java.util.ArrayList;

public class Pago {
    
    private float importe;
    
    Pedido pedido;

    public Pago(float importe, Pedido pedido) {
        this.importe = importe;
        this.pedido = pedido;
    }
    
    public int valida(){
        
        return 0;
        
    }
    
}
