package chapter16Programs;

import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static JFontSizesPanel f1;
    static String phrase = "Hello, world!";
    JLabel[] pLabels = new JLabel[15];

    public JFontSizesPanel() {
	for (int i = 0; i < pLabels.length; ++i) {
	    pLabels[i] = new JLabel(phrase);
	    pLabels[i].setFont(new Font("Cooper Black", Font.PLAIN, i + 6));
	    add(pLabels[i]);
	}
    }

    public static void main(String[] args) {
	f1 = new JFontSizesPanel();
	f1.setTitle("JFontSizesPanel");
	f1.setLayout(new GridLayout(16, 1));
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setBounds(0, 0, 256, 512);
	f1.setVisible(true);
    }
}
