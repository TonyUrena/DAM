package obligatorio09;

import java.util.ArrayList;
import java.util.Iterator;

public class VehiculosEmpresa {
    
    private static ArrayList<Vehiculo> vehiculosEmpresa = new ArrayList();
    
    public static void anadeCoche(int plazas, String matricula, String marca, String color, String motor, int cilindrada, int anyos) {
        Coche coche = new Coche(plazas, matricula, marca, color, motor, cilindrada, anyos);
        vehiculosEmpresa.add(coche);
    }
    
    public static void anadeCamion(float pma, String matricula, String marca, String color, String motor, int cilindrada, int anyos, int ruedas) {
        Camion camion = new Camion(0, matricula, marca, color, motor, 0, 0, 0);
        vehiculosEmpresa.add(camion);
    }
    
    public static void anadeFurgoneta(float pma, String matricula, String marca, String color, String motor, int cilindrada, int anyos) {
        Furgoneta furgoneta = new Furgoneta(pma, matricula, marca, color, motor, cilindrada, anyos);
        vehiculosEmpresa.add(furgoneta);
    }
    
    public static void anadeMicroBus(String matricula, String marca, String color, String motor, int cilindrada, int anyos, int plazas, int metros) {
        MicroBus microbus = new MicroBus(matricula, marca, color, motor, cilindrada, anyos, plazas, metros);
        vehiculosEmpresa.add(microbus);
    }

    public static Vehiculo buscaVehículo(String matricula){
        
        Iterator it = vehiculosEmpresa.iterator();
        Vehiculo vehiculo = null;
        
        while(it.hasNext()){
            Vehiculo v = (Vehiculo)it.next();
            if(v.getMatricula().equalsIgnoreCase(matricula)){
                vehiculo = v;
            }
        }
        
        return vehiculo;
    }
    
    public static float precioAlquiler(String matricula, int dias){
        
        Vehiculo v = buscaVehículo(matricula);
        return v.precioAlquilerVehiculo(dias);
        
    }
    
    public static String muestraTodosPreciosAlquiler(int dias){
        
        String s = "";
        
        for (int i = 0; i < vehiculosEmpresa.size(); i++) {
            s += "Matricula: " + vehiculosEmpresa.get(i).getMatricula() + "\t|\t" +
            "Precio por " + dias + " días: " + vehiculosEmpresa.get(i).precioAlquilerVehiculo(dias) + "€\n";
        }
        
        return s;
    }
    
    //Getters & setters
    public static ArrayList<Vehiculo> getVehiculosEmpresa() {
        return vehiculosEmpresa;
    }
    
    
    
}

