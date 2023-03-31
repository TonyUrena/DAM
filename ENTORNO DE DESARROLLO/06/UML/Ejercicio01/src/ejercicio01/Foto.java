package ejercicio01;

import java.util.ArrayList;

public class Foto {
    
    String epigrafe;
    int cantLikes;
    
    ArrayList <Usuario>etiquetas;
    
    public void darLike(){
        
    }

    public Foto(String epigrafe, int cantLikes, ArrayList<Usuario> etiquetas) {
        this.epigrafe = epigrafe;
        this.cantLikes = cantLikes;
        this.etiquetas = etiquetas;
    }    
}
