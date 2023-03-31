package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author profesor
 */
public class Circulito {

    /**
     * @return the coordenadasX
     */
    public int getCoordenadasX() {
        return coordenadasX;
    }

    /**
     * @param coordenadasX the coordenadasX to set
     */
    public void setCoordenadasX(int coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    /**
     * @return the coordenadasY
     */
    public int getCoordenadasY() {
        return coordenadasY;
    }

    /**
     * @param coordenadasY the coordenadasY to set
     */
    public void setCoordenadasY(int coordenadasY) {
        this.coordenadasY = coordenadasY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    private int coordenadasX;
    private int coordenadasY;
    private double radio;
    
    private final double LIMITERADIO = 0.0;

    /**
     * Get the value of LIMITERADIO
     *
     * @return the value of LIMITERADIO
     */
    public double getLIMITERADIO() {
        return LIMITERADIO;
    }


    public Circulito() {
    }

    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadasX = valorX;
        coordenadasY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerRadio(double valorRadio) {

        setRadio(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadasX() + "," + getCoordenadasY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int moveX, int moveY){
        setCoordenadasX(getCoordenadasX() + moveX);
        setCoordenadasY(getCoordenadasY() + moveY);
    }
}
