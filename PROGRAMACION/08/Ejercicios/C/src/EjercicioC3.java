import java.util.Scanner;

public class EjercicioC3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();

        rectangulo1.setX1(reader.nextInt());
        rectangulo1.setY1(reader.nextInt());
        rectangulo1.setX2(reader.nextInt());
        rectangulo1.setY2(reader.nextInt());

        rectangulo2.setX1(reader.nextInt());
        rectangulo2.setY1(reader.nextInt());
        rectangulo2.setX2(reader.nextInt());
        rectangulo2.setY2(reader.nextInt());

        imprimeRectangulo(rectangulo1);
        imprimeRectangulo(rectangulo2);

    }

    public static void imprimeRectangulo(Rectangulo rectangulo) {

        int lado1 = (rectangulo.getX1()-rectangulo.getX2());
        int lado2 = (rectangulo.getY1()-rectangulo.getY2());
        int perimetro = lado1*2 + lado2*2;
        int area = lado1 * lado2;

        System.out.println("Coordenadas: ");
        System.out.println("(" + rectangulo.getX1() + "," + rectangulo.getY1() + ")" +
                           "(" + rectangulo.getX2() + "," + rectangulo.getY2() + ")");
        System.out.println("Perímetro: ");
        System.err.println(perimetro);
        System.out.println("Área: ");
        System.err.println(area);

    }

}
