import java.util.Scanner;

public class Obligatorio08 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        final int MAXPERSONAS = 100;

        Persona personasArray[];

        int opcionMenu = 0;

        do {

            personasArray = new Persona[MAXPERSONAS];
            PruebaCuentas.imprimeMenu();

            opcionMenu = reader.nextInt();

            if (opcionMenu < 0 || opcionMenu > 7) {
            }

            switch (opcionMenu) {

                case 1:

                    personasArray[Persona.cantidadPersonas] = PruebaCuentas.instanciaPersona();
                    Persona.cantidadPersonas++;
                    break;

                case 2:

                    System.out.println("Introduce el DNI de la persona: ");
                    
                    // TODO buscar persona por DNI
                    PruebaCuentas.instanciaCuentaPersona(personasArray[0]);

                    break;

                case 3:

                    // TODO introducir DNI
                    PruebaCuentas.muestraDatos(0);

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                default:
                    System.err.println("ERROR: opción incorrecta");
                    break;

            }

        } while (opcionMenu != 0);

    }

}
