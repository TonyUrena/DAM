package ej03mascotas;

public abstract class Aves extends Mascota {

    protected boolean vuela, pico;

    public Aves(String nombre, int edad, int fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.pico = true;
    }

    public abstract void volar();

}
