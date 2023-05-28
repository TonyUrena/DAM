package ejercicio2;

import java.util.Comparator;


public class CategoryOrPriceComparator implements Comparator<CatalogItem>{

    public int compare(CatalogItem item1, CatalogItem item2){
        int resultado = item1.getCategory().compareTo(item2.getCategory());
        if (resultado == 0){
            resultado = item1.getPrice().compareTo(item2.getPrice());
        }
        return resultado;
    }

}
