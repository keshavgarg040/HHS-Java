package chapter16Programs;

import javax.swing.*;

public class JDemoSmileFacePanel extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JSmileFacePanel p1 = new JSmileFacePanel();

    public JDemoSmileFacePanel() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(p1);
    }

    public static void main(String[] args) {
	JDemoSmileFacePanel f1 = new JDemoSmileFacePanel();
	f1.setTitle("JDemoSmileFacePanel");
	f1.setSize(500, 500);
	f1.setVisible(true);
    }

}
