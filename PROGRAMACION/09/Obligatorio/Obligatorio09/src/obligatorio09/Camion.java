/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio09;

public class Camion extends VehiculoCarga {
    private final static float PRECIO_FIJO=40;
    
    private int ruedas;

    //constructor
    public Camion(float pma, String matricula, String marca, String color, String motor, int cilindrada, int anyos, int ruedas){
        super(pma, matricula, marca, color, motor, cilindrada, anyos);
        this.ruedas = ruedas;
    }

    public Camion(float pma, String matricula, int anyos) {
        super(pma, matricula);
        setAnyos(anyos);
    }
    
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    //métodos
    @Override
    public String info() {
        String infocamion;
        infocamion="CAMION\n"+"===========================\n"+
        "Matricula: "+getMatricula()+ "\nMarca: "+getMarca()+
        "\nColor: "+getColor()+"\nMotor: "+getMotor()+
        "\nCilindrada: "+getCilindrada()+"\nAños: "+getAnyos()+
        "\nPeso: "+getPma();
        return infocamion;
    }

    @Override
    public float precioAlquilerVehiculo(int dias) {
        float precio;
        precio=(VehiculoCarga.getTASA_PMA()* getPma()) + (getPreciobase()*(float)dias) + PRECIO_FIJO;
        return precio;
    }

}