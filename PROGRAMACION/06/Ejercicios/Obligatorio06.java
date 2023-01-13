
/**
 * Obligatorio06
 */
import java.util.Scanner;

public class Obligatorio06 {

    public static void main(String[] args) {

        final int ALUMNOS = 8;
        Scanner reader = new Scanner(System.in);

        int totalPreguntas;

        String[] nombresAlumnos = new String[ALUMNOS];
        String[] respuestasCorrectas;
        String[][] respuestasAlumnos;


        System.out.println("¿Cuántas preguntas tiene el examen?");
        totalPreguntas = reader.nextInt();
        respuestasCorrectas = new String[totalPreguntas];

        System.out.println("Introduce la respuesta correcta para cada pregunta");
        declaraRespuestasCorrectas(totalPreguntas, respuestasCorrectas);

        System.out.println("Introduce los nombres de los alumnos");
        declaraNombresAlumnos(nombresAlumnos);

        System.out.println("Introduce las respuestas de cada alumno");
        respuestasAlumnos = new String[ALUMNOS][totalPreguntas];

        dibujaMenu();

    }

    public static void dibujaMenu() {

        System.out.println("\n\n1) NOTAS\tMostrar la nota de cada estudiante.");
        System.out.println("2) MEDIA\tMuestra la media de aciertos.");
        System.out.println("3) NOTA ALUMNO\tMuestra la nota de un alumno.");
        System.out.println("4) PREGUNTA\tMuestra la pregunta más acertada.\n\n");

    }

    public static void declaraRespuestasCorrectas(int totalPreguntas, String[] respuestasCorrectas) {

        String notaTemp;

        // TODO comprobar que las letras sean mayúsculas
        for (int i = 0; i < totalPreguntas; i++) {
            notaTemp = reader.nextLine();
            respuestasCorrectas[i] = notaTemp;
        }

    }

    public static void declaraNombresAlumnos(String[] nombresAlumnos) {

        for (int i = 0; i < nombresAlumnos.length; i++) {
            nombresAlumnos[i] = reader.nextLine();
        }

    }

    public static void declaraRespuestasAlumnos(String[][] respuestasAlumnos) {
        String notaTemp;

        for (int i = 0; i < ALUMNOS; i++) {
            notaTemp = reader.nextLine();
            respuestasAlumnos[i] = notaTemp;
            for (int j = 0; j <= totalPreguntas; j++) {
                notaTemp = reader.nextLine();
                respuestasAlumnos[i][j] = notaTemp;
            }
        }

    }

    public static void calculaNota() {

    }

    public static void calculaMediaNotas() {

    }

    public static void calculaPreguntaMasAcertada() {

    }

    public static void leerDatos(Scanner reader) {

        reader

    }
}