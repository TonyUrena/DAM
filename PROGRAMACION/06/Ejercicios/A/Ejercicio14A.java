public class Ejercicio14A {
    
    public static void main(String[] args) {
        
        int[] arrayEnteros;
        int tamañoArray = 1, cont = 1;

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                tamañoArray++;
            }
        }
        arrayEnteros = new int[tamañoArray];
        
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                arrayEnteros[cont++] = i;
            }
        }

        for (int i = 0; i < tamañoArray; i++) {
            System.out.println(arrayEnteros[i]);
        }
        
    }

}
