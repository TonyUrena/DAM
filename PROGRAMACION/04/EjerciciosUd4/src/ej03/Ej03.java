package ej03;
import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        
        float ladoCuadrado;
        float areaCuadrado;
        
        Scanner reader = new Scanner(System.in);
        
        // El valor decimal debe introducirse con ","
        System.out.println("Introduce el lado del cuadrado: ");
        ladoCuadrado = reader.nextFloat();
        
        areaCuadrado = ladoCuadrado * ladoCuadrado;
        
        System.out.println("El área del cuadrado es: " + areaCuadrado);
        
    }
    
}