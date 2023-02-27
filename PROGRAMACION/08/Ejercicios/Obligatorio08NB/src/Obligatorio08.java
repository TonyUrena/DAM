/*
 * Tony Ureña Fortuño
 */

import java.util.Scanner;

public class Obligatorio08 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Declaramos el número de personas para el array que almacenará las personas
        // en 100 para tener espacio "suficiente" para las pruebas
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
                        // Llamamos la variable static "cantidadPersonas" para conocer la posición correcta al almacenar
                        // la instancia en el array
                        personasArray[Persona.cantidadPersonas] = PruebaCuentas.instanciaPersona();
                        break;

                    case 2:
                        // El método buscaPersonaDni devuelve la persona con el DNI que introducimos, y lo pasa al método
                        // instancia Cuenta Persona. (Todas las cuentas sólo son accesibles a través de un objeto Persona)
                        PruebaCuentas.instanciaCuentaPersona(PruebaCuentas.buscaPersonaPorDNI(personasArray));
                        break;

                    case 3:
                        // Devuelve la persona que tiene ese DNI y muestra sus datos.
                        PruebaCuentas.muestraDatos(PruebaCuentas.buscaPersonaPorDNI(personasArray));
                        break;

                    case 4:
                        // Devuelve la persona con un DNI, pasa ese objeto Persona al metodo buscaCuentaEnPersona, devuelve
                        // la cuenta que le pedimos y la pasa a recibeIngreso, donde realizamos en ingreso.
                        PruebaCuentas.recibeIngreso(
                                PruebaCuentas.buscaCuentaEnPersona(
                                        PruebaCuentas.buscaPersonaPorDNI(personasArray)));
                        break;

                    case 5:
                        // Ver 4. ඞ
                        PruebaCuentas.recibeIngreso(
                                PruebaCuentas.buscaCuentaEnPersona(
                                        PruebaCuentas.buscaPersonaPorDNI(personasArray)));
                        break;

                    case 6:
                        // Buscamos el DNI y la cuenta de 2 cuentas en 2 personas distintas, y pasamos cada una de estas
                        // cuentas a un metodo para realizar una transferencia entre ellas.
                        System.out.println("Introduce los datos de la cuenta que hará el pago: ");
                        Cuenta cuentaA = PruebaCuentas.buscaCuentaEnPersona(
                                PruebaCuentas.buscaPersonaPorDNI(personasArray));

                        System.out.println("Introduce los datos de la cuetna que recibirá el pago: ");
                        Cuenta cuentaB = PruebaCuentas.buscaCuentaEnPersona(
                                PruebaCuentas.buscaPersonaPorDNI(personasArray));

                        PruebaCuentas.realizaTransferencia(cuentaA, cuentaB);
                        break;

                    case 7:
                        // El cobrador del frac llama a la función static esMorosa de Persona y se recorre todas las cuentas
                        // de todas las personas en busca de un saldo negativo, si esMorosa encuentra un saldo negativo devuelve
                        // true y el cobrador del frac se ocupa de imprimir sus DNI.
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
