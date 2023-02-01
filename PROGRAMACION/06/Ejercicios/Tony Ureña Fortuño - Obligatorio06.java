
/*
 *  TONY UREÑA FORTUÑO
 * 
 *  Obligatorio06
 * 
 *****************************************************/

import java.util.Arrays;
import java.util.Scanner;
import java.math;

public class Obligatorio06 {

    public static void main(String[] args) {

        final int ALUMNOS = 3;
        Scanner reader = new Scanner(System.in);

        int totalPreguntas;

        String[] nombresAlumnos = new String[ALUMNOS];
        String[] respuestasCorrectas;
        String[][] respuestasAlumnos;

        mensajeAlerta("-----", "          ¿Cuántas preguntas tiene el examen?");
        totalPreguntas = declaraCantidadRespuestas(reader);
        System.out.println();

        mensajeAlerta("-----", "  Introduce la respuesta correcta para cada pregunta");
        respuestasCorrectas = new String[totalPreguntas];
        declaraRespuestasCorrectas(totalPreguntas, respuestasCorrectas, reader);
        System.out.println();

        mensajeAlerta("-----", "         Introduce los nombres de los alumnos");
        declaraNombresAlumnos(nombresAlumnos, reader);
        System.out.println();

        mensajeAlerta("-----", "      Introduce las respuestas de cada alumno");
        respuestasAlumnos = new String[ALUMNOS][totalPreguntas];
        declaraRespuestasAlumnos(nombresAlumnos, respuestasAlumnos, reader);

        dibujaMenu(respuestasAlumnos, nombresAlumnos, respuestasCorrectas);

    }

    public static int declaraCantidadRespuestas(Scanner reader) {

        int cantidad;

        do {
            cantidad = reader.nextInt();
            // Corrige el bug con Scanner
            reader.nextLine();

            if (cantidad <= 0) {
                mensajeAlerta("ERROR", "            Introduce un número mayor a 0.");
            }

        } while (cantidad <= 0);

        return cantidad;

    }

    public static void declaraRespuestasCorrectas(int totalPreguntas, String[] respuestasCorrectas, Scanner reader) {

        for (int i = 0; i < totalPreguntas; i++) {
            do {

                System.out.println("Introduce la respuesta a la pregunta Nº " + (i + 1) + " (A, B, C, D o E): ");
                respuestasCorrectas[i] = leeRespuesta(reader);

                if (!compruebaLetras(respuestasCorrectas[i])) {
                    mensajeAlerta("ERROR", "Respuesta no correcta, introduce A, B, C, D o E (Sólo en mayúsculas).");
                }

            } while (!compruebaLetras(respuestasCorrectas[i]));
        }

    }

    public static void declaraNombresAlumnos(String[] nombresAlumnos, Scanner reader) {

        for (int i = 0; i < nombresAlumnos.length; i++) {

            do {
                nombresAlumnos[i] = leeRespuesta(reader);
                if (nombresAlumnos[i].equals("")) {
                    mensajeAlerta("ERROR", "           Por favor, introduce un nombre.");
                }
            } while (nombresAlumnos[i].equals(""));

        }
    }

    public static void declaraRespuestasAlumnos(String[] nombresAlumnos, String[][] respuestasAlumnos, Scanner reader) {

        for (int i = 0; i < respuestasAlumnos.length; i++) {

            for (int j = 0; j < respuestasAlumnos[0].length; j++) {

                do {

                    System.out.println("Introduce la respuesta de " + nombresAlumnos[i] + " a la pregunta Nº " + (j + 1)
                            + " (A, B, C, D o E): ");
                    respuestasAlumnos[i][j] = leeRespuesta(reader);

                    if (!compruebaLetras(respuestasAlumnos[i][j])) {
                        mensajeAlerta("ERROR", "Respuesta no correcta, introduce A, B, C, D o E (Sólo en mayúsculas).");
                    }

                } while (!compruebaLetras(respuestasAlumnos[i][j]));

            }

        }

    }

    public static int calculaNota(String[][] respuestasAlumnos, String[] nombresAlumnos, String[] respuestasCorrectas,
            int alumno) {

        /*
         * Muestra la nota obtenida de cada estudiante. Esta nota
         * corresponde al número de aciertos que tuvo el estudiante.
         */

        int notaAlumno = 0;

        for (int i = 0; i < respuestasAlumnos[alumno].length; i++) {
            if (respuestasAlumnos[alumno][i].equals(respuestasCorrectas[i])) {
                notaAlumno++;
            }
        }

        return notaAlumno;
    }

    public static float calculaMediaNotas(int cantidadAlumnos, String[][] respuestasAlumnos, String[] nombresAlumnos,
            String[] respuestasCorrectas) {

        /*
         * Muestra la media de aciertos de los 8 alumnos.
         */

        float sumaNotas = 0;

        for (int i = 0; i < nombresAlumnos.length; i++) {
            sumaNotas += calculaNota(respuestasAlumnos, nombresAlumnos, respuestasCorrectas, i);
        }

        sumaNotas = sumaNotas / cantidadAlumnos;

        return sumaNotas;

    }

    public static int muestraNotaAlumno(String[][] respuestasAlumnos, String[] nombresAlumnos,
            String[] respuestasCorrectas, String nombreAlumno) {

        /*
         * Dado un nombre de un alumno, muestra su nota.
         */
        int notaAlumno, encuentra;

        // TODO Comprobar que se ha encontrado el alumno (return -1)
        encuentra = buscaAlumno(nombreAlumno, nombresAlumnos);

        notaAlumno = calculaNota(respuestasAlumnos, nombresAlumnos, respuestasCorrectas, encuentra);

        return notaAlumno;

    }

    public static int buscaAlumno(String nombreAlumno, String[] nombresAlumnos) {

        int encuentra = -1, i = 0;

        while (i < nombresAlumnos.length && encuentra == -1) {
            if (nombresAlumnos[i].equals(nombreAlumno)) {
                encuentra = i;
            }
            i++;
        }

        return encuentra;

    }

    public static String calculaPreguntaMasAcertada(String[][] respuestasAlumnos, String[] respuestasCorrectas) {

        /*
         * Muestra el número de la pregunta más acertada.
         */

        int[] respuestas = new int[5];
        int masGrande = Integer.MIN_VALUE, indice = 0;
        String maxRespuesta = "ERROR";

        for (int i = 0; i < respuestasAlumnos.length; i++) {
            for (int j = 0; j < respuestasAlumnos[0].length; j++) {
                if (respuestasAlumnos[i][j].equals(respuestasCorrectas[j])) {
                    switch (respuestasCorrectas[j]) {
                        case "A":
                            respuestas[0]++;
                            break;

                        case "B":
                            respuestas[1]++;
                            break;

                        case "C":
                            respuestas[2]++;
                            break;

                        case "D":
                            respuestas[3]++;
                            break;

                        case "E":
                            respuestas[4]++;
                            break;

                        default:
                            break;
                    }
                }
            }
        }

        for (int i = 0; i < respuestas.length; i++) {

            int actual = respuestas[i];
            if (actual > masGrande) {
                masGrande = actual;
                indice = i;
            }
        }

        switch (indice) {
            case 0:
                maxRespuesta = "A";
                break;

            case 1:
                maxRespuesta = "B";
                break;

            case 2:
                maxRespuesta = "C";
                break;

            case 3:
                maxRespuesta = "D";
                break;

            case 4:
                maxRespuesta = "E";
                break;

            default:
                break;
        }

        return maxRespuesta;
    }

    public static void dibujaMenu(String[][] respuestasAlumnos, String[] nombresAlumnos, String[] respuestasCorrectas) {
        int opcion = 0;
        Scanner reader = new Scanner(System.in);
        do {

            do {

                System.out.println("+-------------------ELIGE UNA OPCIÓN:-------------------+");
                System.out.println("|                                                       |");
                System.out.println("|  1) NOTAS        Mostrar la nota de cada estudiante.  |");
                System.out.println("|  2) MEDIA        Muestra la media de aciertos.        |");
                System.out.println("|  3) NOTA ALUMNO  Muestra la nota de un alumno.        |");
                System.out.println("|  4) PREGUNTA     Muestra la pregunta más acertada.    |");
                System.out.println("|                                                       |");
                System.out.println("+-------------------------------------------------------+");

                opcion = reader.nextInt();
                // Debug reader
                reader.nextLine();

                switch (opcion) {
                    case 1:
                        mensajeAlerta("NOTAS", "              NOTA DE CADA ESTUDIANTE");
                        for (int i = 0; i < nombresAlumnos.length; i++) {
                            int notaAlumno;
                            notaAlumno = calculaNota(respuestasAlumnos, nombresAlumnos, respuestasCorrectas, i);
                            System.out.println(nombresAlumnos[i] + ": " + notaAlumno);
                        }
                        pulsaParaVolver(reader);
                        break;

                    case 2:

                        mensajeAlerta("-----", "              NOTA MEDIA DE LOS ESTUDIANTES");
                        float mediaNotas;
                        mediaNotas = calculaMediaNotas(opcion, respuestasAlumnos, nombresAlumnos, respuestasCorrectas);

                        System.out.println("La media de todas las notas es de: " + mediaNotas);
                        pulsaParaVolver(reader);
                        break;

                    case 3:
                        //
                        String nombreAlumno;
                        int alumnoNumero, notaAlumno = 0;

                        do {
                            System.out.println("Introduce el nombre del alumno:");
                            nombreAlumno = reader.nextLine();
                            alumnoNumero = buscaAlumno(nombreAlumno, nombresAlumnos);
                            if (alumnoNumero == -1) {
                                mensajeAlerta("ERROR", "  Ese alumno no figura en la lista, vuelve a intentarlo.");
                            } else {
                                notaAlumno = calculaNota(respuestasAlumnos, nombresAlumnos, respuestasCorrectas,
                                        alumnoNumero);
                                mensajeAlerta("ALUMNO", "      NOTA DEL ALUMNO " + nombreAlumno);
                                System.out.println("La nota de " + nombreAlumno + " es de: " + notaAlumno);
                            }
                        } while (alumnoNumero == -1);
                        pulsaParaVolver(reader);
                        break;

                    case 4:
                        String masAcertada;

                        mensajeAlerta("PREGUNTA", "                Pregunta más acertada.");
                        masAcertada = calculaPreguntaMasAcertada(respuestasAlumnos, respuestasCorrectas);
                        System.out.println("La pregunta más acertada por los alumnos es la: " + masAcertada);
                        
                        pulsaParaVolver(reader);
                        break;

                    default:
                        mensajeAlerta("ERROR", "       Por favor elige una opción de la lista.");
                        pulsaParaVolver(reader);
                        break;
                }

            } while (opcion < 0 || opcion > 5);

        } while (true); // Repetimos para debug

    }

    public static String leeRespuesta(Scanner reader) {

        String respuesta = reader.nextLine();

        return respuesta;
    }

    public static boolean compruebaLetras(String respuesta) {

        boolean letras;

        letras = (respuesta.equals("A") ||
                respuesta.equals("B") ||
                respuesta.equals("C") ||
                respuesta.equals("D") ||
                respuesta.equals("E"));

        return letras;
    }

    public static void mensajeAlerta(String tipo, String mensaje) {
        System.out.println();
        System.out.println("+----------------------" + tipo + "----------------------------+");
        System.out.println(mensaje);
        System.out.println("+-------------------------------------------------------+");
        System.out.println();
    }

    public static void pulsaParaVolver(Scanner scanner) {

        String enter = null;

        System.out.println();
        System.out.print("...Pulsa ENTER para volver al menú");

        scanner.nextLine();
    }
}