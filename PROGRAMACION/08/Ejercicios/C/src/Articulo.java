public class Articulo {
    
    private String nombre;
    private int precio, cuantosQuedan;
    private int iva = 21;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public int getIVA() {
        return iva;
    }

    public void setIVA(int iva) {
        this.iva = iva;
    }

    

}
