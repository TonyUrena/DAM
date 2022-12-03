import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        int cantidad;
        Scanner reader = new Scanner(System.in);

        System.out.print("Dime un número: ");
        cantidad = reader.nextInt();

        if (cantidad > 0) {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("* ");
            }
        } else {
            System.out.println("*");
        }
    }

}
