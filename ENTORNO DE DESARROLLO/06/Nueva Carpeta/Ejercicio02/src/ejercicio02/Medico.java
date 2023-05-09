package ejercicio02;

import java.util.ArrayList;

public class Medico {
    
    private String especialidad;
    
    ArrayList ListaPruebasDiagnosticas = new <PruebaDiagnostica>ArrayList();
    ArrayList ListaPacientes = new <Paciente>ArrayList();

    public Medico(String especialidad, Paciente paciente) {
        this.especialidad = especialidad;
    }
    
}
