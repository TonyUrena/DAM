/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio09;


public class MicroBus extends Vehiculo {

    private final static int PRECIO_PLAZA=2;
    private int plazas;
    private int metros;

    //constructores
    public MicroBus() {
    }

    public MicroBus(String matricula, int anyos, int plazas, int metros) {
        super(matricula, anyos);
        this.plazas = plazas;
        this.metros = metros;
    }

    public MicroBus(String matricula, String marca, String color, String motor, int cilindrada, int anyos, int plazas, int metros) {
        super(matricula, marca, color, motor, cilindrada, anyos);
        this.plazas = plazas;
        this.metros = metros;
    }

    public MicroBus(String matricula) {
        super(matricula);
    }

    public static int getPrecioPlaza() {
        return PRECIO_PLAZA;
    }
 
    public int getPlazas() {
        return plazas;
    }
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
 
    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    //métodos
    @Override
    public float precioAlquilerVehiculo (int dias){
        float precio;
        precio = (getPreciobase()* (float)dias);
        precio = precio + ((float)getPlazas() * 1.5f * (float)dias);
        precio = precio + ((float)getPlazas() * PRECIO_PLAZA);
        return precio;
    }
    @Override
    public String info(){
        String infomicroB;

        infomicroB="MICROBUS\n"+"===========================\n"+
        "Matricula: "+getMatricula()+ "\nMarca: "+getMarca()+
        "\nColor: "+getColor()+"\nMotor: "+getMotor()+
        "\nCilindrada: "+getCilindrada()+"\nAños: "+getAnyos()+
        "\nPlazas: "+getPlazas()+
        "\nMetros: "+getMetros();
        return infomicroB;
    }
}
