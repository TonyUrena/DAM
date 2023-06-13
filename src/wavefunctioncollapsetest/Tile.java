package wavefunctioncollapsetest;

import java.util.ArrayList;

public class Tile {

    private String character;
    //Qué tiles pueden aparecer, en orden horario empezando por el arriba Izquierda
    private ArrayList<ArrayList<String>> options = new ArrayList<ArrayList<String>>();
    
    public Tile(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public ArrayList<ArrayList<String>> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<ArrayList<String>> options) {
        this.options = options;
    }

    

}
