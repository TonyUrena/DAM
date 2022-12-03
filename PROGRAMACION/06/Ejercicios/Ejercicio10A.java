import java.util.Scanner;

public class Ejercicio10A {
    
    public static void main(String[] args) {
        
        int valorN;
        float altura, totalAlturas = 0, alturaMedia, alturaMaxima, alturaMinima,
              personasEncimaMedia, personasDebajoMedia;
        float[] arrayAlturas;

        Scanner reader = new Scanner(System.in);
        
        System.out.println("¿Cuántas alturas quieres comprobar?:");
        valorN = reader.nextInt();

        arrayAlturas = new float[valorN];

        System.out.println("Introduce las alturas a calcular:");

        for (int i = 0; i < valorN; i++) {
            
            altura = reader.nextFloat();
            arrayAlturas[i] = altura;

            // Sumatorio para calcular después la media
            totalAlturas = totalAlturas + arrayAlturas[i];
        }

        // Comprobamos las alturas máximas y mínimas
        alturaMaxima = arrayAlturas[0];
        alturaMinima = arrayAlturas[0];

        for (int i = 0; i < valorN; i++) {

            if (arrayAlturas[i] > alturaMaxima){
                alturaMaxima = arrayAlturas[i];
            } else if(arrayAlturas[i] < alturaMinima){
                alturaMinima = arrayAlturas[i];
            }

        }
        
        // Calculamos la media
        alturaMedia = totalAlturas / valorN;

        System.out.println("La altura máxima es: " + alturaMaxima);
        System.out.println("La altura mínima es: " + alturaMinima);
        System.out.println("La media de altura es de: " + alturaMedia);

    }
}
