/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio09;

public abstract class Vehiculo {
    
    private static float PRECIOBASE=50; 
    // atributos miembro
    private String matricula;
    private String marca;
    private String color;
    private String motor;
    private int cilindrada;
    private int anyos;   
    
     //constructores
    public Vehiculo (){
    }

    public Vehiculo(String matricula, int anyos) {
        this.matricula = matricula;
        this.anyos = anyos;
    }
   
    public Vehiculo(String matricula, String marca, String color, String motor, int cilindrada, int anyos) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.anyos = anyos;
    }
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
   
    //set y get
    public String getMatricula() {
        return matricula;
    }
   
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
    public static float getPreciobase() {
        return PRECIOBASE;
    }
   
    public String getMarca(){
        return marca;
    }
   
    public void setMarca(String marca){
        this.marca=marca;
    }
   
    public String getColor(){
        return color;
    }
   
    public void setColor(String color){
        this.color=color;
    }
   
    public String getMotor(){
        return motor;
    }
   
    public void setMotor(String motor){
        this.motor=motor;
    }
   
    public int getCilindrada(){
        return cilindrada;
    }
   
    public void setCilindrada(int cilindrada){
        this.cilindrada=cilindrada;
    }
   
    public int getAnyos(){
        return anyos;
    }
   
    public void setAnyos(int anyos){
        this.anyos=anyos;
    }
   
   //métodos abstractos
    public abstract String info();
    public abstract float precioAlquilerVehiculo(int dias);

}