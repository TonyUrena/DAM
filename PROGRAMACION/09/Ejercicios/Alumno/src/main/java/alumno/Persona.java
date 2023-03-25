package alumno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
    
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    protected long telefono;

    public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre + ", dni=" + dni + ", fecNac=" + fechaNacimiento+"\n";
    }
    
public boolean comprobarDNI () {
       
       int num=0;
       boolean numeroValido = true;
       
       char letraDNI = Character.toUpperCase(this.dni.charAt(this.dni.length()-1));    
       String numero = this.dni.substring(0,this.dni.length()-1);
       
       char letraCorrecta = letraCorrecta(num, numero, numeroValido);
       
       if (letraDNI == letraCorrecta) return true;
       else return false;
    }

    private char letraCorrecta(int num, String numero, boolean numeroValido) {
        char letraCorrecta = ' ';
        try {
            num = Integer.parseInt(numero);
        } catch (NumberFormatException numberFormatException) { numeroValido = false;}
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (numeroValido)
            letraCorrecta= letras.charAt(num%23);
        return letraCorrecta;
    }
    
public void asignarLetraDNI () {
       int num=0;
       boolean numeroValido = true;
       String numero= this.dni;
       
       char letraCorrecta = letraCorrecta(num, numero, numeroValido);
       if (letraCorrecta != ' ') this.dni+=letraCorrecta;
    }

    boolean esMayorDeEdad() {
        if (ChronoUnit.YEARS.between(this.getFechaNacimiento(), LocalDate.now()) >= NAME) {
            return true;
        }
        return false;
    }
    public static final int NAME = 18;
    
}
