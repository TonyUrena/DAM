import java.util.Arrays;
import java.lang.Math.random;
import java.util.Scanner;

public class HundirLaFlota {

    public static void main(String[] args) {

        final int LANCHA = 1,
                BUQUE = 3,
                ACORAZADO = 4,
                PORTAAVIONES = 5,

                numeroColumnas = 10,
                numeroFilas = 10;

        Scanner reader = new Scanner(System.in);

        int posicionX, posicionY;

        int dificultad = 1;

        // Pide dificultad
        setDificultad(dificultad, reader);

        // TODO aceptar numeros personalizados
        int[][] tableroJugador = new int[numeroColumnas][numeroFilas];
        int[][] tableroOrdenador = new int[numeroColumnas][numeroFilas];

        // Ordenador coloca barcos
        tableroOrdenador = colocaTableroOrdenador(numeroColumnas, numeroFilas, LANCHA, BUQUE, ACORAZADO, PORTAAVIONES);

        // GAMELOOP

        // TODO comprobar cantidad de tocados restantes
        do {
            
            // preguntar disparo y tocado o agua
            mensajeAlerta("Posición X", "Introduce la posición X");
            // TODO pedir letra y convertir a int
            posicionX = reader.nextInt();
            mensajeAlerta("Posición Y", "Introduce la posición Y");
            posicionY = reader.nextInt();

            lanzarDisparo(tableroJugador, tableroOrdenador, posicionX, posicionY);

            // Muestra tablero del jugador
            System.out.println("\nTablero ordenador:\n");
            dibujaTablero(tableroOrdenador);

            System.out.println("\nTablero Jugador:\n");
            dibujaTablero(tableroJugador);

        } while (true);

    }

    public static void setDificultad(int dificultad, Scanner reader) {

        // TODO Implementar dificultad
        int cantidadLancha, cantidadBuque, cantidadAcorazado, cantidadPortaaviones;

        // TODO menu dificultad
        // mensajeAlerta("DIFICULTAD", "Selecciona el nivel de dificultad.");

        switch (dificultad) {

            case 1:
                cantidadLancha = 5;
                cantidadBuque = 3;
                cantidadAcorazado = 1;
                cantidadPortaaviones = 1;
                break;

            case 2:
                cantidadLancha = 2;
                cantidadBuque = 1;
                cantidadAcorazado = 1;
                cantidadPortaaviones = 1;
                break;

            case 3:
                cantidadLancha = 1;
                cantidadBuque = 1;
                break;

            case 4:
                // TODO personalizada
                break;

            default:
                mensajeAlerta("ERROR", "Introduce un nivel de dificultad entre 1 y 4");
                break;
        }

    }

    public static void dibujaTablero(int[][] tableroDibujado) {

        char letra = 'A';
        System.out.println("    0 1 2 3 4 5 6 7 8 9");
        System.out.println("  ┌─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┐");

        for (int i = 0; i < tableroDibujado.length; i++) {
            System.out.print(letra + " ┤ ");
            for (int j = 0; j < tableroDibujado[0].length; j++) {
                switch (tableroDibujado[i][j]) {
                    case 0: // CASILLA
                        System.out.print("≈");
                        break;

                    case 1: // LANCHA
                        System.out.print("L");
                        break;

                    case 2: // TOCADO
                        System.out.print("X");
                        break;

                    case 3: // BUQUE
                        System.out.print("B");
                        break;

                    case 4: // ACORAZADO
                        System.out.print("Z");
                        break;

                    case 5: // PORTAAVIONES
                        System.out.print("P");
                        break;

                    case 6: // AGUA
                        System.out.print("-");
                        break;

                    default:
                        break;
                }
                System.out.print(" ");
            }
            System.out.println("│");
            letra++;
        }
        System.out.println("  ╘═════════════════════╛");

    }

    public static void colocaBarco(int[][] tablero, int tipoBarco, int numeroColumnas, int numeroFilas) {

        int posicionInicialColumna;
        int posicionInicialFila;

        boolean posicionValida;
        int compruebaPosicion;

        do {

            posicionInicialColumna = (int) (0 + Math.random() * (9 - 0 + 1));
            posicionInicialFila = (int) (0 + Math.random() * (9 - 0 + 1));

            if (tipoBarco == 5) {
                if ((posicionInicialFila + tipoBarco) > 9) {
                    posicionInicialFila = posicionInicialFila - ((posicionInicialFila + tipoBarco) - tablero.length);
                }
            } else {
                if ((posicionInicialColumna + tipoBarco) > 9) {
                    posicionInicialColumna = posicionInicialColumna
                            - ((posicionInicialColumna + tipoBarco) - tablero[0].length);
                }
            }

            if (tablero[posicionInicialFila][posicionInicialColumna] == 0) {
                posicionValida = true;
            } else {
                posicionValida = false;
            }

            compruebaPosicion = 0;

            while (posicionValida == true && compruebaPosicion < tipoBarco) {

                if (tipoBarco == 5) {
                    if (tablero[posicionInicialFila + compruebaPosicion][posicionInicialColumna] != 0) {
                        posicionValida = false;
                    }
                } else {
                    if (tablero[posicionInicialFila][posicionInicialColumna + compruebaPosicion] != 0) {
                        posicionValida = false;
                    }
                }

                if (compruebaPosicion == tipoBarco) {
                    compruebaPosicion = 0;
                }
                compruebaPosicion++;
            }

        } while (!posicionValida);

        for (int i = 0; i < tipoBarco; i++) {
            if (tipoBarco == 5) {
                tablero[posicionInicialFila + i][posicionInicialColumna] = tipoBarco;
            } else {
                tablero[posicionInicialFila][posicionInicialColumna + i] = tipoBarco;
            }
        }

    }

    public static int[][] colocaTableroOrdenador(int numeroColumnas, int numeroFilas, int LANCHA, int BUQUE,
            int ACORAZADO,
            int PORTAAVIONES/*
                             * , int cantidadLancha, int cantidadBuque, int cantidadAcorazado, int
                             * cantidadPortaaviones
                             */) {

        int[][] tablero = new int[numeroColumnas][numeroFilas];

        for (int i = 0; i < 1; i++) {
            colocaBarco(tablero, PORTAAVIONES, numeroColumnas, numeroFilas);
        }

        for (int i = 0; i < 1; i++) {
            colocaBarco(tablero, ACORAZADO, numeroColumnas, numeroFilas);
        }

        for (int i = 0; i < 3; i++) {
            colocaBarco(tablero, BUQUE, numeroColumnas, numeroFilas);
        }

        for (int i = 0; i < 5; i++) {
            colocaBarco(tablero, LANCHA, numeroColumnas, numeroFilas);
        }

        return tablero;

    }

    public static void lanzarDisparo(int[][] tableroJugador, int[][] tableroOrdenador, int posicionX, int posicionY) {

        int tipoCasilla;

        tipoCasilla = compruebaTocado(posicionX, posicionY, tableroOrdenador);

    }

    public static boolean compruebaTocado(int posicionX, int posicionY, int[][] tablero) {

        boolean tocado;

        switch (tablero[posicionX][posicionY]) {
            case 1:
            case 3:
            case 4:
            case 5:
                tocado = true;
                break;

            default:
                tocado = false;
                break;
        }

        return tocado;

    }

    public static void mensajeAlerta(String tipo, String mensaje) {
        System.out.println();
        System.out.println("+----------------------" + tipo + "----------------------------+");
        System.out.println(mensaje);
        System.out.println("+-------------------------------------------------------+");
        System.out.println();
    }
}
