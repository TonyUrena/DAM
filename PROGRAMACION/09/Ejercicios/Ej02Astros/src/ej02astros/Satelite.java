package ej02astros;

public class Satelite extends Astro {
    
    private double distanciaPlaneta, orbitaPlanetaria;
    private Planeta planetaPertenece;
    
    public Satelite(String nombreAstro, double distanciaPlaneta, double orbitaPlanetaria, Planeta planetaPertenece, 
            double radioEcuatorial, double diametroMedio, double periodoRotacionEje, 
            double periodoTraslacion, double distanciaMediaOrbita, double masa, 
            double temperaturaMedia, double gravedad) {
        
        super(nombreAstro, radioEcuatorial, diametroMedio, periodoRotacionEje, periodoTraslacion, 
                distanciaMediaOrbita, masa, temperaturaMedia, gravedad);
        
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertenece = planetaPertenece;
    }
    
    public void muestra() {
        System.out.println("\n--------------------------");
        System.out.println(this.nombreAstro + ("\t(Satélite)"));
        System.out.println("--------------------------");
        System.out.println("Pertenece a: " + this.planetaPertenece.nombreAstro);
        System.out.println("Masa: " + this.masa);
        System.out.println("Temperatura Media: " + this.temperaturaMedia);
        System.out.println("Gravedad: " + this.gravedad);
        System.out.println("Radio Ecuatorial: " + this.radioEcuatorial);
        System.out.println("Diámetro Medio: " + this.diametroMedio);
        System.out.println("--------------------------");
        System.out.println("Distancia al planeta: " + this.distanciaPlaneta);
        System.out.println("Órbita planetaria: " + this.orbitaPlanetaria);
        System.out.println("Periodo de rotación sobre su eje: " + periodoRotacionEje);
        System.out.println("Período de traslacion alrededor del cuerpo que orbita: " + periodoTraslacion);
        System.out.println("Distancia media al cuerpo: " + distanciaMediaOrbita);
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planeta getPlanetaPertenece() {
        return planetaPertenece;
    }

    public void setPlanetaPertenece(Planeta planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }

    public String getNombreAstro() {
        return nombreAstro;
    }

    public void setNombreAstro(String nombreAstro) {
        this.nombreAstro = nombreAstro;
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public double getPeriodoRotacionEje() {
        return periodoRotacionEje;
    }

    public void setPeriodoRotacionEje(double periodoRotacionEje) {
        this.periodoRotacionEje = periodoRotacionEje;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMediaOrbita() {
        return distanciaMediaOrbita;
    }

    public void setDistanciaMediaOrbita(double distanciaMediaOrbita) {
        this.distanciaMediaOrbita = distanciaMediaOrbita;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
    
    
}
