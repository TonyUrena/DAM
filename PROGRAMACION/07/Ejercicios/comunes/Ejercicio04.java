public class Ejercicio04 {

    public static void main(String[] args) {

        int numero, signo;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        signo = dimeSigno(numero);

        switch (signo) {
            case -1:
            System.out.println("El número es Negativo.");
                break;

            case 0:
            System.out.println("El número es Cero");
                break;

            case 1:
            System.out.println("El número es Positivo");
                break;

            default:
                break;
        }

    }

    public static int dimeSigno(int a) {

        int signo;

        if (a > 0) {
            signo = 1;
        } else if (a == 0) {
            signo = 0;
        } else {
            signo = -1;
        }

        return signo;
    }
}
