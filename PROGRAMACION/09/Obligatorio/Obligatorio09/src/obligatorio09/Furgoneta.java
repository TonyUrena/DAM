/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio09;

public class Furgoneta extends VehiculoCarga {

    //constructores
    public Furgoneta(float pma, String matricula, String marca, String color, String motor, int cilindrada, int anyos) {
        super(pma, matricula, marca, color, motor, cilindrada, anyos);
    }

    public Furgoneta(float pma, String matricula, int anyos) {
        super(pma, matricula);
        setAnyos( anyos);
    }

    @Override
    public float precioAlquilerVehiculo (int dias){
        float precio;
        precio=(VehiculoCarga.getTASA_PMA()* getPma()) + (getPreciobase()*(float)dias);
        return precio;
    }

    @Override
    public String info(){
        String infoFurgo;

        infoFurgo="FURGONETA\n"+"===========================\n"+
        "Matricula: "+getMatricula()+ "\nMarca: "+getMarca()+
        "\nColor: "+getColor()+"\nMotor: "+getMotor()+
        "\nCilindrada: "+getCilindrada()+"\nAños: "+getAnyos()+
        "\nPMA: "+ getPma()+ " toneladas ";

        return infoFurgo;
    }
}