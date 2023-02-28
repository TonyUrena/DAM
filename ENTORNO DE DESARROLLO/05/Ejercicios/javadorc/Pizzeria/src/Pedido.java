import java.io.Serializable;

public class Pedido implements Serializable{
    
    private int numeroPizzas, importePedido, codigoEmpleadoVenta;

    public Pedido(int numeroPizzas, int importePedido, int codigoEmpleadoVenta) {
        this.numeroPizzas = numeroPizzas;
        this.importePedido = importePedido;
        this.codigoEmpleadoVenta = codigoEmpleadoVenta;
    }

    public int getNumeroPizzas() {
        return numeroPizzas;
    }

    public void setNumeroPizzas(int numeroPizzas) {
        this.numeroPizzas = numeroPizzas;
    }

    public int getImportePedido() {
        return importePedido;
    }

    public void setImportePedido(int importePedido) {
        this.importePedido = importePedido;
    }

    public int getCodigoEmpleadoVenta() {
        return codigoEmpleadoVenta;
    }

    public void setCodigoEmpleadoVenta(int codigoEmpleadoVenta) {
        this.codigoEmpleadoVenta = codigoEmpleadoVenta;
    }

}
