import java.util.Scanner;

public class Ejercicio02B {
    
    public static void main(String[] args) {
        
        String cadenaA, cadenaB;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce la primera cadena:");
        cadenaA = reader.nextLine();
        System.out.println("Introduce la segunda cadena");
        cadenaB = reader.nextLine();

        if(cadenaA.equalsIgnoreCase(cadenaB)){
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son distintas");
        }

    }
}
