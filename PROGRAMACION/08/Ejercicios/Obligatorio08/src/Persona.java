public class Persona {

    private String dni;

    // Utilizamos una variable static para almacenar la cantidad de las
    // personas. Con esto podemos conocer la posición correcta para las
    // nuevas instancias en el array Personas.
    public static int cantidadPersonas;
    
    // Los objetos Cuenta van siempre almacenados en este array dentro
    // de cada instancia Persona
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

        boolean esMoroso = false;

        for (int i = 0; i < this.cuentaArray.length; i++) {
            if (this.cuentaArray[i].getSaldo() < 0) {
                esMoroso = true;
            }
        }

        return esMoroso;

    }

}
