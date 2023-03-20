package ej03mascotas;

public class Canario extends Aves {

    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, int fechaNacimiento, String color) {
        super(nombre, edad, fechaNacimiento);
        this.tipo = "Canario";
        this.color = color;
        this.habla();
        this.canta();
        this.volar();
    }

    public void muestra() {

    }

    public void habla() {
        this.habla = false;
    }

    public void canta() {
        this.canta = true;
    }

    public void volar() {
        this.vuela = true;
    }

}
