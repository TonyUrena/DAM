package paquete;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



class Serializame
{
    public void serializa(Object objetoQueSerializas, String nombreFichero){
         
        // Serialization
        try
        {  
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(nombreFichero);
            ObjectOutputStream out = new ObjectOutputStream(file);
             
            // Method for serialization of object
            out.writeObject(objetoQueSerializas);
             
            out.close();
            file.close();
             
            System.out.println("Object has been serialized");
 
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }
    
    public Object deserializa(String nombreFichero){

        Object objetoQueRecibeLosDatosAnteriormenteSerializados = null;
        
        // Deserialization
        try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream(nombreFichero);
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            objetoQueRecibeLosDatosAnteriormenteSerializados = in.readObject();
             
            in.close();
            file.close();                         
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        
        return objetoQueRecibeLosDatosAnteriormenteSerializados;
    }
    
    public static void main(String[] args)
    {  
        Serializame serializa = new Serializame();
        
        String nombreFichero = "datos.dat";
        Demo object = new Demo(1, "perro");
        Demo object2 = new Demo(2, "gato");
        
        Demo [] arrayDemos = new Demo[]{object, object2};
         
        serializa.serializa(arrayDemos, nombreFichero);
        
        Demo [] arrayDeserializado = (Demo []) serializa.deserializa(nombreFichero);
        
        for (Demo demo : arrayDeserializado){
            System.out.println("Objecto demo ha sido deserializado: ");
            System.out.println("a = " + demo.a);
            System.out.println("b = " + demo.b);
            
        }
        
    }
}