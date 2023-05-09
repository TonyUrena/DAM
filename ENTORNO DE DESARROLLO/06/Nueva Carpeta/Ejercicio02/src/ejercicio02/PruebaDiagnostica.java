package ejercicio02;

import java.util.ArrayList;

public class PruebaDiagnostica {
    
    public String numRef;
    public String tipo;
    public String fecha;
    public int hora;
    
    private Medico medico;
    private Paciente paciente;
    ArrayList listaEnfemeros = new <Enfermero>ArrayList();

    public PruebaDiagnostica(String numRef, String tipo, String fecha, 
            int hora, Medico medico, Paciente paciente, ArrayList <Enfermero>listaEnfermeros) {
        this.numRef = numRef;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        
        this.medico = medico;
        this.paciente = paciente;
        this.listaEnfemeros = listaEnfermeros;
    }
    
}
