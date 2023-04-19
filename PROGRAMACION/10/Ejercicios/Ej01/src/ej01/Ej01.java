package ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        
        int A = 0;
        
        try {
            Scanner reader = new Scanner(System.in);
            A = reader.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println("Valor Introducido Incorrecto");
        }
        
        System.out.println("Valor introducido: " + A);

    }

}
