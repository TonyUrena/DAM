package ej02astros;

import java.util.ArrayList;

public class Planeta extends Astro {

    private double distanciaSol, orbitaSol;
    private boolean tieneSatelites;
    private ArrayList satelitesPlaneta = new ArrayList();

    public Planeta(String nombreAstro, double distanciaSol, double orbitaSol, double radioEcuatorial, 
            double diametroMedio, double periodoRotacionEje, double periodoTraslacion, 
            double distanciaMediaOrbita, double masa, double temperaturaMedia, 
            double gravedad, boolean tieneSatelites) {

        super(nombreAstro, radioEcuatorial, diametroMedio, periodoRotacionEje, periodoTraslacion,
                distanciaMediaOrbita, masa, temperaturaMedia, gravedad);

        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;

    }

    public void muestra() {
        System.out.println("\n--------------------------");
        System.out.println(this.nombreAstro + "\t(Planeta)");
        System.out.println("--------------------------");
        System.out.println("Masa: " + this.masa);
        System.out.println("Temperatura Media: " + this.temperaturaMedia);
        System.out.println("Gravedad: " + this.gravedad);
        System.out.println("Radio Ecuatorial: " + this.radioEcuatorial);
        System.out.println("Diámetro Medio: " + this.diametroMedio);
        System.out.println("--------------------------");
        System.out.println("Distancia al sol: " + this.distanciaSol);
        System.out.println("Órbita al sol: " + this.orbitaSol);
        System.out.println("Periodo de rotación sobre su eje: " + periodoRotacionEje);
        System.out.println("Período de traslacion alrededor del cuerpo que orbita: " + periodoTraslacion);
        System.out.println("Distancia media al cuerpo: " + distanciaMediaOrbita);
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public ArrayList getSatelitesPlaneta() {
        return satelitesPlaneta;
    }

    public void setSatelitesPlaneta(ArrayList satelitesPlaneta) {
        this.satelitesPlaneta = satelitesPlaneta;
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
