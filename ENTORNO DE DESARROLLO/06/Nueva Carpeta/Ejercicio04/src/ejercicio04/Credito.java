package ejercicio04;

import java.util.Date;

public class Credito extends Pago {
    
    private int numero;
    private Date caducidad;
    private String tipo;

    public Credito(int numero, Date caducidad, String tipo, float importe, Pedido pedido) {
        super(importe, pedido);
        this.numero = numero;
        this.caducidad = caducidad;
        this.tipo = tipo;
    }

    
    
}
