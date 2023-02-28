package org.alvarofalomir.loteria.paqueteB;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
// Clases añadidas para el correcto funcionamiento del programa
import java.util.Calendar;
import java.util.GregorianCalendar;
// Para los numeros aleatorios
import java.util.Random;
/**
 *
 * @author Pablo Segarra
 * Creado con NetBeans
 */
public class ClaseAuxiliarLoteria {
  //Creo una variable de clase para almacenar el total. Esta variable es visible para el resto de metodos de la clase
    public String fechacadena;    
    public double totalapuestas=0;
 
    public static void borrar_pantalla()
    {
      for ( int i=0;i<50;i++)
            System.out.println("\n");
       
    }
    public static void tecla_para_continuar() throws IOException
    {
        String texto;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nPulse una tecla para continuar ...");
        texto=teclado.readLine();
    }
    
    
    public static String sumar_fechas_dias(Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        // Direccion  para ver los delimitadores http://javatechniques.com/blog/dateformat-and-simpledateformat-examples/
        SimpleDateFormat formateador = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
        String formateada = formateador.format(cal.getTime());
      return formateada;
       
    }
       
    // Metodo de clase que calcula el dia del sorteo.
    public static String dia_del_sorteo (int tipo_sorteo)
    {
       
      Date fecha;
      fecha=new Date();
      int Dias_A_Anadir=0;
      String fechaStr;
      fechaStr=fecha.toString();
      fechaStr=fechaStr.substring(0,3).toLowerCase();
      
      if (tipo_sorteo==1) // Sorteo de la primitiva
      {
         if (fechaStr.equals("thu"))
         { 
       
          return fecha.toString();
         }
        else
         {
            if (fechaStr.equals("mon"))
             Dias_A_Anadir=3;
            if (fechaStr.equals("tue"))
             Dias_A_Anadir=2;
            if (fechaStr.equals("wed"))
             Dias_A_Anadir=1;
            if (fechaStr.equals("fri"))
             Dias_A_Anadir=6;
            if (fechaStr.equals("sat"))
             Dias_A_Anadir=5;
            if (fechaStr.equals("sun"))
             Dias_A_Anadir=4;  
         }
      }
      
      if (tipo_sorteo==2) // Sorteo de la Quiniela
      {
         if (fechaStr.equals("sun"))
         { 
          System.out.println(fechaStr);
          return fecha.toString();
         }
        else
         {
            if (fechaStr.equals("mon"))
             Dias_A_Anadir=6;
            if (fechaStr.equals("tue"))
             Dias_A_Anadir=5;
            if (fechaStr.equals("wed"))
             Dias_A_Anadir=4;
            if (fechaStr.equals("thu"))
             Dias_A_Anadir=3;
            if (fechaStr.equals("fri"))
             Dias_A_Anadir=2;
            if (fechaStr.equals("sat"))
             Dias_A_Anadir=1;  
         }
      }
      
        if (tipo_sorteo==3) // Sorteo de la Loteria Nacional
      {
         if (fechaStr.equals("sat"))
         { 
          System.out.println(fechaStr);
          return fecha.toString();
         }
        else
         {
            if (fechaStr.equals("mon"))
             Dias_A_Anadir=5;
            if (fechaStr.equals("tue"))
             Dias_A_Anadir=4;
            if (fechaStr.equals("wed"))
             Dias_A_Anadir=3;
            if (fechaStr.equals("thu"))
             Dias_A_Anadir=2;
            if (fechaStr.equals("fri"))
             Dias_A_Anadir=1;
            if (fechaStr.equals("sun"))
             Dias_A_Anadir=6;  
         }
      }
    
    return sumar_fechas_dias(fecha, Dias_A_Anadir); 
    
    }

}