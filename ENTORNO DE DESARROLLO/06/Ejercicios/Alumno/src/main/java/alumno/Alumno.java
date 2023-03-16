package alumno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona {

    private String curso;
    private long telefono;

    public Alumno(String nombre, String dni, LocalDate fechaNacimiento) {
        super(nombre, dni, fechaNacimiento);
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    boolean esMayorDeEdad () {
        if (ChronoUnit.YEARS.between(this.getFechaNacimiento(), LocalDate.now()) >= 18)
            return true;
        return false;
    }    
}
