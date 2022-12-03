import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        int numero = 1;
        boolean divisibleOtro = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Dime un número: ");
        numero = reader.nextInt();
        
        // iniciamos el contador en 2, pues cualquier numero puede
        // dividirse entre 1.
        for (int i = 2; i < Math.sqrt(numero); i++) {

            // sólo comprobamos si es divisible entre el contador,
            // pues cualquier número es divisible por sí mismo.
            if (numero % i == 0){
                divisibleOtro = true;
            }
        }

        if (divisibleOtro){
            System.out.println("No Es primo.");
        } else {
            System.out.println("Es primo.");
        }

    }

}
