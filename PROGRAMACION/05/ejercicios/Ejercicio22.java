import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        int altura;
        Scanner reader = new Scanner(System.in);

        System.out.print("dame un número para realizar su pirámide: ");
        altura = reader.nextInt();
        
        for (int i = altura; i > 0; i--) {

            for (int j = i-1; j >= 1; j--) {
                
                System.out.print(" ");

            }
            
            if (altura % 2 == 0) {
                for (int j = i; j < i*2; j++) {
                    System.out.print("*");
                }
            } else {
                //restar 1
                for (int j = i; j < (i*2)-1; j++)  {
                    System.out.print("*");
                }
            }

            System.out.println();
            
        }

    }

}

/*

los espacios de cada fila es su numero -1, empezando desde abajo.
desde la primera fila hacia abajo sería la altura total menos 1
La cantidad de caracteres 


  **   2  2*2
 ****  4  2*4
****** 6  2*3

    *     1  2*1-1
   ***    3  2*2-1
  *****   5  2*3-1
 *******  7  2*4-1
********* 9  2*5-1

*/