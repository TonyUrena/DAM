import java.util.Scanner;

public class Ejercicio06B {
    
    public static void main(String[] args) {
        
        String frase, frase2;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        frase = reader.nextLine();

        frase = frase.toUpperCase();
        frase = frase.replace(" ", "");
        System.out.println(frase);

    }
}
