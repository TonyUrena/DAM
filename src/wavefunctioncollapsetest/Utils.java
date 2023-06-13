package wavefunctioncollapsetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Utils {

    public static Tile[][] generaMapaWFC(int ancho, int alto, Map tileMap) {
        Tile[][] mapa = new Tile[ancho][alto];
        int posX = 1, posY = 1;
        Random random = new Random();

        // Inicializamos el mapa (para poder empezar el algoritmo)
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                mapa[i][j] = (Tile) tileMap.get("tileNULL");
            }
        }
        // Colocamos el primer tile. Por el momento empezaremos siempre con el mismo tile,
        // TODO implementar una forma de encontrar un tile aleatorio en el hashmap
        /*
        mapa[posX - 1][posY - 1] = (Tile) tileMap.get("tile02");
        mapa[posX][posY - 1] = (Tile) tileMap.get("tile02");
        mapa[posX + 1][posY - 1] = (Tile) tileMap.get("tile02");
        mapa[posX + 1][posY] = (Tile) tileMap.get("tile02");
        mapa[posX + 1][posY + 1] = (Tile) tileMap.get("tile02");
        mapa[posX][posY + 1] = (Tile) tileMap.get("tile02");
        mapa[posX - 1][posY + 1] = (Tile) tileMap.get("tile02");
        mapa[posX - 1][posY] = (Tile) tileMap.get("tile02");
         */
        for (int i = 0; i < mapa.length - 2; i++) {
            for (int j = 0; j < mapa[0].length - 2; j++) {
                colapsaTile(mapa, posX + i, posY + j, tileMap);
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
    public static void colapsaTile(Tile[][] mapa, int posX, int posY, Map tileMap) {

        Random random = new Random();

        //Si no hay un tile ya colocado calculamos la entropía del tile
        if (mapa[posX][posY].equals(tileMap.get("tileNULL"))) {

            // Si no hay un tile recogemos las opciones de los 8 tiles de alrededor y generamos una tabla nueva
            // con la entropía del tile que vamos a colocar
            Set<String> keySet = tileMap.keySet();
            ArrayList<String> tileOptions = new ArrayList(keySet);

            //Comprobamos si alguna de las opciones NO está en las opciones del tile que estamos comprobando,
            //si no está, la eliminamos de la lista
            //Arriba Izquierda
            tileOptions.retainAll(mapa[posX - 1][posY - 1].getOptions().get(4));
            //Arriba Centro
            tileOptions.retainAll(mapa[posX][posY - 1].getOptions().get(5));
            //Arriba Derecha
            tileOptions.retainAll(mapa[posX + 1][posY - 1].getOptions().get(6));
            //Centro Derecha
            tileOptions.retainAll(mapa[posX + 1][posY].getOptions().get(7));
            //Abajo Derecha
            tileOptions.retainAll(mapa[posX + 1][posY + 1].getOptions().get(0));
            //Abajo Centro
            tileOptions.retainAll(mapa[posX][posY + 1].getOptions().get(1));
            //Abajo Izquierda
            tileOptions.retainAll(mapa[posX - 1][posY + 1].getOptions().get(2));
            //Centro Izquierda
            tileOptions.retainAll(mapa[posX - 1][posY + 1].getOptions().get(3));

            //Debug
            //System.out.println(tileOptions);

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
