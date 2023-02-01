import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = reader.nextLine();

        if(esMayorEdad(edad)){
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

    }
 
    public static boolean esMayorEdad(int a){

        boolean esMayor;

        if (a >= 18) {
            esMayor = true;
        } else {
            esMayor = false;
        }

        return esMayor;
    }

}
