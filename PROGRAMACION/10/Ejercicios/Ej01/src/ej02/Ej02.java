package ej02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {

        int A = 0;
        int B = 0;

        try {
            Scanner reader = new Scanner(System.in);
            A = reader.nextInt();
            B = reader.nextInt();
            
            System.out.println("A / B = " + A / B);

        } catch (InputMismatchException ex) {
            System.out.println("Valor Introducido Incorrecto");
        } catch (ArithmeticException ex) {
            System.out.println("División incorrecta");
        }

    }

}
