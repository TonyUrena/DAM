package ejercicio2;

import java.util.Comparator;


public class PriceComparator implements Comparator<CatalogItem>{

    public int compare(CatalogItem item1, CatalogItem item2){
        return item1.getPrice().compareTo(item2.getPrice());
    }

}
