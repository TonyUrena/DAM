package semiobligatoriotransporte;

public class Interurbano extends Autobus {

    private float kilometros;

    public float calculaPrecioViaje(Autobus autobus) {
        float precioBillete;
        
        precioBillete = this.getPrecio() * kilometros;
        
        return precioBillete;
    }

}