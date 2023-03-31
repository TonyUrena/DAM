package ejercicio01;

import java.util.ArrayList;

public class Comentario {
    
    String contenido;
    Fecha fecha;
    
    ArrayList <Comentario>comentarios;
    
    public void comentar(String comentario){
        
    }

    public Comentario(String contenido, Fecha fecha, ArrayList<Comentario> comentarios) {
        this.contenido = contenido;
        this.fecha = fecha;
        this.comentarios = comentarios;
    }
}
