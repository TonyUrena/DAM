public class EjercicioC1 {
    public static void main(String[] args) throws Exception {

        Punto punto1 = new Punto(5,0);
        Punto punto2 = new Punto(10,10);
        Punto punto3 = new Punto(-3,7);

        System.out.println("Punto 1: " + punto1.getX() + "," + punto1.getY());
        System.out.println("Punto 2: " + punto2.getX() + "," + punto2.getY());
        System.out.println("Punto 3: " + punto3.getX() + "," + punto3.getY());

        punto1.setX(10);
        punto1.setY(3);

        punto2.setX(3);
        punto2.setY(11);

        punto3.setX(0);
        punto3.setY(-2);

        System.out.println("-------------------------------------");
        System.out.println("Punto 1: " + punto1.getX() + "," + punto1.getY());
        System.out.println("Punto 2: " + punto2.getX() + "," + punto2.getY());
        System.out.println("Punto 3: " + punto3.getX() + "," + punto3.getY());
    }
}
