package ej03mascotas;

public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, int fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, fechaNacimiento);
        this.tipo = "Perro";
        this.raza = raza;
        this.pulgas = pulgas;
        this.habla();
    }

    public void habla() {
        this.habla = false;
    }

    public void muestra() {
        System.out.print("Raza: " + this.raza + " | Tiene pulgas: ");
        if (this.pulgas) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

}
