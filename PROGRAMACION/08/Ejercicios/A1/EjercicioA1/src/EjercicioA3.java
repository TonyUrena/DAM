public class EjercicioA3 {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();

        rectangulo1 = construyeRectangulo(rectangulo1, 0, 0, 5, 5);
        rectangulo2 = construyeRectangulo(rectangulo2, 7, 9, 2, 3);

        imprimeRectangulo(rectangulo1);
        imprimeRectangulo(rectangulo2);

    }

    public static Rectangulo construyeRectangulo(Rectangulo rectangulo,
            int x1, int y1,
            int x2, int y2) {

        rectangulo.x1 = x1;
        rectangulo.y1 = y1;

        rectangulo.x2 = x2;
        rectangulo.y2 = y2;

        return rectangulo;
    }

    public static void imprimeRectangulo(Rectangulo rectangulo) {

        int lado1 = (rectangulo.x1-rectangulo.x2);
        int lado2 = (rectangulo.y1-rectangulo.y2);
        int perimetro = lado1*2 + lado2*2;
        int area = lado1 * lado2;

        System.out.println("Coordenadas: ");
        System.out.println("(" + rectangulo.x1 + "," + rectangulo.y1 + ")" +
                           "(" + rectangulo.x2 + "," + rectangulo.y2 + ")");
        System.out.println("Perímetro: ");
        System.err.println(perimetro);
        System.out.println("Área: ");
        System.err.println(area);

    }

}
