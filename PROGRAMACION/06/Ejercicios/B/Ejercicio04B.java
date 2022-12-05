import java.util.Scanner;

public class Ejercicio04B {

    public static void main(String[] args) {
        
        String frase;
        int numeroA = 0, numeroE = 0,
        numeroI = 0, numeroO = 0, numeroU = 0;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        frase = reader.nextLine();

        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {

            char caracter = frase.charAt(i);

            if (caracter == 'A') {
                numeroA++;
            } else if(caracter == 'E'){
                numeroE++;
            } else if(caracter == 'I'){
                numeroI++;
            } else if(caracter == 'O'){
                numeroO++;
            } else if(caracter == 'U'){
                numeroU++;
            }

        }

        System.out.print("Númerode A's: " + numeroA +"\n");
        System.out.print("Númerode E's: " + numeroE +"\n");
        System.out.print("Númerode I's: " + numeroI +"\n");
        System.out.print("Númerode O's: " + numeroO +"\n");
        System.out.print("Númerode U's: " + numeroU +"\n");

    }
    
}
