package ejercicio2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        // Primero leemos el archivo CSV y convertimos los datos en una lista que contiene los elementos de nuestro catálogo.
        List<CatalogItem> catalog = Helper.readFileIntoList();

        // Una vez cargado el catálogo, barajamos aleatoriamente los elementos.        
        Collections.shuffle(catalog);

        // Le echamos un vistazo a los datos
        Helper.printCatalog(catalog);

        System.out.println("-------------------ID------------------");
        Collections.sort(catalog);
        Helper.printCatalog(catalog);

        System.out.println("--------------------Precio-----------------");
        Comparator<CatalogItem> comparadorPrecio = new PriceComparator();
        catalog.sort(comparadorPrecio);
        Helper.printCatalog(catalog);

        System.out.println("--------------------Categoria o Precio (Anonima)-----------------");
        Collections.sort(catalog, new CategoryOrPriceComparator());
        Helper.printCatalog(catalog);

    }
}
