import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {
        
        int numero, cont = 1;
        boolean negativo = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce 10 números no nulos");

        do {
            numero = reader.nextInt();

            if (numero > 0){
                cont++;
            } else if(numero < 0){
                negativo = true;
                cont++;
            } else
            {
                System.out.println("Introduce un número no nulo");
            }

        } while (cont <= 10);

        if (negativo == true){
            System.out.println("Hubieron números negativos");
        } else {
            System.out.println("No hubieron números negativos");
        }
    }   
}
