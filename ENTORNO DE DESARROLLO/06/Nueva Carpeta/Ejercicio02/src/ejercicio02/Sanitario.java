package ejercicio02;

public abstract class Sanitario {
    private float numEmpleado;
    String nombre;
    public String apellidos;
    protected String tipo;

    public Sanitario(float numEmpleado, String nombre, String apellidos, String tipo) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipo = tipo;
    }
    
    public void trabaja(){
        
    }
}
