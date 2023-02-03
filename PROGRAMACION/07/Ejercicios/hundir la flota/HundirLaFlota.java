import java.util.Arrays;
import java.lang.Math.random;
import java.util.Scanner;

public class HundirLaFlota {

    public static void main(String[] args) {

        // Identificadores para cada barco:
        // El número corresponde al int que lo identificará dentro de la matriz del
        // tablero, además coincide con la cantidad de casillas que ocupa.
        final int LANCHA = 1,
                BUQUE = 3,
                ACORAZADO = 4,
                PORTAAVIONES = 5;

        int numeroColumnas = 10,
                numeroFilas = 10;

        // Almacenamos la cantidad de cada barco y el tamaño de la pantalla en un vector
        // para poder introducir y recuperar la información fácilmente
        int[] cantidadesDificultad = new int[5];
        int posicionX, posicionY,
                dificultad = 3,
                cantidadTocados = 0, cantidadCasillasBarcos = 0;

        Scanner reader = new Scanner(System.in);
        boolean victoria = false;

        // Pide dificultad
        // La dificultad determina la cantidad de barcos. El tamaño cambia si es partida
        // personalizada.
        cantidadesDificultad = setDificultad(dificultad, reader);
        numeroColumnas = cantidadesDificultad[4];
        numeroFilas = cantidadesDificultad[4];
        cantidadCasillasBarcos = calculaCantidadCasillasBarcos(cantidadesDificultad, LANCHA, BUQUE, ACORAZADO,
                PORTAAVIONES);

        // TODO aceptar numeros personalizados
        int[][] tableroJugador = new int[numeroColumnas][numeroFilas];
        int[][] tableroOrdenador = new int[numeroColumnas][numeroFilas];

        // Ordenador coloca barcos
        tableroOrdenador = colocaTableroOrdenador(numeroColumnas, numeroFilas, cantidadesDificultad, LANCHA, BUQUE,
                ACORAZADO, PORTAAVIONES);

        // GAMELOOP
        // Muestra tablero del jugador por primera vez
        dibujaTablero(tableroOrdenador);
        dibujaTablero(tableroJugador);

        do {
            // preguntar disparo y tocado o agua
            // TODO juntar el disparo en un solo scanner
            mensajeAlerta("CHOCO", "Introduce la posición X");
            posicionX = reader.nextInt();
            reader.nextLine(); // Bug Scanner

            // Pedimos String al reader, lo convertimos a mayúsculas para control de entrada
            // Averiguamos el char en la posición 0 para convertir a int.
            // Restamos el valor ASCII de A para convertirlo a una posición de la matriz.
            mensajeAlerta("Posición Y", "Introduce la posición Y");
            posicionY = reader.nextLine().toUpperCase().charAt(0) - 65;

            lanzarDisparo(tableroJugador, tableroOrdenador, posicionX, posicionY);
            cantidadTocados = compruebaCantidadTocados(tableroJugador);

            if (cantidadTocados == cantidadCasillasBarcos) {
                victoria = true;
            } else {
                victoria = false;
            }

            // Muestra tablero del jugador
            System.out.println("\nTablero ordenador:\n");
            dibujaTablero(tableroOrdenador);

            System.out.println("\nTablero Jugador:\n");
            dibujaTablero(tableroJugador);

        } while (!victoria);

        System.out.println("Victoria!");
    }

    public static int[] setDificultad(int dificultad, Scanner reader) {

        // cantidadesDificultad[0] : LANCHAS
        // cantidadesDificultad[1] : BUQUES
        // cantidadesDificultad[2] : ACORAZADOS
        // cantidadesDificultad[3] : PORTAAVIONES
        // cantidadesDificultad[4] : TAMAÑO DE PANTALLA

        int cantidadesDificultad[] = new int[5];

        // TODO menu dificultad
        // mensajeAlerta("DIFICULTAD", "Selecciona el nivel de dificultad.");

        switch (dificultad) {

            case 1:
                cantidadesDificultad[0] = 5;
                cantidadesDificultad[1] = 3;
                cantidadesDificultad[2] = 1;
                cantidadesDificultad[3] = 1;
                cantidadesDificultad[4] = 10;
                break;

            case 2:
                cantidadesDificultad[0] = 2;
                cantidadesDificultad[1] = 1;
                cantidadesDificultad[2] = 1;
                cantidadesDificultad[3] = 1;
                cantidadesDificultad[4] = 10;
                break;

            case 3:
                cantidadesDificultad[0] = 1;
                cantidadesDificultad[1] = 1;
                cantidadesDificultad[4] = 10;
                break;

            case 4:
                // TODO personalizada
                break;

            default:
                mensajeAlerta("ERROR", "Introduce un nivel de dificultad entre 1 y 4");
                break;
        }

        return cantidadesDificultad;
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
                        mensajeAlerta("Posición Y", "Introduce la posición Y");
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

    public static int[][] colocaTableroOrdenador(int numeroColumnas, int numeroFilas, int[] cantidadesDificultad,
            int LANCHA, int BUQUE,
            int ACORAZADO,
            int PORTAAVIONES) {

        int[][] tablero = new int[numeroColumnas][numeroFilas];

        // Colocamos de forma aleatoria los barcos empezando por los de mayor tamaño, ya
        // que es más fácil encajar los barco más pequeños entre los grandes que al
        // contrario.
        for (int i = 0; i < cantidadesDificultad[3]; i++) {
            colocaBarco(tablero, PORTAAVIONES, numeroColumnas, numeroFilas);
        }

        for (int i = 0; i < cantidadesDificultad[2]; i++) {
            colocaBarco(tablero, ACORAZADO, numeroColumnas, numeroFilas);
        }

        for (int i = 0; i < cantidadesDificultad[1]; i++) {
            colocaBarco(tablero, BUQUE, numeroColumnas, numeroFilas);
        }

        for (int i = 0; i < cantidadesDificultad[0]; i++) {
            colocaBarco(tablero, LANCHA, numeroColumnas, numeroFilas);
        }

        return tablero;
    }

    public static int[][] lanzarDisparo(int[][] tableroJugador, int[][] tableroOrdenador, int posicionX,
            int posicionY) {

        if (compruebaTocado(posicionX, posicionY, tableroOrdenador)) {
            tableroJugador[posicionY][posicionX] = 2;
        } else {
            tableroJugador[posicionY][posicionX] = 6;
        }

        return tableroJugador;
    }

    public static boolean compruebaTocado(int posicionX, int posicionY, int[][] tablero) {

        boolean tocado;

        switch (tablero[posicionY][posicionX]) {
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

    public static int calculaCantidadCasillasBarcos(int[] cantidadesDificultad, int LANCHA, int BUQUE, int ACORAZADO,
            int PORTAAVIONES) {

        int cantidad;

        cantidad = cantidadesDificultad[0] * LANCHA +
                cantidadesDificultad[1] * BUQUE +
                cantidadesDificultad[2] * ACORAZADO +
                cantidadesDificultad[3] * PORTAAVIONES;

        return cantidad;
    }

    public static int compruebaCantidadTocados(int[][] tablero) {

        int cantidadTocados = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 2) {
                    cantidadTocados++;
                }
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        return cantidadTocados;
    }

    public static void mensajeAlerta(String tituloModal, String mensajeModal) {

        // Longitud de la alerta
        final int LONGITUD = 40;
        int longitudBordeTituloModalA, longitudBordeTituloModalB,
                longitudEspaciadoMensajeA, longitudEspaciadoMensajeB;

        System.out.println();
        System.out.print("┌");

        longitudBordeTituloModalA = (LONGITUD / 2) - (tituloModal.length() / 2);
        longitudEspaciadoMensajeA = (LONGITUD / 2) - (mensajeModal.length() / 2);

        if (tituloModal.length() % 2 != 0) {
            longitudBordeTituloModalB = longitudBordeTituloModalA - 1;
        } else {
            longitudBordeTituloModalB = longitudBordeTituloModalA;
        }

        if (mensajeModal.length() % 2 != 0) {
            longitudEspaciadoMensajeB = longitudEspaciadoMensajeA - 1;
        } else {
            longitudEspaciadoMensajeB = longitudEspaciadoMensajeA;
        }

        // centra la cabecera de la alerta o dibuja 40 caracteres
        if (tituloModal.equals("null")) {
            for (int i = 0; i < 40; i++) {
                System.out.print("─");
            }
            System.out.println("┐");
        } else {

            for (int i = 0; i < longitudBordeTituloModalA - 1; i++) {
                System.out.print("─");
            }
            System.out.print(" ");
            System.out.print(tituloModal);
            System.out.print(" ");

            for (int i = 0; i < longitudBordeTituloModalB - 1; i++) {
                System.out.print("─");
            }
            System.out.println("┐");

        }

        System.out.print("│");

        for (int i = 0; i < longitudEspaciadoMensajeA; i++) {
            System.out.print(" ");
        }

        System.out.print(mensajeModal);

        for (int i = 0; i < longitudEspaciadoMensajeB; i++) {
            System.out.print(" ");
        }

        System.out.println("│");

        System.out.print("╘");
        for (int i = 0; i < LONGITUD; i++) {
            System.out.print("═");
        }
        System.out.print("╛");
        System.out.println();

    }
}
