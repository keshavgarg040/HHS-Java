package chapter16Programs;

import javax.swing.*;

public class JDemoStatePanel extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JStatePanel p1 = new JStatePanel();

    public JDemoStatePanel() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(p1);
    }

    public static void main(String[] args) {
	JDemoStatePanel f1 = new JDemoStatePanel();
	f1.setTitle("JDemoStatePanel");
	f1.setSize(500, 500);
	f1.setVisible(true);
    }
}
