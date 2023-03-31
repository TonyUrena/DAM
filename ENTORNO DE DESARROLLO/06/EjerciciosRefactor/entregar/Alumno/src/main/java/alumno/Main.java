/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Alumno("pepe", "12345678", LocalDate.parse("2003-06-22")));
        lista.add(new Alumno("ana",  "87654321X", LocalDate.parse("1999-01-11")));
        lista.add(new Alumno("luis", "00000000T", LocalDate.parse("2002-02-28")));
        lista.get(0).asignarLetraDNI();
        System.out.println("Lista inicial:\n"+lista);
        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return (int)ChronoUnit.DAYS.between(p2.getFechaNacimiento(), p1.getFechaNacimiento());
            }
        });
        System.out.println("Lista ordenada por edad:\n"+lista);
    }

}
