package chapter14YDIs;

import javax.swing.*;
import java.awt.*;

public class JFrameWithComponents extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JLabel label = new JLabel("Enter your name");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");

    public JFrameWithComponents() {
	super("Frame with Components");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	add(label);
	add(field);
	add(button);
    }
}
