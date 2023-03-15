package ej02astros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej02Astros {

    public static void main(String[] args) {

        ArrayList listaPlanetas = new ArrayList();
        ArrayList listaSatelites = new ArrayList();
        int selectorMenu = 0;
        Scanner reader = new Scanner(System.in);

        // Instanciado de planetas
        //////////////////////////////
        Planeta mercurio = new Planeta("Mercurio", 1000, 122, 1222,
                5, 5, 444, 2,
                333, 12, 0, false);
        Planeta venus = new Planeta("Venus", 155, 122, 4,
                5, 10, 222, 33,
                2, 5, 0, false);
        Planeta tierra = new Planeta("Tierra", 1000, 365, 1500,
                22555, 24, 365, 222211,
                1, 1544, 1, true);
        Planeta marte = new Planeta("Marte", 4122, 2555, 2,
                1111, 2, 55, 2,
                5, 22, 2, true);
        Planeta jupiter = new Planeta("Júpiter", 555, 222, 2,
                2222, 332, 116, 4,
                6465, 5646, 6, true);

        // Instanciado de Satélites
        ///////////////////////////////
        Satelite luna = new Satelite("Luna", 1222, 522, tierra,
                211, 222, 155, 45,
                255, 1, 111, 1);
        Satelite fobos = new Satelite("Fobos", 4555, 113, marte,
                128, 212, 21213, 12,
                12, 31, 3, 1);
        Satelite deimos = new Satelite("Deimos", 4555, 123, marte,
                12530, 25, 1, 51,
                532, 51, 31, 61);
        Satelite io = new Satelite("Ío", 2311, 212, jupiter,
                1233, 121, 21, 0,
                21, 2, 1, 2);
        Satelite europa = new Satelite("Europa", 123, 123, jupiter,
                123, 31, 21, 1,
                21, 21, 31, 0);
        Satelite ganimedes = new Satelite("Ganímedes", 1325, 13, jupiter,
                21, 21, 2, 5,
                1, 32, 5, 1);
        Satelite calisto = new Satelite("Calisto", 13, 31, jupiter,
                1235, 185, 1, 5215,
                1, 5218, 12, 1);

        listaPlanetas.add(mercurio);
        listaPlanetas.add(venus);
        listaPlanetas.add(tierra);
        listaPlanetas.add(marte);
        listaPlanetas.add(jupiter);

        listaSatelites.add(luna);
        listaSatelites.add(fobos);
        listaSatelites.add(deimos);
        listaSatelites.add(io);
        listaSatelites.add(europa);
        listaSatelites.add(ganimedes);
        listaSatelites.add(calisto);

        // Menú de seleccion
        /////////////////////////
        do {

            System.out.println("");
            System.out.println("1. Imprimir todos los astros");
            System.out.println("2. Seleccionar el astro a mostrar");
            System.out.println("0. Salir");
            System.out.println("");

            selectorMenu = reader.nextInt();

            switch (selectorMenu) {
                case 1:
                    muestraTodosAstros(listaPlanetas, listaSatelites);
                    break;
                case 2:
                    muestraAstrosParaSeleccionar(listaPlanetas, listaSatelites);
                    break;
                case 0:
                    System.out.println("Cerrando.");
                default:
                    System.err.println("Opcion Incorrecta");
            }

        } while (selectorMenu != 0);

    }

    public static void muestraTodosAstros(ArrayList listaPlanetas, ArrayList listaSatelites) {

        Iterator iterador = listaPlanetas.iterator();

        while (iterador.hasNext()) {
            Planeta p = (Planeta) iterador.next();
            p.muestra();
        }

        iterador = listaSatelites.iterator();

        while (iterador.hasNext()) {
            Satelite s = (Satelite) iterador.next();
            s.muestra();
        }
    }

    public static void muestraAstrosParaSeleccionar(ArrayList listaPlanetas, ArrayList listaSatelites) {

        Iterator iterador = listaPlanetas.iterator();
        int selectorMenu = 0;
        Scanner reader = new Scanner(System.in);

        int i = 0;
        System.out.println("\nPlanetas:");
        System.out.println("--------------------");

        while (iterador.hasNext()) {
            i++;
            Planeta p = (Planeta) iterador.next();
            System.out.println(i + ". " + p.getNombreAstro());
        }

        iterador = listaSatelites.iterator();

        System.out.println("\nSatélites:");
        System.out.println("--------------------");

        while (iterador.hasNext()) {
            i++;
            Satelite s = (Satelite) iterador.next();
            System.out.println(i + ". " + s.getNombreAstro());
        }

        System.out.println("0. Salir");

        do {

            selectorMenu = reader.nextInt();

            if (selectorMenu <= listaPlanetas.size() && selectorMenu > 0) {
                Planeta p = (Planeta) listaPlanetas.get(selectorMenu - 1);
                p.muestra();
            } else if (selectorMenu > 0) {
                if (selectorMenu < 0 || selectorMenu > listaPlanetas.size() + listaSatelites.size()) {
                    System.err.println("Astro incorrecto");
                } else {
                    Satelite s = (Satelite) listaSatelites.get(selectorMenu - listaPlanetas.size() - 1);
                    s.muestra();
                }
            }

        } while (selectorMenu != 0);

    }

}
