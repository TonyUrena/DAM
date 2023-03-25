package semiobligatoriotransporte;

public class Urbano extends Autobus {

    private String ruta;
    
    public float calculaPrecioViaje(Autobus autobus) {
        float precioBillete;
        
        if(this.ruta.equals("A")){
            precioBillete = this.getPrecio() * 1.10f;
        } else {
            precioBillete = this.getPrecio() * 1.20f;
        }
        
        return precioBillete;
    }
}
