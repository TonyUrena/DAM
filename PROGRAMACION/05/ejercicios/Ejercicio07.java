import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        int numero, cont = 1, contNeg = 0, contPos = 0;
        boolean negativo = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 10 números no nulos");

        do {
            numero = reader.nextInt();

            if (numero > 0){
                contPos++;
                cont++;
            } else if(numero < 0){
                contNeg++;
                negativo = true;
                cont++;
            } else
            {
                System.out.println("Introduce un número no nulo");
            }

        } while (cont <= 10);

            System.out.println("Escribiste " + contPos + " números positivos." );
            System.out.println("Escribiste " + contNeg + " números negativos.");
    }   
}
