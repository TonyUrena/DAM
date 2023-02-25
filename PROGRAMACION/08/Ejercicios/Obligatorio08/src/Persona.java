public class Persona {

    private String dni;
    private boolean esMoroso;

    public static int cantidadPersonas;
    private Cuenta[] cuentaArray = new Cuenta[3];

    public Persona(String dni, Cuenta[] cuentaArray) {

        this.dni = dni;
        this.cuentaArray = cuentaArray;

    }

    public String getDNI() {
        return dni;
    }

    public Cuenta[] getCuentaArray() {
        return cuentaArray;
    }

    public void setCuentaArray(Cuenta[] cuentaArray) {
        this.cuentaArray = cuentaArray;
    }

    public boolean esMorosa() {

        this.esMoroso = false;

        for (int i = 0; i < this.cuentaArray.length; i++) {
            if (this.cuentaArray[i].getSaldo() < 0) {
                this.esMoroso = true;
            }
        }

        return esMoroso;

    }

}
