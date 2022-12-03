public class Ejercicio11{

    public static void main(String[] args) {

        int numero, sumaPares = 0, sumaImpares = 0;

        for (int num = 100; num <= 200; num++) {
            if (num % 2 == 0){
                sumaPares += num;
            } else {
                sumaImpares += num;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares + "\n" +
                           "La suma de los números impares es: " + sumaImpares);

    }
}