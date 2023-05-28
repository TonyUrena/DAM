package ejercicio3;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Helper {
   
  
    public static void printEstaciones(List<EstacionMeteo> estacionesMeteorologicas) {
        System.out.printf("%-12s%-34s%-23s%-12s%-12s%n", "Indicativo", "Nombre", "Provincia", "Altitud(m)", "Longitud" );
        estacionesMeteorologicas.forEach((item) -> System.out.printf("%-12s%-34s%-23s%-12s%-12s%n", item.getIndicativo(), item.getNombre(), item.getProvincia(), item.getAltitud(), item.getLongitud()) );
    }
    
        
    /************************* BONUS *******************************************/

    /**
     * Metodo que permite agregar una estacion meteorologica a un arrayList
     * de objetos tipo EstacionMeteo, ordenadas por el criterio de ordenación
     * natural (el definido en el metodo compareTo de la interfaz Comparable<T>). 
     * El método debe agregar el nuevo elemento en su posición correcta.
     * Si el elemento ya se encuentra dentro del arrayList no lo volverá a agregar.
     * 
     * Ayuda: usar el metodo Collections.binarySearch()
     * 
     * @author pablo
     * @param listaEstaciones 
     * @param newElement
     */
    public static void addEstacionMetroEnListaOrdenadaNatural(List<EstacionMeteo> listaEstaciones, EstacionMeteo newElement) {

    }

    /**
     * Metodo que permite agregar una estacion meteorologica a un arrayList
     * de objetos tipo EstacionMeteo, ordenadas por el valor devuelto por el metodo
     * getLongitud() (el definido en el metodo compare de la interfaz Comparator<T>).
     * El método debe agregar el nuevo elemento en su posición correcta.
     * Si el elemento ya se encuentra dentro del arrayList no lo volverá a agregar.
     * 
     * Ayuda: usar el metodo Collections.binarySearch()
     * 
     * @author pablo
     * @param listaEstaciones
     * @param newElement
     * @param comp
     */
    public static void addEstacionMetroEnListaOrdenadaComparatorLongitud(List<EstacionMeteo> listaEstaciones, EstacionMeteo newElement, Comparator<EstacionMeteo> comp) {

    }
    
    /************************* BONUS *******************************************/
}
