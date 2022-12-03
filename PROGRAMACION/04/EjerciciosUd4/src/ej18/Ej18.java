package ej18;

import java.util.Scanner;

public class Ej18 {

    public static void main(String[] args) {
        
        float horasTotales, horasExtras, tarifa,
              salarioNeto = 0, salarioBruto,
              tasas400 = 0, tasas900 = 0, tasasTotales = 0;
        String nombre;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del trabajador: ");
        nombre = reader.nextLine();
        System.out.print("Introduce el precio/hora: ");
        tarifa = reader.nextFloat();
        System.out.print("Introduce las horas trabajadas: ");
        horasTotales = reader.nextFloat();

        if (horasTotales > 35){
            horasExtras = horasTotales - 35;
            salarioBruto = (35 * tarifa) + (horasExtras * tarifa * 1.5f);
        } else {salarioBruto = horasTotales * tarifa;}

        if (salarioBruto <= 500){
            salarioNeto = salarioBruto;
        }else if(salarioBruto > 500){
            tasas400 = ((salarioBruto - 500) * 0.25f);
            if(salarioBruto > 900){
                tasas900 = ((salarioBruto - 900) * 0.45f);
            }
            tasasTotales = tasas400 + tasas900;
            salarioNeto = salarioBruto - tasasTotales;
        }
        
        System.out.println("Empleado: " + nombre + "\n" +
                           "Salario Bruto: " + salarioBruto + "\n" +
                           "Tasas primeros 500€: 0€" + "\n" +
                           "Tasas siguientes 400€: " + tasas400 + "€.\n" +
                           "Tasas a partir de 900€: " + tasas900 + "€.\n" +
                           "Tasas Totales: " + tasasTotales + "€.\n" + 
                           "Salario Neto: " + salarioNeto +"€.\n");
    }
}