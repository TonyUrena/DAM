package wavefunctioncollapsetest;

import java.util.ArrayList;
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
        
        ArrayList<ArrayList<String>> options00 = new ArrayList<ArrayList<String>>();
        options00.add(new ArrayList<String>()); 
        options00.get(0).add("tile00"); options00.get(0).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(1).add("tile00"); options00.get(1).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(2).add("tile00"); options00.get(2).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(3).add("tile00"); options00.get(3).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(4).add("tile00"); options00.get(4).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(5).add("tile00"); options00.get(5).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(6).add("tile00"); options00.get(6).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(7).add("tile00"); options00.get(7).add("tile01");
        options00.add(new ArrayList<String>()); 
        options00.get(8).add("tile00"); options00.get(8).add("tile01");
        tile00.setOptions(options00);
        
        ArrayList<ArrayList<String>> options01 = new ArrayList<ArrayList<String>>();
        options01.add(new ArrayList<String>());
        options01.get(0).add("tile00"); options01.get(0).add("tile01"); options01.get(0).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(1).add("tile00"); options01.get(1).add("tile01"); options01.get(1).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(2).add("tile00"); options01.get(2).add("tile01"); options01.get(2).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(3).add("tile00"); options01.get(3).add("tile01"); options01.get(3).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(4).add("tile00"); options01.get(4).add("tile01"); options01.get(4).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(5).add("tile00"); options01.get(5).add("tile01"); options01.get(5).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(6).add("tile00"); options01.get(6).add("tile01"); options01.get(6).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(7).add("tile00"); options01.get(7).add("tile01"); options01.get(7).add("tile02");
        options01.add(new ArrayList<String>());
        options01.get(8).add("tile00"); options01.get(8).add("tile01"); options01.get(8).add("tile02");
        tile01.setOptions(options01);
        
        ArrayList<ArrayList<String>> options02 = new ArrayList<ArrayList<String>>();
        options02.add(new ArrayList<String>());
        options02.get(0).add("tile01"); options02.get(0).add("tile02"); options02.get(0).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(1).add("tile01"); options02.get(1).add("tile02"); options02.get(1).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(2).add("tile01"); options02.get(2).add("tile02"); options02.get(2).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(3).add("tile01"); options02.get(3).add("tile02"); options02.get(3).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(4).add("tile01"); options02.get(4).add("tile02"); options02.get(4).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(5).add("tile01"); options02.get(5).add("tile02"); options02.get(5).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(6).add("tile01"); options02.get(6).add("tile02"); options02.get(6).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(7).add("tile01"); options02.get(7).add("tile02"); options02.get(7).add("tile03");
        options02.add(new ArrayList<String>());
        options02.get(8).add("tile01"); options02.get(8).add("tile02"); options02.get(8).add("tile03");
        tile02.setOptions(options02);
        
        ArrayList<ArrayList<String>> options03 = new ArrayList<ArrayList<String>>();
        options03.add(new ArrayList<String>());
        options03.get(0).add("tile02"); options03.get(0).add("tile03"); options03.get(0).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(1).add("tile02"); options03.get(1).add("tile03"); options03.get(1).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(2).add("tile02"); options03.get(2).add("tile03"); options03.get(2).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(3).add("tile02"); options03.get(3).add("tile03"); options03.get(3).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(4).add("tile02"); options03.get(4).add("tile03"); options03.get(4).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(5).add("tile02"); options03.get(5).add("tile03"); options03.get(5).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(6).add("tile02"); options03.get(6).add("tile03"); options03.get(6).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(7).add("tile02"); options03.get(7).add("tile03"); options03.get(7).add("tile04");
        options03.add(new ArrayList<String>());
        options03.get(8).add("tile02"); options03.get(8).add("tile03"); options03.get(8).add("tile04");
        tile03.setOptions(options03);
        
        ArrayList<ArrayList<String>> options04 = new ArrayList<ArrayList<String>>();
        options04.add(new ArrayList<String>());
        options04.get(0).add("tile03"); options04.get(0).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(1).add("tile03"); options04.get(1).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(2).add("tile03"); options04.get(2).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(3).add("tile03"); options04.get(3).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(4).add("tile03"); options04.get(4).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(5).add("tile03"); options04.get(5).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(6).add("tile03"); options04.get(6).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(7).add("tile03"); options04.get(7).add("tile04");
        options04.add(new ArrayList<String>());
        options04.get(8).add("tile03"); options04.get(8).add("tile04");
        tile04.setOptions(options04);
        
        ArrayList<ArrayList<String>> optionsNULL = new ArrayList<ArrayList<String>>();
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(0).add("tile00"); optionsNULL.get(0).add("tile01"); optionsNULL.get(0).add("tile02"); optionsNULL.get(0).add("tile03"); optionsNULL.get(0).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(1).add("tile00"); optionsNULL.get(1).add("tile01"); optionsNULL.get(1).add("tile02"); optionsNULL.get(1).add("tile03"); optionsNULL.get(1).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(2).add("tile00"); optionsNULL.get(2).add("tile01"); optionsNULL.get(2).add("tile02"); optionsNULL.get(2).add("tile03"); optionsNULL.get(2).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(3).add("tile00"); optionsNULL.get(3).add("tile01"); optionsNULL.get(3).add("tile02"); optionsNULL.get(3).add("tile03"); optionsNULL.get(3).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(4).add("tile00"); optionsNULL.get(4).add("tile01"); optionsNULL.get(4).add("tile02"); optionsNULL.get(4).add("tile03"); optionsNULL.get(4).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(5).add("tile00"); optionsNULL.get(5).add("tile01"); optionsNULL.get(5).add("tile02"); optionsNULL.get(5).add("tile03"); optionsNULL.get(5).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(6).add("tile00"); optionsNULL.get(6).add("tile01"); optionsNULL.get(6).add("tile02"); optionsNULL.get(6).add("tile03"); optionsNULL.get(6).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(7).add("tile00"); optionsNULL.get(7).add("tile01"); optionsNULL.get(7).add("tile02"); optionsNULL.get(7).add("tile03"); optionsNULL.get(7).add("tile04");
        optionsNULL.add(new ArrayList<String>());
        optionsNULL.get(8).add("tile00"); optionsNULL.get(8).add("tile01"); optionsNULL.get(8).add("tile02"); optionsNULL.get(8).add("tile03"); optionsNULL.get(8).add("tile04");
        tileNULL.setOptions(optionsNULL);
        
        Map<String, Tile> tileMap = new HashMap<String, Tile>();

        tileMap.put("tile00", tile00);
        tileMap.put("tile01", tile01);
        tileMap.put("tile02", tile02);
        tileMap.put("tile03", tile03);
        tileMap.put("tile04", tile04);
        tileMap.put("tileNULL", tileNULL);

        Tile[][] map = new Tile[400][100];

        map = Utils.generaMapaWFC(map.length, map[0].length, tileMap);

        Utils.dibujaPantalla(map);

    }

}
