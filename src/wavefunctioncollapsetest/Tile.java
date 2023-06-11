package wavefunctioncollapsetest;


public class Tile {

    private String character;
    //Qué tiles pueden aparecer, en orden horario empezando por el arriba Izquierda
    private Tile[][] options = new Tile[8][];

    public Tile(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Tile[][] getOptions() {
        return options;
    }

    public void setOptions(Tile[][] options) {
        this.options = options;
    }
    
}
