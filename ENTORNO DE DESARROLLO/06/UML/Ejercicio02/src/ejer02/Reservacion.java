package ejer02;

import java.util.ArrayList;


public class Reservacion {

    public String modeloAuto, marca, color, disponibilidad;
    private String matricula;
    ArrayList <Pago>pagos = new ArrayList();
    
    public Reservacion(ArrayList pagos){
        this.pagos = pagos;
    }

    public void alquilerHoras(int horas){
        
    }
    
    public void alquilerDias(int dias){
        
    }
    
    private void entrega(int fecha, int hora){
        
    }
}
