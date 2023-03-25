package ej04banco;

public abstract class CuentaBancaria {
    private String iban;
    private long saldo;
    
    private final static int INTERES_ANUAL_BASICO = 5;
    
    public abstract long calcularIntereses();
    
    public void consultaAtributos(){
        
    }
    
    public void retirar(){
        
    }
    
    public void ingresar(){
        
    }
    
    public void añadir(){
        
    }

    public String getIban() {
        return iban;
    }

    public long getSaldo() {
        return saldo;
    }

    public static int getINTERES_ANUAL_BASICO() {
        return INTERES_ANUAL_BASICO;
    }
}
