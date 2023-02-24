import java.util.Scanner;

public class EjercicioA2 {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1 = introduceDatosPesona(persona1);
        persona2 = introduceDatosPesona(persona2);

        imprimePersona(persona1);
        imprimePersona(persona2);

    }

    public static Persona introduceDatosPesona(Persona persona){

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el DNI de la persona: ");
        persona.dni = reader.nextLine();
        System.out.println("Introduce su nombre: ");
        persona.nombre = reader.nextLine();
        System.out.println("Introduce sus apellidos: ");
        persona.apellidos = reader.nextLine();
        System.out.println("Introduce su edad");
        persona.edad = reader.nextInt();
        reader.nextLine();

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
