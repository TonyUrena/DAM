/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio09;

public abstract class VehiculoCarga extends Vehiculo {
    
    //Atributos miembro
    private static final float TASA_PMA = 20;
    private float pma;
   

    //Constructores
    public VehiculoCarga(){
    }
    
    public VehiculoCarga(String matricula){
        super(matricula);
    }
    
    public VehiculoCarga(float pma, String matricula) {
        super(matricula);
        this.pma = pma;
    }
    
    public VehiculoCarga(float pma, String matricula, String marca, String color, String motor, int cilindrada, int anyos){
        super(matricula, marca, color, motor, cilindrada, anyos);
        this.pma = pma;
    }


    //set y get
    public float getPma() {
        return pma;
    }
    public void setPma(float pma) {
        this.pma = pma;
    }
    public static float getTASA_PMA() {
        return TASA_PMA;
    }

    //Métodos
    @Override
    public abstract String info();
    @Override
    public abstract float precioAlquilerVehiculo(int dias);
     
}
