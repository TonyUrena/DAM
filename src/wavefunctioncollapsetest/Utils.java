package wavefunctioncollapsetest;

import java.util.Random;

public class Utils {

    public static Tile[][] generaMapaWFC(int ancho, int alto, Tile[] tileArray) {
        Tile[][] mapa = new Tile[ancho][alto];
        int posX = 20, posY = 5,
                posXrdm, posYrdm,
                newPosX, newPosY;
        Random random = new Random();

        // Inicializamos el mapa (para poder empezar el algoritmo)
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                mapa[i][j] = tileArray[5];
            }
        }

        // Colocamos el primer tile. Por el momento lo colocaremos siempre en el mismo punto
        mapa[posX][posY] = tileArray[1];

        // Comenzamos a comprobar y colocar los tiles alrededor del tile de origen
        int cont = 10;
        do {
            if (mapa[posX - 1][posY - 1].getCharacter().equals("·")) {
                mapa[posX - 1][posY - 1] = tileArray[random.nextInt(5)];
            }
            
            if (mapa[posX][posY - 1].getCharacter().equals("·")) {
                mapa[posX][posY - 1] = tileArray[random.nextInt(5)];
            }
            
            if (mapa[posX + 1][posY - 1].getCharacter().equals("·")) {
                mapa[posX + 1][posY - 1] = tileArray[random.nextInt(5)];
            }
            
            if (mapa[posX + 1][posY].getCharacter().equals("·")) {
                mapa[posX + 1][posY] = tileArray[random.nextInt(5)];
            }
            
            if (mapa[posX + 1][posY + 1].getCharacter().equals("·")) {
                mapa[posX + 1][posY + 1] = tileArray[random.nextInt(5)];
            }
            
            if (mapa[posX][posY + 1].getCharacter().equals("·")) {
                mapa[posX][posY + 1] = tileArray[random.nextInt(5)];
            }
            
            if (mapa[posX - 1][posY + 1].getCharacter().equals("·")) {
                mapa[posX - 1][posY + 1] = tileArray[random.nextInt(5)];
            }
            
            if (mapa[posX - 1][posY].getCharacter().equals("·")) {
                mapa[posX - 1][posY] = tileArray[random.nextInt(5)];
            }
            
            posX++;
            
            cont--;
        } while (cont > 0);

        // Comprobamos si la nueva posición está dentro de los límites del mapa
        /*
        if(newPosX > mapa.length) newPosX--;
        if(newPosY > mapa[0].length) newPosY--;
        if(newPosX < 0) newPosX++;
        if(newPosY < 0) newPosY++;
         */
        // Cambiamos por un nuevo tile si no había uno antes

        return mapa;
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
