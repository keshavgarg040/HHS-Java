package chapter16Programs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JChangeSizeAndColorPanel2 extends JPanel implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static JChangeSizeAndColorPanel2 f1;
    static String phrase = "Hello, world!";
    JButton cChgButton = new JButton("Click Here!");
    int cCount = 0;
    int x = (int) (Math.random() * 400);
    int y = (int) (Math.random() * 400);
    int fSize = 20;
    Font font = new Font("Cooper Black", Font.PLAIN, fSize);
    Color fColor = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

    public JChangeSizeAndColorPanel2() {
	add(cChgButton, BorderLayout.NORTH);
	cChgButton.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setFont(font);
	g.setColor(fColor);
	g.drawString(phrase, x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	++cCount;
	x = (int) (Math.random() * 400);
	y = (int) (Math.random() * 400);
	fSize = (int) (Math.random() * 100) + 20;
	font = new Font("Cooper Black", Font.PLAIN, fSize);
	fColor = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
	repaint();
    }

    public static void main(String[] args) {
	f1 = new JChangeSizeAndColorPanel2();
	// f1.setLayout(new BorderLayout());
	f1.setBounds(500, 500, 500, 500);
	f1.setVisible(true);
    }
}
