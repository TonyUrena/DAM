package ejercicio02;

import java.util.ArrayList;

public class Enfermero {
    
    private int numColegiado;
    
    ArrayList listaPacientes = new <Paciente>ArrayList();
    ArrayList listaPruebasDiagnosticas = new <PruebaDiagnostica>ArrayList();

    public Enfermero(int numColegiado) {
        this.numColegiado = numColegiado;
    }
    
}
