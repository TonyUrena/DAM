package ejercicio02;

import java.util.ArrayList;

public class Paciente {

    private long numHistoria;
    private String DNI;
    protected String nombre;

    ArrayList listaMedicos = new <Medico>ArrayList();
    ArrayList listaEnfermeros = new <Enfermero>ArrayList();
    ArrayList listaPruebasDiagnosticas = new <PruebaDiagnostica>ArrayList();

    public Paciente(long numHistoria, String DNI, String nombre,
            ArrayList<Medico> listaMedicos, ArrayList<Enfermero> listaEnfermeros) {
        this.numHistoria = numHistoria;
        this.DNI = DNI;
        this.nombre = nombre;
        
        this.listaEnfermeros = listaEnfermeros;
        this.listaMedicos = listaMedicos;
    }

}
