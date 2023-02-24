public class EjercicioA4 {
    
    public static void main(String[] args) {
        
        Articulo articulo = new Articulo();
        float pvp;

        articulo.nombre = "Pijama";
        articulo.precio = 120;
        articulo.cuantosQuedan = 10;
        pvp = articulo.precio + (articulo.precio * articulo.IVA / 100);

        System.out.println(articulo.nombre + " - " + 
                           articulo.precio + "€ - " +
                           "IVA:" + articulo.IVA + "% - " + 
                           "PVP:" + pvp + "€");

        articulo.nombre = "Vestido";
        articulo.precio = 90;
        articulo.cuantosQuedan = 9;
        pvp = articulo.precio + (articulo.precio * articulo.IVA / 100);

        System.out.println(articulo.nombre + " - " + 
                           articulo.precio + "€ - " +
                           "IVA:" + articulo.IVA + "% - " + 
                           "PVP:" + pvp + "€");

    }

}
