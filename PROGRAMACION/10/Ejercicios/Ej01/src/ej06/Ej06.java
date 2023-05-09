package ej06;

public class Ej06 {

    public static void main(String[] args) throws Exception {

        try {
            Gato Gato01 = new Gato("Firulais", 10);
            Gato01.imprimir();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        try {
            Gato Gato02 = new Gato("A", 2);
            Gato02.imprimir();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        try {
            Gato Gato03 = new Gato("Cosa", -1);
            Gato03.imprimir();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

}
