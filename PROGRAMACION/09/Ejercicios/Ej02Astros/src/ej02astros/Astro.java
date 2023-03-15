package ej02astros;

public abstract class Astro {

    protected String nombreAstro;
    protected double radioEcuatorial, diametroMedio, periodoRotacionEje, periodoTraslacion,
            distanciaMediaOrbita, masa, temperaturaMedia, gravedad;

    public Astro(String nombreAstro, double radioEcuatorial, double diametroMedio, double periodoRotacionEje,
            double periodoTraslacion, double distanciaMediaOrbita, double masa,
            double temperaturaMedia, double gravedad) {
        
        this.nombreAstro = nombreAstro;
        this.radioEcuatorial = radioEcuatorial;
        this.diametroMedio = diametroMedio;
        this.periodoRotacionEje = periodoRotacionEje;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMediaOrbita = distanciaMediaOrbita;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public abstract void muestra();

    
}
