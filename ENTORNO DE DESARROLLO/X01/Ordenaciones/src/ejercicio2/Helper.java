package ejercicio2;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Helper {
    // Fichero conteniendo el catalogo
    public static final File CATALOG_FILE = new File("resources/catalog.csv");
    
    public static List<CatalogItem> readFileIntoList(){
        
        List<CatalogItem> catalog = new ArrayList<>();
        
        try {
            List<String> lines = Files.readAllLines(CATALOG_FILE.toPath());
            lines.remove(0);
            String[] splitLine;
            for (String line : lines) {
                splitLine = line.split(",");
                catalog.add(new CatalogItem(Integer.parseInt(splitLine[0]), splitLine[1], new BigDecimal(splitLine[2]), splitLine[3]));
            }
        } catch (IOException e) {
            System.err.println("Fichero no puede ser leido.");
            e.printStackTrace();            
        } catch (NumberFormatException e) {
            System.err.println("Informacion incorrecta en el catalago CSV.");
            e.printStackTrace();            
        }
        
        return catalog;
    }
    
    public static void printCatalog(List<CatalogItem> catalog) {
        System.out.println("ID\tName\t\tPrice\tCategory");
        catalog.forEach((item) -> System.out.println(item.getID() + "\t" + item.getName() + ((item.getName().length() > 8) ? "\t" : "\t\t") + item.getPrice().toString() + "\t" + item.getCategory()));
    }
}
