package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Principal {

    public static void main(String[] args) {

        EstacionMeteo[] arrayEstaciones = DatosEstaciones.arrayEstaciones();
        //Convertimos el array de EstacionMeteo en un List<EstacionMeteo>
        List<EstacionMeteo> listaEstaciones = new ArrayList<>(Arrays.asList(arrayEstaciones));

        // Le echamos un vistazo a los datos
        Helper.printEstaciones(listaEstaciones);
        
        System.out.println("----------Provincia---------");
        Collections.sort(listaEstaciones);
        Helper.printEstaciones(listaEstaciones);
        
        System.out.println("----------Longitud---------");
        LongitudComparator longitudComparator = new LongitudComparator();
        listaEstaciones.sort(longitudComparator);
        Helper.printEstaciones(listaEstaciones);

    }

}
