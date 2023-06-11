package wavefunctioncollapsetest;

import java.util.Arrays;

public class WaveFunctionCollapseTEST {

    public static void main(String[] args) {
        
        //(int)(Math.random()*5+1)
        
        Tile tile00 = new Tile(" ");
        Tile tile01 = new Tile("░");
        Tile tile02 = new Tile("▒");
        Tile tile03 = new Tile("▓");
        Tile tile04 = new Tile("█");
        Tile tileNULL = new Tile("·");
        
        Tile[][] tile00Options = new Tile[8][2];
        for (int i = 0; i < tile00Options.length; i++) {
            tile00Options[i][0] = tile00;
            tile00Options[i][1] = tile01;
        }
        
        Tile[][] tile01Options = new Tile[8][3];
        for (int i = 0; i < tile00Options.length; i++) {
            tile00Options[i][0] = tile00;
            tile00Options[i][1] = tile01;
            tile00Options[i][1] = tile02;
        }
        
        Tile[][] tile02Options = new Tile[8][3];
        for (int i = 0; i < tile00Options.length; i++) {
            tile00Options[i][0] = tile01;
            tile00Options[i][1] = tile02;
            tile00Options[i][1] = tile03;
        }
        
        Tile[][] tile03Options = new Tile[8][3];
        for (int i = 0; i < tile00Options.length; i++) {
            tile00Options[i][0] = tile02;
            tile00Options[i][1] = tile03;
            tile00Options[i][1] = tile04;
        }
        
        Tile[][] tile04Options = new Tile[8][2];
        for (int i = 0; i < tile00Options.length; i++) {
            tile00Options[i][0] = tile03;
            tile00Options[i][1] = tile04;
        }
        
        tile00.setOptions(tile00Options);
        
        Tile[][] map = new Tile[100][10];
        Tile[] tileArray = new Tile[6];
        
        tileArray[0] = tile00;
        tileArray[1] = tile01;
        tileArray[2] = tile02;
        tileArray[3] = tile03;
        tileArray[4] = tile04;
        tileArray[5] = tileNULL;
        
        map = Utils.generaMapaWFC(map.length, map[0].length, tileArray);
        
        Utils.dibujaPantalla(map);

    }

}
