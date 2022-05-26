package chapter11Monster;

import javax.swing.JPanel;
import java.awt.*;

public class PaintPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String image;

    public PaintPanel(String imageName) {
	image = imageName;
    }

    public void paintCompnent(Graphics g) {
	super.paintComponent(g);
	Image imag = Toolkit.getDefaultToolkit().getImage(image);
	g.drawImage(imag, 0, 0, 300, 300, this);
    }
}
