package chapter15Programs;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    static JPanelDemo f1;

    JFlexiblePanel panel1 = new JFlexiblePanel(Color.GRAY, Color.WHITE, new Font("Cooper Black", Font.PLAIN, 20),
	    "Hello, world!");
    JFlexiblePanel panel2 = new JFlexiblePanel(Color.RED, Color.PINK, new Font("Comic Sans MS", Font.PLAIN, 20),
	    "Hello, world!");
    JFlexiblePanel panel3 = new JFlexiblePanel(Color.ORANGE, Color.YELLOW, new Font("Impact", Font.PLAIN, 20),
	    "Hello, world!");
    JFlexiblePanel panel4 = new JFlexiblePanel(Color.GRAY, Color.WHITE, new Font("ISOCT3_IV50", Font.PLAIN, 20),
	    "Hello, world!");

    public JPanelDemo() {
	setLayout(new GridLayout(2, 2));
	add(panel1);
	add(panel2);
	add(panel3);
	add(panel4);
    }

    public static void main(String[] args) {
	f1 = new JPanelDemo();
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setBounds(0, 0, 600, 300);
	f1.setVisible(true);
    }

}
