package mtb;


public class NewClass {

    public int velocidad;

    public NewClass() {
    }

    public void frenar(int decremento) {
        //aplicar freno
        velocidad -= decremento;
    }

    public void acelerar(int incremento) {
        //acelerar
        velocidad += incremento;
    }

    public int getVelocidad() {
        return velocidad;
    }



}
