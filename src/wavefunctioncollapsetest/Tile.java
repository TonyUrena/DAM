package wavefunctioncollapsetest;

import java.util.ArrayList;

public class Tile {

    private String character;
    //Qué tiles pueden aparecer, en orden horario empezando por el arriba Izquierda
    private String[][] options = new String[8][];
    
    public Tile(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String[][] getOptions() {
        return options;
    }

    public void setOptions(String[][] options) {
        this.options = options;
    }

}
