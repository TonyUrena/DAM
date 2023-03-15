/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej01producto;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej01Producto {

    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        Iterator iterador = arrayList.iterator();
        
        Producto producto1 = new Producto("Producto 1", 2);
        Producto producto2 = new Producto("Producto 2", 7);
        Producto producto3 = new Producto("Producto 3", 6);
        Producto producto4 = new Producto("Producto 4", 3);
        Producto producto5 = new Producto("Producto 5", 5);
        
        arrayList.add(producto1);
        arrayList.add(producto2);
        arrayList.add(producto3);
        arrayList.add(producto4);
        arrayList.add(producto5);
        
        iterador = arrayList.iterator();
        
        System.out.println("Primera iteración:");
        System.out.println("------------------------------------------");
        while (iterador.hasNext()){
            Producto productoTemporal = (Producto)iterador.next();
            
            System.out.println("Producto: " + productoTemporal.getNombre());
            System.out.println("Cantidad: " + productoTemporal.getCantidad());
            System.out.println("------------------------------------------");
        }
        
        arrayList.remove(4);
        arrayList.remove(2);
        
        Producto producto6 = new Producto("Producto 6", 4);
        arrayList.add(1,producto6);
        
        iterador = arrayList.iterator();
        
        System.out.println("Segunda iteración:");
        System.out.println("------------------------------------------");
        while (iterador.hasNext()){
            Producto productoTemporal = (Producto)iterador.next();
            
            System.out.println("Producto: " + productoTemporal.getNombre());
            System.out.println("Cantidad: " + productoTemporal.getCantidad());
            System.out.println("------------------------------------------");
        }
        
        arrayList.clear();
    }
    
}
