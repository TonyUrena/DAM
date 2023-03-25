package ejercicio01;

import java.util.ArrayList;

public class Muro {
    
    boolean sePuedePublicar;
    
    ArrayList <Publicacion>publicaciones;
    
    public void publicar(){
        
    }

    public Muro(boolean sePuedePublicar, ArrayList<Publicacion> publicaciones) {
        this.sePuedePublicar = sePuedePublicar;
        this.publicaciones = publicaciones;
    }
    
}
