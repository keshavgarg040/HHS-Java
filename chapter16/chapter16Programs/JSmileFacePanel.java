package chapter16Programs;

import java.awt.*;
import javax.swing.*;

public class JSmileFacePanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.YELLOW);
	g.fillOval(150, 150, 200, 200);
	g.setColor(Color.BLACK);
	g.fillOval(200, 200, 20, 20);
	g.fillOval(275, 200, 20, 20);
	g.drawArc(200, 200, 100, 100, 0, -180);
    }

}
