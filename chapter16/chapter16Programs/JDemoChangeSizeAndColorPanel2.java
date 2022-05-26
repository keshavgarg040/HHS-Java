package chapter16Programs;

import javax.swing.*;

public class JDemoChangeSizeAndColorPanel2 extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JChangeSizeAndColorPanel2 p1 = new JChangeSizeAndColorPanel2();

    public JDemoChangeSizeAndColorPanel2() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(p1);
    }

    public static void main(String[] args) {
	JDemoChangeSizeAndColorPanel2 f1 = new JDemoChangeSizeAndColorPanel2();
	f1.setSize(500, 500);
	f1.setVisible(true);
    }
}
