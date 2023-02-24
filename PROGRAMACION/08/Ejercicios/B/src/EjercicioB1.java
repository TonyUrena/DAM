public class EjercicioB1 {
    public static void main(String[] args) throws Exception {

        Punto punto1 = new Punto(5,0);
        Punto punto2 = new Punto(10,10);
        Punto punto3 = new Punto(-3,7);

        System.out.println("Punto 1: " + punto1.x + "," + punto1.y);
        System.out.println("Punto 2: " + punto2.x + "," + punto2.y);
        System.out.println("Punto 3: " + punto3.x + "," + punto3.y);

        punto1.x = 10;
        punto1.y = 3;

        punto2.x = 5;
        punto2.y = 11;

        punto3.x = 50;
        punto3.y = -2;

        System.out.println("-------------------------------------");
        System.out.println("Punto 1: " + punto1.x + "," + punto1.y);
        System.out.println("Punto 2: " + punto2.x + "," + punto2.y);
        System.out.println("Punto 3: " + punto3.x + "," + punto3.y);
    }
}
