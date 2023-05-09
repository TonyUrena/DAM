package ejercicio04;

public class Cheque extends Pago {

    private String nombre;
    public String banco;

    public Cheque(String nombre, String banco, float importe, Pedido pedido) {
        super(importe, pedido);
        this.nombre = nombre;
        this.banco = banco;
    }

}
