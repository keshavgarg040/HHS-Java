package chapter15Programs;

import java.awt.*;
import javax.swing.*;

public class JFlexiblePanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JLabel messageLabel = new JLabel();
    Color fg;
    Color bg;
    Font fnt;
    String mess;

    public JFlexiblePanel(Color foreground, Color background, Font font, String message) {
	fg = foreground;
	bg = background;
	fnt = font;
	mess = message;
	setForeground(fg);
	setBackground(bg);
	messageLabel.setText(mess);
	messageLabel.setFont(fnt);
	add(messageLabel);
    }

}
