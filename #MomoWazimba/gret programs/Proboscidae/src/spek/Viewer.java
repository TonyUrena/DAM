package spek;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.*;

public class Viewer extends JFrame { // Heredamos de JFrame, por lo que no necesitamos declararla explícitamente

    public static void drawWisdom(String proboscWisdom){

        JFrame f = new JFrame();

        f.setSize(800,800);
        f.setLayout(null);
        f.setResizable(false);

        JLabel title = createTitle("DE PROBOSCUS SPEAKS IS WISDOMS:", 
                                   0, 0, f.getWidth(), 100, 
                                   SwingConstants.CENTER, SwingConstants.CENTER,
                                   "Arial", 32);
                                  
        JTextArea wisdoms = new JTextArea(proboscWisdom);
        wisdoms.setBounds(0,title.getHeight(), f.getWidth(), f.getHeight()-title.getHeight());
        wisdoms.setFont(new Font("Arial",Font.PLAIN,18));        
        wisdoms.setWrapStyleWord(true);
        wisdoms.setLineWrap(true);
        wisdoms.setAutoscrolls(true);
        wisdoms.setMargin(new Insets(50,50,50,50));

        f.add(title);
        f.add(wisdoms);
        
        f.setVisible(true);
    }

    private static JLabel createTitle(String text, int x, int y, int width, int height, 
                                      int horAlignment, int verAlignment, 
                                      String font, int textSize){

        JLabel label = new JLabel(text);

        label.setBounds(x, y, width, height);
        label.setHorizontalAlignment(horAlignment);
        label.setVerticalAlignment(verAlignment);

        label.setFont(new Font(font, Font.BOLD, textSize));

        // Back color para debug
        label.setBackground(Color.CYAN);
        //label.setOpaque(true);

        return label;
    }


    private static JButton createFlatJButton(String buttonText, int x, int y, int width, int height,
                                             Color backColor, Color textColor){

        JButton button = new JButton(buttonText);

        button.setBounds(x, y, width, height);

        button.setBackground(backColor);
        button.setForeground(textColor);

        button.setBorder(null);
        button.setFocusPainted(false);
        
        return button;
    }
    
    public static void main(String[] args) {

        new Viewer();

    }
}
