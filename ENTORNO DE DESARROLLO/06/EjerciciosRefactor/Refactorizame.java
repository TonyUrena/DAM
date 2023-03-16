package paquete;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Refactorizame {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        int i, j;
        a = new int[10];
        b = new int[10];
        // la tabla c tendrá que tener el doble de tamaño que a y b.
        c = new int[20];
        // leemos la tabla a
        System.out.println("Leyendo la tabla a");
        for (i = 0; i < 10; i++) {
            System.out.print("numero: ");
            a[i] = entrada.nextInt();
        }
        // leemos la tabla b
        System.out.println("Leyendo la tabla b");
        for (i = 0; i < 10; i++) {
            System.out.print("numero: ");
            b[i] = entrada.nextInt();
        }
// asignaremos los elementos de la tabla c
// para las tablas a y b utilizaremos como indice i
// y para la tabla c utilizaremos como indice j.
        j = 0;
        for (i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("La tabla c queda: ");
        for (j = 0; j < 20; j++) {
            // seguimos utilizando j, para la tabla c. Aunque se
            //podria utilizar i.
            System.out.print(c[j] + " ");
        }
        System.out.println(" ");
    }
}