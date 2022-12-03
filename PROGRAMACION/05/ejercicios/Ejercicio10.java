import java.util.Scanner;

public class Ejercicio10{

    public static void main(String[] args) {

        float nota;
        boolean nota10 = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce las notas");
        
        do{
            nota = reader.nextFloat();
            if (nota >= 0 && nota <= 10){
                if(nota == 10){
                    nota10  = true;
                }
            } else {
                System.out.println("Introduce un número entre 0 y 10");
            }
        } while (nota != -1);

        if (nota10){
            System.out.println("Hay un 10 en los números");
        } else {
            System.out.println("No hay un 10 en los números");
        }

    }
}
