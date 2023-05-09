package ej06;

public class Gato {

    String nombre;
    int edad;

    public Gato(String nombre, int edad) throws Exception {
        if (nombre.length() < 3){
            throw new Exception("ERROR: Nombre inferior a 3 letras");
        }
        if (edad < 0){
            throw new Exception("ERROR: Edad negativa");
        }
        
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3){
            throw new Exception("ERROR: Nombre inferior a 3 letras");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0){
            throw new Exception("ERROR: Edad negativa");
        }
        this.edad = edad;
    }

}
