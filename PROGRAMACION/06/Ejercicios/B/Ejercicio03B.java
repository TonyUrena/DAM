import java.util.Scanner;

public class Ejercicio03B {
    
    public static void main(String[] args) {
        
        String nombre, apellido1, apellido2, codigo;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el nombre");
        nombre = reader.nextLine();
        System.out.println("Introduce el primer apellido");
        apellido1 = reader.nextLine();
        System.out.println("Introduce el segundo apellido");
        apellido2 = reader.nextLine();

        codigo = (nombre.substring(0,3) +
        apellido1.substring(0,3) +
        apellido2.substring(0,3)).toUpperCase();

        System.out.println("El código correspondiente es: " + codigo);
        
    }
}
