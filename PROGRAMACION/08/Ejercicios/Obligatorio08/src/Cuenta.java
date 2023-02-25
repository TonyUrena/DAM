public class Cuenta {
    
    private int numCuenta;
    private double saldo;

    public Cuenta(int numCuenta, double saldo){

        this.numCuenta = numCuenta;
        this.saldo = saldo;

    }

    public void setCuenta(int numCuenta){
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCuenta(){
        return this.numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // TODO metodos para recibir abonos y pagar recibos.
    public void recibeAbono(float abono){
        this.saldo += abono; 
    }

    public void pagaRecibo(float pago){
        this.saldo -= pago;
    }
}
