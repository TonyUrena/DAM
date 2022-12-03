import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        int numero = 1;
        boolean divisibleOtro = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Dime un número: ");
        numero = reader.nextInt();

        // Recorremos todos los números desde el introducido hasta 1 y no 0
        // ya que un número siempre puede dividirse entre 1.
        for (int i = numero; i > 1; i--) {

            // A cada paso del bucle comprobamos si el número es divisible
            // tanto por si mismo como por el índice del bucle.
            // Con esto comprobamos todos los números entre el mismo y 1.
            if (numero % i == 0 && numero != i){
                divisibleOtro = true;
            }

        }

        // Un número siempre puede dividirse entre sí mismo, no necesitamos comprobar
        // esta condición
        if (divisibleOtro){
            System.out.println("No Es primo.");
        } else {
            System.out.println("Es primo.");
        }

    }

}