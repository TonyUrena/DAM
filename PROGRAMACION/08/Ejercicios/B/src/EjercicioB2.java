import java.util.Scanner;

public class EjercicioB2 {

    public static void main(String[] args) {

        String dni, nombre, apellidos;
        int edad;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el DNI de la persona: ");
        dni = reader.nextLine();
        System.out.println("Introduce su nombre: ");
        nombre = reader.nextLine();
        System.out.println("Introduce sus apellidos: ");
        apellidos = reader.nextLine();
        System.out.println("Introduce su edad");
        edad = reader.nextInt();
        reader.nextLine();

        Persona persona1 = new Persona(dni, nombre, apellidos, edad);

        System.out.println("Introduce el DNI de la persona: ");
        dni = reader.nextLine();
        System.out.println("Introduce su nombre: ");
        nombre = reader.nextLine();
        System.out.println("Introduce sus apellidos: ");
        apellidos = reader.nextLine();
        System.out.println("Introduce su edad");
        edad = reader.nextInt();
        reader.nextLine();

        Persona persona2 = new Persona(dni, nombre, apellidos, edad);

        imprimePersona(persona1);
        imprimePersona(persona2);

    }

    public static Persona introduceDatosPersona(Persona persona){


        return persona;
    }

    public static void imprimePersona (Persona persona){

        System.out.println(persona.nombre + " " +
                persona.apellidos +
                " con DNI: " + persona.dni + " " +
                compruebaMayorEdad(persona.edad));

    }

    public static String compruebaMayorEdad(int edad) {

        String mayorEdad;

        if (edad >= 18) {
            mayorEdad = "es mayor de edad";
        } else {
            mayorEdad = "no es mayor de edad";
        }

        return mayorEdad;
    }

}
