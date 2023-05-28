package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;


public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        
        listaPersona.add(new Persona("Mario",22,187));
        listaPersona.add(new Persona("Pepe",52,173));
        listaPersona.add(new Persona("Manuel",27,158));
        listaPersona.add(new Persona("David",25,164));
        listaPersona.add(new Persona("Alberto",80,184));
        
        System.out.println("------------------ SIN ORDENAR ----------------------");
        for (Persona persona : listaPersona) {
            System.out.println(persona.getNombre() + " - Altura: " + persona.getAltura() + " - Edad: " + persona.getEdad());
        }
        
        System.out.println("------------------ ALTURA ----------------------");
        Collections.sort(listaPersona);
        
        for (Persona persona : listaPersona) {
            System.out.println(persona.getNombre() + " - Altura: " + persona.getAltura() + " - Edad: " + persona.getEdad());
        }
        
        System.out.println("------------------ EDAD ----------------------");
        Collections.sort(listaPersona, Persona::compareToEdad);
        for (Persona persona : listaPersona) {
            System.out.println(persona.getNombre() + " - Altura: " + persona.getAltura() + " - Edad: " + persona.getEdad());
        }
    }

}
