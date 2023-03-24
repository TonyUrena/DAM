
package mtb;

public class Bicicleta extends NewClass
{
    // la clase Bicicleta tiene tres campos
    public int cadencia;

    // la clase Bicicleta tiene un constructor
    public Bicicleta(int cadenciaIni, int velocidadIni)
    {
        cadencia = cadenciaIni;
        velocidad = velocidadIni;
    }

    // la clase Bicicleta tiene cuatro métodos
    public void setCadencia(int nuevoValor) { //establecer cadencia
        cadencia = nuevoValor;
    }



    public int getCadencia()
    {
        return cadencia;
    }


}