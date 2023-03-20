package ej03mascotas;

public class Gato extends Mascota {

    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, int fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, fechaNacimiento);
        this.tipo = "Gato";
        this.color = color;
        this.peloLargo = peloLargo;
        this.habla();
    }

    public void habla() {
        this.habla = false;
    }

    public void muestra() {
    }

}
