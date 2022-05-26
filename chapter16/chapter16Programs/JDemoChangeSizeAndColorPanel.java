package chapter16Programs;

import javax.swing.*;

public class JDemoChangeSizeAndColorPanel extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JChangeSizeAndColorPanel p1 = new JChangeSizeAndColorPanel();

    public JDemoChangeSizeAndColorPanel() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(p1);
    }

    public static void main(String[] args) {
	JDemoChangeSizeAndColorPanel f1 = new JDemoChangeSizeAndColorPanel();
	f1.setSize(500, 500);
	f1.setVisible(true);
    }
}
