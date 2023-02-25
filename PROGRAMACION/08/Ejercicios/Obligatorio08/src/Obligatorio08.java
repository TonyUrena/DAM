import java.util.Scanner;

public class Obligatorio08 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        final int MAXPERSONAS = 100;

        Persona personasArray[] = new Persona[MAXPERSONAS];
        int opcionMenu = 0;

        do {

            PruebaCuentas.imprimeMenu();

            opcionMenu = reader.nextInt();
            // BUGAZO vetusto del Scanner
            reader.nextLine();

            if (opcionMenu >= 0 && opcionMenu <= 7) {

                switch (opcionMenu) {

                    case 1:
                        personasArray[Persona.cantidadPersonas] = PruebaCuentas.instanciaPersona();
                        break;

                    case 2:
                        PruebaCuentas.instanciaCuentaPersona(PruebaCuentas.buscaPersonaPorDNI(personasArray));
                        break;

                    case 3:
                        PruebaCuentas.muestraDatos(PruebaCuentas.buscaPersonaPorDNI(personasArray));
                        break;

                    case 4:
                        PruebaCuentas.recibeNomina(
                                PruebaCuentas.buscaCuentaEnPersona(
                                        PruebaCuentas.buscaPersonaPorDNI(personasArray)));
                        break;

                    case 5:
                        PruebaCuentas.recibeNomina(
                                PruebaCuentas.buscaCuentaEnPersona(
                                        PruebaCuentas.buscaPersonaPorDNI(personasArray)));
                        break;

                    case 6:
                        System.out.println("Introduce los datos de la cuenta que hará el pago: ");
                        Cuenta cuentaA = PruebaCuentas.buscaCuentaEnPersona(
                                PruebaCuentas.buscaPersonaPorDNI(personasArray));

                        System.out.println("Introduce los datos de la cuetna que recibirá el pago: ");
                        Cuenta cuentaB = PruebaCuentas.buscaCuentaEnPersona(
                                PruebaCuentas.buscaPersonaPorDNI(personasArray));

                        PruebaCuentas.realizaTransferencia(cuentaA, cuentaB);
                        break;

                    case 7:
                        PruebaCuentas.cobradorDelFrac(personasArray);
                        break;

                }

            } else{
                System.err.println("ERROR: opción incorrecta");
            }

        } while (opcionMenu != 0);

        reader.close();

    }

}
