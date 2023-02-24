package paquete;


/**
 * <h2> Clase Principal, se utiliza para crear y leer empleados de una
 * BBDD.</h2>
 *
 * Busca información de JavaDoc en <a href="http://google.com">Google</a>
 *
 * @see <a href="http://google.com">Google</a>
 * @version 1-2021
 * @author Juan
 *
 *
 */
public class Principal {

    /**
     * Atributo Nombre del empleado
     */
    private String nombre;
    /**
     * Atributo apellido del empleado
     */
    private String apellido;
    /**
     * Atributo salario del empleado
     */
    private double salario;

    /**
     * Constructor con tres parámetros. Crea objetos Principal, con nombre,
     * apellido y salario.
     *
     * @param nombre <i>Nombre del empleado</i>
     * @param apellido <i>Apellido del empleado</i>
     * @param salario <i>Salario del empleado</i>
     */
    public Principal(String nombre, String apellido, double salario) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    /**
     * Sube el salario al empleado
     *
     * @see Principal
     * @param subida <i>Subida a aplicar al salario</i>
     */
    public void subidasalario(double subida) {
        salario = salario + subida;
    }

    /**
     * Comprueba que el nombre no esté vacío.
     *
     * @return <ul>
     * <li>true: el nombre no es una cadena vacía.</li>
     * <li>false: el nombre es una cadena vacía.</li>
     * </ul>
     */
    private boolean comprobar() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }
}
