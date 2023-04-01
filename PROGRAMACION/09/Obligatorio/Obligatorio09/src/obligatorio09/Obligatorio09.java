/*
* Tony Ureña fortuño

    Por como estaba formulado el enunciado he entendido que el objetivo es 
    preparar un conjunto de clases para poder utilizarse en una interfaz
    más allá de lo que hemos aprendido en clase. Por ello he programado
    una clase llamada VehiculosEmpresa con unos métodos que pueden llamarse
    desde cualquier punto, y he utilizado el main con pruebas como demostración.
    Para mantener la idea de poder reutilizar la clase VehiculosEmpresa en 
    cualquier otra implementación, he utilizado un ArrayList static pero privado
    a la propia clase. No estoy seguro de si son malas praxis, me gustaría
    comentarlo por si ha sido una solución rara o entra dentro del objetivo del
    ejercicio.
*/

package obligatorio09;

import java.util.ArrayList;
import java.util.Scanner;

public class Obligatorio09 {

    public static void main(String[] args) {


        // OPCION "Añade Vehículo"
        // El usuario puede llamar a cualquiera de estos metodos desde la interfaz 
        // donde seleccione el tipo de vehículo, pasando los argumentos necesarios para
        // cada tipo de vehiculo.
        VehiculosEmpresa.anadeCoche(4, "ftw1234", "Skoda", "dorado", "1.6 algo", 20, 25);
        VehiculosEmpresa.anadeCamion(1000, "AAA1234", "Ford", "Marrón rancio", "V8", 100, 20, 4);
        VehiculosEmpresa.anadeFurgoneta(1000, "rtx4090", "citroen", "blanco", "aaa", 150, 2);
        VehiculosEmpresa.anadeMicroBus("HTL2333", "honda", "verde", "123", 122, 1, 154, 2);
        
        // OPCION "Obtener precio alquiler
        // Buscamos en el arraylist de VehiculosEmpresa y llamamos al método dentro
        // del vehículo para calcular su alquiler
        System.out.println(VehiculosEmpresa.precioAlquiler("AAA1234", 50));
        
        // OPCION "Muestra todos los precios"
        // Recorremos todo el arraylist de VehiculosEmpresa y construimos un string con
        // el precio de alquiler de todos los vehiculos para N dias
        System.out.println(VehiculosEmpresa.muestraTodosPreciosAlquiler(10));
        
    }
}
