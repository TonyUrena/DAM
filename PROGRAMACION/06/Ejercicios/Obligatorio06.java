
/**
 * Obligatorio06
 */
import java.util.Scanner;

public class Obligatorio06 {

    public static void main(String[] args) {

        final int ALUMNOS = 3;
        Scanner reader = new Scanner(System.in);

        int totalPreguntas;

        String[] nombresAlumnos = new String[ALUMNOS];
        String[] respuestasCorrectas;
        String[][] respuestasAlumnos;


        System.out.println("¿Cuántas preguntas tiene el examen?");
        totalPreguntas = declaraCantidadRespuestas(reader);

        System.out.println("Introduce la respuesta correcta para cada pregunta");
        respuestasCorrectas = new String[totalPreguntas];
        declaraRespuestasCorrectas(totalPreguntas, respuestasCorrectas, reader);

        System.out.println("Introduce los nombres de los alumnos");
        declaraNombresAlumnos(nombresAlumnos, reader);

        System.out.println("Introduce las respuestas de cada alumno");
        respuestasAlumnos = new String[ALUMNOS][totalPreguntas];
        declaraRespuestasAlumnos(nombresAlumnos, respuestasAlumnos, reader);

        for (int i = 0; i < respuestasAlumnos.length; i++) {
            System.out.print(respuestasAlumnos[i][0] + " ");
            for (int j = 0; j < respuestasAlumnos[0].length; j++) {
                System.out.print(respuestasAlumnos[1][j] + " ");
            }
            System.out.println();
        }
        
        dibujaMenu();

        calculaNota(respuestasAlumnos, respuestasCorrectas);

        

    }

    public static int declaraCantidadRespuestas(Scanner reader){

        int cantidad = reader.nextInt();
        
        //Corrige el bug con Scanner
        reader.nextLine();

        return cantidad;

    }

    public static void declaraRespuestasCorrectas(int totalPreguntas, String[] respuestasCorrectas, Scanner reader) {

        // TODO comprobar que las letras sean mayúsculas entre A y E
        for (int i = 0; i < totalPreguntas; i++) {
            respuestasCorrectas[i] = leeRespuesta(reader);
        }

    }

    public static void declaraNombresAlumnos(String[] nombresAlumnos, Scanner reader) {

        for (int i = 0; i < nombresAlumnos.length; i++) {
            nombresAlumnos[i] = leeRespuesta(reader);
        }

    }

    public static void declaraRespuestasAlumnos(String[] nombresAlumnos, String[][] respuestasAlumnos, Scanner reader) {

        // TODO comprobar que las letras sean mayúsculas entre A y E
        for (int i = 0; i < respuestasAlumnos.length; i++) {
            respuestasAlumnos[i][0] = nombresAlumnos[i];
            System.out.println("Introduce las respuestas de: " + respuestasAlumnos[i][0]);
            for (int j = 0; j < respuestasAlumnos[0].length; j++) {
                respuestasAlumnos[1][j] = leeRespuesta(reader);
            }
        }

    }

    public static void calculaNota(String[][] respuestasAlumnos, String[] respuestasCorrectas) {

        /*
         * Muestra la nota obtenida de cada estudiante. Esta nota
         * corresponde al número de aciertos que tuvo el estudiante.
         */
        
        int contadorCorrectas;

         for (int i = 0; i < respuestasAlumnos.length; i++) {
            contadorCorrectas = 0;
            System.out.print(respuestasAlumnos[i][0] + ": \t");
            for (int j = 0; j < respuestasAlumnos[0].length; j++) {
                if (respuestasAlumnos[1][j].equals(respuestasCorrectas[j])) {
                    contadorCorrectas++;
                }
            }
            System.out.println(contadorCorrectas);
            System.out.println("----------------------------");
         }

    }

    public static void calculaMediaNotas() {

        /*
         * Muestra la media de aciertos de los 8 alumnos.
         */

    }

    public static void muestraNotaAlumno(){

        /*
         * Dado un nombre de un alumno, muestra su nota.
         */
        
    }

    public static void calculaPreguntaMasAcertada() {

        /*
         * Muestra el número de la pregunta más acertada.
         */

    }





    
    public static void dibujaMenu() {

        System.out.println("\n\n1) NOTAS\tMostrar la nota de cada estudiante.");
        System.out.println("2) MEDIA\tMuestra la media de aciertos.");
        System.out.println("3) NOTA ALUMNO\tMuestra la nota de un alumno.");
        System.out.println("4) PREGUNTA\tMuestra la pregunta más acertada.\n\n");

    }

    public static String leeRespuesta(Scanner reader) {

        String respuesta = reader.nextLine();

        return respuesta;
    }

    public static void compruebaLetras(){
        //TODO
    }
}