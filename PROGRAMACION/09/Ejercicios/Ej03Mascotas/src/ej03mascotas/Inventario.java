package ej03mascotas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Inventario {

    private ArrayList<Mascota> listaAnimales = new ArrayList();
    private Iterator it = listaAnimales.iterator();

    //Añadir unos cuantos animales temporalmente para pruebas
    
    public void muestraListaAnimales() {
        Mascota mascota;
        while (it.hasNext()) {
            mascota = (Mascota) it.next();
            System.out.println("--------------------------");
            System.out.println("Nombre: " + mascota.getNombre() + " | Tipo: " + mascota.getTipo());
            System.out.println("--------------------------");
        }
    }

    public void muestraDatosAnimal() {
        muestraDatos(buscaMascota(listaAnimales));
    }

    public void muestraDatosTodosAnimales() {
        Mascota mascota;
        while (it.hasNext()) {
            mascota = (Mascota) it.next();
            muestraDatos(mascota);
        }
    }

    public void anadirAnimalInventario() {
        
    }

    public void retirarAnimalInventario() {
        listaAnimales.remove(buscaMascota(listaAnimales));
    }

    public void vaciaInventario() {
        listaAnimales.clear();
    }

    public void muestraDatos(Mascota mascota) {
        System.out.println("--------------------------");
        System.out.println("Nombre: " + mascota.getNombre() + " | Tipo: " + mascota.getTipo());
        System.out.println("Edad: " + mascota.getEdad() + " | Fecha Nac.: " + mascota.getFechaNacimiento());
        mascota.muestra();
        System.out.print("Habla: ");
        if (mascota.habla) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        System.out.println("Vive: ");
        if (mascota.estado) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        System.out.println("--------------------------");
    }
    
    public Mascota buscaMascota(ArrayList listaMascotas){
        Mascota mascota = null;
        /*
        Scanner reader = new Scanner(System.in);
        String nombreMascota;
        Mascota mascota;
        
        System.out.print("Introduce el nombre del animal:");
        nombreMascota = reader.nextLine();
        
        listaAnimales.indexOf()
        */
        return mascota;
    }

}
