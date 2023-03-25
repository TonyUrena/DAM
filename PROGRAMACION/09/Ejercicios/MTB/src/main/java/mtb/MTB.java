
package mtb;

public class MTB extends Bicicleta implements NewInterface
{

    // la subclase MTB agrega un campo
    public int altoAsiento;
    public int marcha;

    // la subclase MTB tiene un constructor
    public MTB(int cadenciaIni, int velocidadIni, int marchaIni,int altoIni)
    {
        super(cadenciaIni, velocidadIni);
        marcha = marchaIni;
        altoAsiento = altoIni;
    }

    // la subclase MTB agrega un método
    @Override
    public void setAltoAsiento(int nuevoValor)
    {
        altoAsiento = nuevoValor;
    }

    @Override
    public int getAltoAsiento()
    {
        return altoAsiento;
    }

    public static void main (String [] args )
    {
        MTB mtb;

        mtb=new MTB(10, 30, 8, 40);

        System.out.println("Cadencia: "+mtb.getCadencia());
        System.out.println("Marcha: "+mtb.getMarcha());
        System.out.println("Velocidad: "+mtb.getVelocidad());
        System.out.println("Alto asiento: "+mtb.getAltoAsiento());

    }

    public void setMarcha(int nuevaMarcha) {
        //establecer marcha
        marcha = nuevaMarcha;
    }

    public int getMarcha() {
        return marcha;
    }
} 
