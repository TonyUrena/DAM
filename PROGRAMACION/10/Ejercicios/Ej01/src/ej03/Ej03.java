package ej03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) throws Exception{

        double vec[] = new double[5];
        Scanner reader = new Scanner(System.in);

        try {

            for (int i = 0; i < vec.length; i++) {
                reader.nextDouble();
            }
            
        } catch  (InputMismatchException ex){

            System.out.println("Valor incorrecto");
            
        } 

        System.out.println("A");
    }

}
