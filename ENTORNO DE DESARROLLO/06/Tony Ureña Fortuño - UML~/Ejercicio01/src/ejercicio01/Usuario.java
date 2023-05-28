package ejercicio01;

import java.util.ArrayList;

public class Usuario {
    
    String nombre;
    ArrayList <Foto>fotosSubidas;
    
    public void subirFoto(Foto foto){
        
    }

    public Usuario(String nombre, ArrayList<Foto> fotosSubidas) {
        this.nombre = nombre;
        this.fotosSubidas = fotosSubidas;
    }
}
