import java.util.Scanner;

public class Ejercicio09A {
    
    public static void main(String[] args) {
        
        int[] array100 = new int[100];
        int numeroN;
        Scanner reader = new Scanner(System.in);
        
        for (int i = 0; i < 100; i++) {

            array100[i] = (int)(1 + Math.random() * 10);
            System.out.println(array100[i]);

        }

        System.out.println("Introduce un valor: ");
        numeroN = reader.nextInt();

        for (int i = 0; i < 100; i++) {
            
            if(array100[i] == numeroN){
                System.out.println("El número " + numeroN + " aparece en la posición: " + i);
            }

        }
    }

}
