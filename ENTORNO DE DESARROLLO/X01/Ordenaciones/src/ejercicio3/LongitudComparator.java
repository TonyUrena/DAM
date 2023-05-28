package ejercicio3;

import java.util.Comparator;


public class LongitudComparator implements Comparator<EstacionMeteo> {

    public int compare(EstacionMeteo estacion1, EstacionMeteo estacion2){
        return Double.compare(estacion1.getLongitud(), estacion2.getLongitud());
    }

}
