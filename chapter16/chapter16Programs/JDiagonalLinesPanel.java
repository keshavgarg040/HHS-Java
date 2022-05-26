package chapter16Programs;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class JDiagonalLinesPanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2D = (Graphics2D) g;
	Rectangle2D.Float sq = new Rectangle2D.Float(20F, 40F, 40F, 40F);
	g2D.draw(sq);
    }
}
