package chapter16Programs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JChangeSizeAndColorPanel extends JPanel implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static JChangeSizeAndColorPanel f1;
    static String phrase = "Hello, world!";
    JButton cChgButton = new JButton("Click Here!");
    int cCount = 0;
    int x = 20;
    int fSize = 20;
    Font font = new Font("Cooper Black", Font.PLAIN, fSize);

    public JChangeSizeAndColorPanel() {
	add(cChgButton, BorderLayout.NORTH);
	cChgButton.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setFont(font);
	g.drawString(phrase, x, 80);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (cCount < 4 && e.getSource() == cChgButton) {
	    ++cCount;
	    x += 20;
	    fSize += 4;
	    font = new Font("Cooper Black", Font.PLAIN, fSize);
	    repaint();
	}
    }

    public static void main(String[] args) {
	f1 = new JChangeSizeAndColorPanel();
	// f1.setLayout(new BorderLayout());
	f1.setBounds(500, 500, 500, 500);
	f1.setVisible(true);
    }
}
