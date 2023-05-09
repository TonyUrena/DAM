/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author xubaka
 */
public class Cliente extends Persona{
    
    private int telefonoDeContacto;

    public Cliente(int telefonoDeContacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }
    
    public void mostrar(){
        
    }
    
}
