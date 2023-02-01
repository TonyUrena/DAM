import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int a, b, c, numeroMayor;

        System.out.println("Introduce tres numeros");
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();

        numeroMayor = mayorA(mayorA(a,b), c);
        System.out.println("El valor mayor es: " + numeroMayor);
    }

    public static int mayorA(int a, int b){

        int mayor = 0;

        if (a > b){
            mayor = a;
        }else{
            mayor = b;
        }

        return mayor;
    }
}