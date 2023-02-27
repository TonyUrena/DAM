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

        Scanner reader = new Scanner(System.in);

        String dni;
        Cuenta cuentaArray[] = new Cuenta[3];

        System.out.println("Introduce el DNI de la persona a almacenar:");
        dni = reader.nextLine();

        Persona persona = new Persona(dni, cuentaArray);

        // Aumentamos el contador de personas para tener la posición correcta al almacenar
        // las nuevas instancias en el array
        Persona.cantidadPersonas++;

        return persona;

    }

    // 2. Instanciar objetos de tipo Cuenta y asociarlo a una persona
    public static void instanciaCuentaPersona(Persona persona) {

        Scanner reader = new Scanner(System.in);
        int numeroCuenta = 0, saldoCuenta = 0, cantidadCuentas;

        // Los objetos Cuenta van siempre almacenados en este array dentro
        // de cada instancia Persona
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

            System.out.println("Introduce el número de la cuenta nº" + i + 1);
            numeroCuenta = reader.nextInt();

            System.out.println("Introduce su saldo.");
            saldoCuenta = reader.nextInt();
            // BUG READER
            reader.nextLine();

            cuentaArray[i] = new Cuenta(numeroCuenta, saldoCuenta);
        }

        persona.setCuentaArray(cuentaArray);
    }

    // 3. Mostrar datos de una persona (por su dni)
    public static void muestraDatos(Persona persona) {

        // Comprueba si existe la persona, si existe recoge su DNI
        if (persona == null) {
            System.out.println("--------------------------");
            System.out.println("ERROR: No hay personas en la lista");
            System.out.println("--------------------------");
        } else {
            System.out.println("--------------------------");
            System.out.println("DNI: " + persona.getDNI());
        }

        for (int j = 0; j < persona.getCuentaArray().length; j++) {
            System.out.println("Cuenta nº" + j + 1 + ": " + persona.getCuentaArray()[j].getSaldo());
        }
        System.out.println("--------------------------");
    }

    // 4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).
    // 5. Recibir un pago (por dni y núm de cuenta)
    public static void recibeIngreso(Cuenta cuenta) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el saldo a abonar");
        float abono = reader.nextFloat();

        cuenta.setSaldo(cuenta.getSaldo() + abono);

    }

    // 6. Realizar transferencia entre cuentas
    public static void realizaTransferencia(Cuenta cuentaA, Cuenta cuentaB){

        Scanner reader = new Scanner(System.in);
        float pago;

        System.out.println("Introduce la cantidad a transferir: ");
        pago = reader.nextFloat();

        cuentaA.setSaldo(cuentaA.getSaldo() - pago);
        cuentaB.setSaldo(cuentaB.getSaldo() + pago);
    }

    // 7. Imprimir las personas morosas
    public static void cobradorDelFrac(Persona[] personas){

        boolean sus;
        int i = 0;

        while(i < Persona.cantidadPersonas){
            sus = personas[i].esMorosa();
            if (sus){ // ඞ
                 System.out.println(personas[i].getDNI() + " ඞ");
            }
            i++;
        }

    }


    // MÉTODOS AUXILIARES
    public static Persona buscaPersonaPorDNI(Persona[] personasArray) {

        Scanner reader = new Scanner(System.in);
        int i = 0;
        Persona persona = null;

        System.out.println("Introduce el DNI de la persona a buscar: ");
        String dni = reader.nextLine();

        while (i < Persona.cantidadPersonas) {
            if (personasArray[i].getDNI().equals(dni)) {
                persona = personasArray[i];
            }
            i++;
        }

        if (persona == null) {
            System.out.println("ERROR: persona no encontrada");
        }

        return persona;
    }

    public static Cuenta buscaCuentaEnPersona(Persona persona) {

        Scanner reader = new Scanner(System.in);
        int i = 0;
        Cuenta cuenta = null;

        System.out.println("Introduce el Nº de cuenta a buscar: ");
        int numCuenta = reader.nextInt();

        while (i < persona.getCuentaArray().length) {
            if (persona.getCuentaArray()[i].getCuenta() == numCuenta) {
                cuenta = persona.getCuentaArray()[i];
            }
            i++;
        }

        if (cuenta == null) {
            System.out.println("ERROR: cuenta no encontrada");
        }

        return cuenta;
    }

}
