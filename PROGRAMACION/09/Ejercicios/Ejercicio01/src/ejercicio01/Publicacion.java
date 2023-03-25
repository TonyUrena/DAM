package ejercicio01;

import java.util.ArrayList;

public class Publicacion {
    
    int numero;
    Fecha fecha;
    
    ArrayList <Foto>fotos;
    ArrayList <Comentario>comentarios;
    
    public void comentar(String comentario){
        
    }

    public Publicacion(int numero, Fecha fecha, ArrayList<Foto> fotos, ArrayList<Comentario> comentarios) {
        this.numero = numero;
        this.fecha = fecha;
        this.fotos = fotos;
        this.comentarios = comentarios;
    }    
}
