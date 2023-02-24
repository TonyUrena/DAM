public class EjercicioB4 {
    
    public static void main(String[] args) {
        
        float pvp;


        Articulo articulo = new Articulo("Pijama", 120, 10);
        pvp = articulo.precio + (articulo.precio * articulo.IVA / 100);

        System.out.println(articulo.nombre + " - " + 
                           articulo.precio + "€ - " +
                           "IVA:" + articulo.IVA + "% - " + 
                           "PVP:" + pvp + "€");

        Articulo articulo1 = new Articulo("", -10, 0);

        pvp = articulo1.precio + (articulo1.precio * articulo1.IVA / 100);

        System.out.println(articulo1.nombre + " - " + 
                           articulo1.precio + "€ - " +
                           "IVA:" + articulo1.IVA + "% - " + 
                           "PVP:" + pvp + "€");

    }

}
