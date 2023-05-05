package ej05;

import java.util.InputMismatchException;

public class Ej05 {

    public static void main(String[] args) throws Exception {
        try {
            imprimePositivo(4);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            imprimePositivo(0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            imprimePositivo(-4);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            imprimeNegativo(4);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            imprimeNegativo(0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            imprimeNegativo(-4);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void imprimePositivo(int p) throws Exception {
        if (p > 0) {
            System.out.println(p);
        } else if (p < 0) {
            throw new Exception("Número " + p + " negativo");
        } else {
            throw new Exception("El número 0 no es ni positivo ni negativo");
        }
    }

    static void imprimeNegativo(int n) throws Exception {
        if (n < 0) {
            System.out.println(n);
        } else if (n > 0) {
            throw new Exception("Número " + n + " positivo");
        } else {
            throw new Exception("El número 0 no es ni positivo ni negativo");
        }
    }

}
