public class Persona {

    private final String DNI;
    public static int cantidadPersonas;
    private Cuenta[] cuentaArray = new Cuenta[3];

    public Persona(String DNI, Cuenta[] cuentaArray) {

        this.DNI = DNI;
        this.cuentaArray = cuentaArray;

    }

    public String getDNI() {
        return DNI;
    }

    public Cuenta[] getCuentaArray() {
        return cuentaArray;
    }

    public void setCuentaArray(Cuenta[] cuentaArray) {

            this.cuentaArray = cuentaArray;
        
    }

    public boolean esMorosa(Persona persona){

        boolean esMoroso = false;

        for (int i = 0; i < persona.cuentaArray.length; i++) {
            if(persona.cuentaArray[i].getSaldo() < 0){
                esMoroso = true;
            }
        }
        
        return esMoroso;
    }

}
