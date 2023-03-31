/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio09;

public class Coche extends Vehiculo {
    //atributos
    private int plazas;  
   
    //constructor   
    public Coche(String matricula, int plazas){
        super(matricula);
        this.plazas=plazas;
    }
   
    public Coche(int plazas, String matricula, String marca, String color, String motor, int cilindrada, int anyos) {
        super(matricula, marca, color, motor, cilindrada, anyos);
        this.plazas = plazas;
    }

    public Coche(){
    }
   
    //get y set
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
   
   
    //métodos
    @Override
    public float precioAlquilerVehiculo (int dias){
        float precio;
        precio = (getPreciobase()* (float)dias) + ((float)getPlazas() * 1.5f * (float)dias);
        return precio;
    }            
       
    @Override
    public String info(){ 
        String infococh;
       
        infococh="COCHE\n"+"===========================\n"+
                "Matricula: "+getMatricula()+ "\nMarca: "+getMarca()+
                "\nColor: "+getColor()+"\nMotor: "+getMotor()+
                "\nCilindrada: "+getCilindrada()+"\nAños: "+getAnyos()+
                "\nPlazas: "+getPlazas();    
       
        return infococh;
    }
  
    
}