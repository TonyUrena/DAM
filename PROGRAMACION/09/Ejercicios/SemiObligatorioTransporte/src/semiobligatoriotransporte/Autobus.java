package semiobligatoriotransporte;

public abstract class Autobus {
    
    private String matricula;
    private float precio;
    
    private Conductor conductor;
    
    public abstract float calculaPrecioViaje(Autobus autobus);

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    
}
