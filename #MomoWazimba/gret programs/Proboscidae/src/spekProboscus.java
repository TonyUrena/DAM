import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import spek.Viewer;

public class spekProboscus {

    public static void main(String[] args) {

        long wordQuantity;
        String proboscWisdom;

        Scanner reader = new Scanner(System.in);

        System.out.println("How much words has de proboscus to spek?");
        wordQuantity = reader.nextLong();

        proboscWisdom = wisdomGenerator(wordQuantity);

        Viewer.drawWisdom(proboscWisdom);

    }

    private static String wisdomGenerator(long wordQuantity){

        String wisdom = "";
        
        for (int i = 0; i < wordQuantity; i++){
            wisdom = wisdom + dictionary() + " ";
        }

        return wisdom;
    }

    public static String dictionary (){

        String word;

        int maxWordsG = 14;
        int maxWordsN = 10;
        Random rand = new Random();
        
        String[][] dictionary = {{"GA", "GÁ", "GUE", "GUÉ", "GÜE", "GÜÉ", "GUI", "GUÍ", "GÜI", "GÜÍ", "GO", "GÓ", "GU", "GÚ"},
                           {"ÑA", "ÑÁ", "ÑE" , "ÑÉ" , "ÑI" , "ÑÍ" , "ÑO" , "ÑÓ" , "ÑU" , "ÑÚ"}};

        word = dictionary[0][rand.nextInt(maxWordsG)] + dictionary[1][rand.nextInt(maxWordsN)];
        
        return word;
    }

}
