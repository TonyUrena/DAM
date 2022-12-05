import java.util.Arrays;

public class Ejercicio18A {
    
    public static void main(String[] args) {
        
    int[] array30 = new int[30];

    for (int i = 0; i < 30; i++) {
        array30[i] = (int)(Math.random() * 10);
    }
    Arrays.sort(array30);

    System.out.println(Arrays.toString(array30));

    }
}
