package ejercicio1;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private int altura;

    public Persona(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public int compareTo(Persona otra) {
        return Integer.compare(otra.altura, this.altura);
    }
    
    public int compareToEdad(Persona otra){
        return Integer.compare(this.edad, otra.edad);
    }

    public void imprime() {
        System.out.println(this.nombre + " - Altura: " + this.altura + " - Edad: " + this.edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
