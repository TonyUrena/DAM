public class Articulo {
    
    String nombre;
    int precio, cuantosQuedan;
    final int IVA = 21;

    public Articulo(String nombre, int precio,
                    int cuantosQuedan){

        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;

        if (nombre == null || nombre.equals("")){
            System.err.println("ERROR: nombre no introducido");
        }

        if (precio <= 0){
            System.err.println("ERROR: precio negativo.");
        }

        if (cuantosQuedan < 1){
            System.err.println("ERROR: no quedan artículos.");
        }
    }

}
