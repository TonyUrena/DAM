public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        int sumaNumeros = 0;

        for (int i = 1; i <= 5; i++) {
            sumaNumeros = sumaNumeros + (i * i);
        }
        System.out.print("La suma de los cuadrados de los 5 primeros números naturales es: " + sumaNumeros);
    }

}
