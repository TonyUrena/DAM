import java.util.Scanner;

public class PruebaCuentas {

    public static void imprimeMenu() {

        System.out.println("\n-------------------- MENU ------------------------");
        System.out.println("1. Instanciar objetos de tipo Persona");
        System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlo a una persona");
        System.out.println("3. Mostrar datos de una persona (por su dni)");
        System.out.println("4. Recibir la nómina mensual de una persona (por dni y núm de cuenta)");
        System.out.println("5. Recibir un pago (por dni y núm de cuenta)");
        System.out.println("6. Realizar transferencia entre cuentas");
        System.out.println("7. Imprimir las personas morosas");
        System.out.println("0. Salir");
        System.out.println("--------------------------------------------------");

    }

    // 1. Instanciar objetos de tipo Persona
    public static Persona instanciaPersona() {

        String dni;
        Scanner reader = new Scanner(System.in);
        Cuenta cuentaArray[] = new Cuenta[3];

        System.out.println("Introduce el DNI de la persona:");
        dni = reader.nextLine();

        Persona persona = new Persona(dni, cuentaArray);

        return persona;

    }

    // 2. Instanciar objetos de tipo Cuenta y asociarlo a una persona
    public static void instanciaCuentaPersona(Persona persona) {

        Scanner reader = new Scanner(System.in);
        int numeroCuenta = 0, saldoCuenta = 0, cantidadCuentas;
        Cuenta cuentaArray[];

        System.out.println("Cuántas cuentas tiene la persona con DNI: " +
                persona.getDNI() + " (máx 3 cuentas)");

        do {
            cantidadCuentas = reader.nextInt();
            if (cantidadCuentas > 3 || cantidadCuentas <= 0) {
                System.err.println("ERROR: cantidad de cuentas incorrecta");
            }

        } while (cantidadCuentas > 3 || cantidadCuentas <= 0);

        cuentaArray = new Cuenta[cantidadCuentas];

        for (int i = 0; i < cantidadCuentas; i++) {

            System.out.println("Introduce el número de la cuenta nº" + i);
            numeroCuenta = reader.nextInt();

            System.out.println("Introduce su saldo.");
            saldoCuenta = reader.nextInt();
            // BUG READER
            reader.nextLine();

            cuentaArray[i] = new Cuenta(numeroCuenta, saldoCuenta);
        }

    }

    // 3. Mostrar datos de una persona (por su dni)
    public static void muestraDatos(int dni){

        // TODO buscar objeto con dni

        System.out.println("--------------------------");
        System.out.println("DNI: " + persona.getDNI());
        System.out.println("--------------------------");

        int i = 0;
        do {
            i++;
            System.out.println("Cuenta nº" + i + ": " + persona.cuentaArray[i].getSaldo);
        } while (persona.cuentaArray[i] != null);
    }

}
