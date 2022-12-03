public class Ejercicio09{

    public static void main(String[] args) {

        int suma = 1, producto = 1;

        for (int i = 1; i < 10; i++) {
            
            suma++;
            producto = producto * i;

        }

        System.out.println("Suma: " + suma + "\n" +
                            "Producto: " + producto);
    }   
}
