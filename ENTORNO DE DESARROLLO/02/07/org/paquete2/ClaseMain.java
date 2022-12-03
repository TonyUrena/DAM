package paquete2;

import org.json.JSONObject;
import paquete1.Saludos;

public class ClaseMain {
    public static void main(String[] args) {

    /* Creación de un objeto JSON y llamada al metodo put
    del objeto recien creado.
    La clase JSONObject esta definida en el fichero json.jar.
    */

    JSONObject objeto = new JSONObject();
    objeto.put("nombre","Pablo Segarra");

    // Se almacena en la variable saludo el resultado de llamar
    // a la función saludoMañana de la clase Saludos.

    String saludo = Saludos.saludoMañana();
    
    // Se muestra por pantalla el contenido de las variables
    System.out.println(saludo);
    System.out.println(objeto);
    }
}