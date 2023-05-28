package ejercicio3;

import java.util.*;

/**
 * Datos de una estacion meteorologica
 */
public class EstacionMeteo  implements Comparable<EstacionMeteo>{

    private String indicativo;
    private String nombre;
    private String provincia;
    private double altitud;
    private String latitud;
    private String longitud;
    private String indsinop;

    /**
     * Constructor de la estacion, al que se le pasan el indicativo de la
     * estacion, su nombre, su provincia, su altitud en m, sus coordenadas
     * (latitud y longitud en el formato GGMMSSX, siendo X la referencia N, S,
     * E, W) y el indicativo sinoptico de la estacion
     */
    public EstacionMeteo(String indicativo,
            String nombre,
            String provincia,
            String altitud,
            String latitud,
            String longitud,
            String indsinop) {
        this.indicativo = indicativo;
        this.nombre = nombre;
        this.provincia = provincia;
        this.altitud = Double.parseDouble(altitud);
        this.latitud = latitud;
        this.longitud = longitud;
        this.indsinop = indsinop;
    }
    
    public int compareTo(EstacionMeteo otraEstacion){
        return this.nombre.compareTo(otraEstacion.getNombre());
    }

    /**
     * Retorna un texto descriptivo de la estacion con su indicativo y nombre
     */
    public String toString() {
        return (indicativo + "-" + nombre);
    }

    /**
     * Retorna la altitud en metros
     */
    public double getAltitud() {
        return altitud;
    }

    // Convierte string en formato GGMMSS a grados
    private double aGrados(String s) {
        String grados = s.substring(0, 2);
        String minutos = s.substring(2, 4);
        String segundos = s.substring(4, 6);
        return Integer.parseInt(grados) + Integer.parseInt(minutos) / 60.0
                + Integer.parseInt(segundos) / 3600.0;
    }

    /**
     * Retorna la latitud en grados (norte=positivo, sur=negativo)
     * @return 
     */
    public double getLatitud() {
        double lat = aGrados(latitud);
        if (latitud.charAt(6) == 'N') {
            return lat; // norte
        } else {
            return -lat; // sur 
        }
    }

    /**
     * Retorna la longitud en grados (este=positivo, oeste=negativo)
     * @return 
     */
    public double getLongitud() {
        double lon = aGrados(longitud);
        if (longitud.charAt(6) == 'E') {
            return lon; // este
        } else {
            return -lon; // oeste 
        }
    }

    /**
     * Retorna el indicativo de la estacion
     * @return 
     */
    public String getIndicativo() {
        return indicativo;
    }

    /**
     * Retorna la provincia de la estacion
     * @return 
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Retorna el nombre de la estacion
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

}
