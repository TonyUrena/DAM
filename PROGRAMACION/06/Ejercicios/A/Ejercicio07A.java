import java.util.Scanner;

public class Ejercicio07A {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int numeroP, numeroQ, longitudArray;
        int[] arrayN;

        System.out.println("Introduce dos números:");
        numeroP = reader.nextInt();
        numeroQ = reader.nextInt();
        
        if(numeroP > numeroQ){

            longitudArray = numeroP - numeroQ;
            arrayN = new int[longitudArray];

            for (int i = 0; i <= longitudArray; i++) {
                arrayN[i] = numeroQ + i;
                System.out.println(arrayN[i] + " ");
            }
 
        } else if (numeroP < numeroQ){

            longitudArray = numeroQ - numeroP;
            arrayN = new int[longitudArray];

            for (int i = 0; i <= longitudArray; i++) {
                arrayN[i] = numeroP + i;
                System.out.println(arrayN[i] + " ");
            }

        } else {

            arrayN = new int[numeroP];
            System.out.println(arrayN[numeroP]);
        }
    }
}
