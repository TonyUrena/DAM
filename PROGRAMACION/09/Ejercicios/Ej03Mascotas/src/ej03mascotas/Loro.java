package ej03mascotas;

public class Loro extends Aves {

    private String origen;
    private boolean saluda;

    public Loro(String nombre, int edad, int fechaNacimiento, String origen) {
        super(nombre, edad, fechaNacimiento);
        this.tipo = "Loro";
        this.origen = origen;
        this.habla();
        this.saluda();
        this.volar();
    }

    public void muestra() {
    }

    public void volar() {
        this.vuela = true;
    }

    public void habla() {
        this.habla = true;
    }

    public void saluda() {
        this.saluda = true;
    }

}
