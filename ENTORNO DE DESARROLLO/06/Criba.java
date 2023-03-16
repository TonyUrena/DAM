/**
 * Clase para generar todos loss números primos desde 1 hasta
 * un numero máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 * <p>
 * Eratostenes de Cirene (276 a.c. Cirene, Libia 194 a.C Alejandria Egipto) Fue
 * el primer hombre que calculó la circunferencia de la Tierra. También se le
 * conoce Por su trabajo con calendarios que ya incluian años bisiestos y por
 * dirigir 1a mitica biblioteca de Alejandria.
 * </p>p EL algoritmo es bastante simple: Dado un vector de enteros empezandoen
 * 2, se tachan todos los múltiplos de 2. A Continuación, Se encuentra el
 * siguiente entero no tachado Y se tachan todos sus múltiplos. El proceso se
 * repite hasta que se pasa de la raiz cuadrada del valor máximo. Todos los
 * numeros gue queden sin tachar son numeros primos
 *
 * author Fernando BerZal
 *
 * @version 1.0 Enero 2005(EB)
 */
package paquete;

/**
 *
 * @author pablo
 */
public class Criba {

    /**
     * Generar numeros primos de 1 a max
     * @param max es el valor máximo
     * @return Vector de números primos
     */
    public static int[] generarPrimos(int max) {
        int i, j;
        if (max >= 2) {
            //Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];

            //Inicializar el array
            for (i = 0; i < dim; i++) {
                esPrimo[i] = true;
            }            
            
            //Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;

            // Criba
            for (i = 2; i < Math.sqrt(dim) + 1; i++) {
                if (esPrimo[i]) {
                    //Eliminar los múltiplos de i
                    for (j = 2 * i; j < dim; j += i) {
                        esPrimo[j] = false;
                    }
                }
            }

            // ¿Cuántos primos hay?
            int cuenta = 0;
            for (i = 0; i < dim; i++) {
                if (esPrimo[i]) {
                    cuenta++;
                }
            }

            // Rellenar el vector de números primos
            int[] primos = new int[cuenta];

            for (i = 0, j = 0; i < dim; i++) {
                if (esPrimo[i]) {
                    primos[j++] = i;
                }
            }

            return primos;

        } else { // max < 2
            return new int[0]; // vector vacio
        }
    }

}
