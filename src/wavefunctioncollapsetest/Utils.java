package wavefunctioncollapsetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static Tile[][] generaMapaWFC(int ancho, int alto, Map tileMap) {
        Tile[][] mapa = new Tile[ancho][alto];
        int posX = 0, posY = 0,
                posXrdm, posYrdm,
                newPosX, newPosY;
        Random random = new Random();

        // Inicializamos el mapa (para poder empezar el algoritmo)
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                mapa[i][j] = (Tile) tileMap.get("tileNULL");
            }
        }
        // Colocamos el primer tile. Por el momento empezaremos siempre con el mismo tile,
        // TODO implementar una forma de encontrar un tile aleatorio en el hashmap

        Tile tile = (Tile) tileMap.get("tile01");

        colapsaTile(mapa, posX, posY, tileMap, tile);

        for (int i = 0; i < mapa[0].length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                colapsaTile(mapa, posX + j, posY + i, tileMap, tile);
            }
        }

        // Comprobamos si la nueva posición está dentro de los límites del mapa
        /*
        if(newPosX > mapa.length) newPosX--;
        if(newPosY > mapa[0].length) newPosY--;
        if(newPosX < 0) newPosX++;
        if(newPosY < 0) newPosY++;
         */
        return mapa;
    }

    // Colapsa un tile individual considerando las opciones del tile que se le pasa como argumento
    public static void colapsaTile(Tile[][] mapa, int posX, int posY, Map tileMap, Tile tile) {

        Random random = new Random();

        //Comprobamos si hay un tile
        if (mapa[posX][posY].equals(tileMap.get("tileNULL"))) {
            // Si no hay un tile recogemos las opciones de los 8 tiles de alrededor y generamos una tabla nueva
            // con la entropía del tile que vamos a colocar
            ArrayList<ArrayList<String>> tileOptions = new ArrayList();
            
            //Usamos el NULL para tomar la base de la lista de opciones, porque tiene todas las opciones posibles.
            //Comprobamos si algula de las opciones NO está en las opciones del tile que estamos comprobando,
            //si no está, la eliminamos de la lista
            
            Tile tileAcomprobar = (Tile)tileMap.get("tileNULL");
            
            for (int i = 0; i < tileAcomprobar.getOptions().length; i++) {
                for (int j = 0; j < tileAcomprobar.getOptions()[0].length; j++) {
                    tileOptions.get(i).add(tileAcomprobar.getOptions()[i][j]);
                }
            }
            
            //Colocamos un tile aleatorio de la lista que hemos generado
            mapa[posX][posY] = (Tile) tileMap.get(tileOptions.get(random.nextInt(tileOptions.size())));
        }
    }

    public static void dibujaPantalla(Tile[][] array) {

        // Primera línea
        for (int i = 0; i < array.length + 2; i++) {
            if (i == 0) {
                System.out.print("╔");
            } else if (i < array.length + 1) {
                System.out.print("═");
            } else {
                System.out.println("╗");
            }
        }

        // Cuerpo
        for (int i = 0; i < array[0].length; i++) {

            System.out.print("║");

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i].getCharacter());
            }
            System.out.println("║");
        }

        // Última línea
        for (int i = 0; i < array.length + 2; i++) {
            if (i == 0) {
                System.out.print("╚");
            } else if (i < array.length + 1) {
                System.out.print("═");
            } else {
                System.out.println("╝");
            }
        }

    }

}
