public class Ejercicio11A {
    
    public static void main(String[] args) {
        
        int array100[] = new int[100];
        int array100Inverso[] = new int[100];

        for (int i = 0; i < 100; i++) {
            
            array100[i] = i + 1;
            System.out.print(array100[i] + " ");

        }
        
        System.out.println();

        for (int i = 0; i < 100; i++) {
            
            array100Inverso[i] = array100[99-i];
            System.out.print(array100Inverso[i] + " ");

        }
    }

}
