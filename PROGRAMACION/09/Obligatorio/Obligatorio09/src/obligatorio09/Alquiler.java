/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio09;

public class Alquiler {
    // Atributos
    private Vehiculo vehiculo;
    private int dias;

    //constructor
    public Alquiler(Vehiculo v, int dias) {
        this.vehiculo = v;
        this.dias = dias;
    }


    //gets y sets
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}