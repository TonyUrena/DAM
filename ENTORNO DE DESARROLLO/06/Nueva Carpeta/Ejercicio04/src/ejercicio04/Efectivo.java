package ejercicio04;

public class Efectivo extends Pago {

    public String moneda;

    public Efectivo(String moneda, float importe, Pedido pedido) {
        super(importe, pedido);
        this.moneda = moneda;
    }

}
