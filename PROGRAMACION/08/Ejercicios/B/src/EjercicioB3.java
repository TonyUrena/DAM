public class EjercicioB3 {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(0,0,10,10);
        Rectangulo rectangulo2 = new Rectangulo(10,10,0,0);

        imprimeRectangulo(rectangulo1);
        imprimeRectangulo(rectangulo2);

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
