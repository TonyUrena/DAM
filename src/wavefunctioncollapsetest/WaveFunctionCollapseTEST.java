package wavefunctioncollapsetest;

import java.util.HashMap;
import java.util.Map;

public class WaveFunctionCollapseTEST {

    public static void main(String[] args) {

        Tile tile00 = new Tile(" ");
        Tile tile01 = new Tile("░");
        Tile tile02 = new Tile("▒");
        Tile tile03 = new Tile("▓");
        Tile tile04 = new Tile("█");
        Tile tileNULL = new Tile("·");
        
        String[][] opcionesTile00 = {
            {"tile00", "tile01"},
            {"tile00", "tile01"},
            {"tile00", "tile01"},
            {"tile00", "tile01"},
            {"tile00", "tile01"},
            {"tile00", "tile01"},
            {"tile00", "tile01"},
            {"tile00", "tile01"}
        };
        tile00.setOptions(opcionesTile00);
        
        String[][] opcionesTile01 = {
            {"tile00", "tile01", "tile02"},
            {"tile00", "tile01", "tile02"},
            {"tile00", "tile01", "tile02"},
            {"tile00", "tile01", "tile02"},
            {"tile00", "tile01", "tile02"},
            {"tile00", "tile01", "tile02"},
            {"tile00", "tile01", "tile02"},
            {"tile00", "tile01", "tile02"}
        };
        tile01.setOptions(opcionesTile01);
        
        String[][] opcionesTile02 = {
            {"tile01", "tile02", "tile03"},
            {"tile01", "tile02", "tile03"},
            {"tile01", "tile02", "tile03"},
            {"tile01", "tile02", "tile03"},
            {"tile01", "tile02", "tile03"},
            {"tile01", "tile02", "tile03"},
            {"tile01", "tile02", "tile03"},
            {"tile01", "tile02", "tile03"}
        };
        tile02.setOptions(opcionesTile02);
        
        String[][] opcionesTile03 = {
            {"tile02", "tile03", "tile04"},
            {"tile02", "tile03", "tile04"},
            {"tile02", "tile03", "tile04"},
            {"tile02", "tile03", "tile04"},
            {"tile02", "tile03", "tile04"},
            {"tile02", "tile03", "tile04"},
            {"tile02", "tile03", "tile04"},
            {"tile02", "tile03", "tile04"}
        };
        tile03.setOptions(opcionesTile03);
        
        String[][] opcionesTile04 = {
            {"tile03", "tile04"},
            {"tile03", "tile04"},
            {"tile03", "tile04"},
            {"tile03", "tile04"},
            {"tile03", "tile04"},
            {"tile03", "tile04"},
            {"tile03", "tile04"},
            {"tile03", "tile04"}
        };
        tile04.setOptions(opcionesTile04);
        
        String[][] opcionesTileNULL = {
            {"tile00", "tile01", "tile02", "tile03", "tile04"},
            {"tile00", "tile01", "tile02", "tile03", "tile04"},
            {"tile00", "tile01", "tile02", "tile03", "tile04"},
            {"tile00", "tile01", "tile02", "tile03", "tile04"},
            {"tile00", "tile01", "tile02", "tile03", "tile04"},
            {"tile00", "tile01", "tile02", "tile03", "tile04"},
            {"tile00", "tile01", "tile02", "tile03", "tile04"},
            {"tile00", "tile01", "tile02", "tile03", "tile04"}
        };
        tileNULL.setOptions(opcionesTileNULL);
        
        Map<String, Tile> tileMap = new HashMap<String, Tile>();

        tileMap.put("tile00", tile00);
        tileMap.put("tile01", tile01);
        tileMap.put("tile02", tile02);
        tileMap.put("tile03", tile03);
        tileMap.put("tile04", tile04);
        tileMap.put("tileNULL", tileNULL);

        Tile[][] map = new Tile[100][10];

        map = Utils.generaMapaWFC(map.length, map[0].length, tileMap);

        Utils.dibujaPantalla(map);

    }

}
