package chapter11Monster;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PickMonster extends JFrame implements ActionListener, Activator {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JButton vampButton = new JButton("Press for vampire");
    JButton ghostButton = new JButton("Press for Scary Ghost");
    JPanel buttonPanel = new JPanel();
    boolean vamp = false;

    public PickMonster() {
	buttonPanel.setBackground(new Color(255, 56, 29));
	buttonPanel.setForeground(Color.blue);
	setLayout(new BorderLayout());

	vampButton.setBackground(Color.blue);
	vampButton.setBackground(new Color(255, 56, 29));
	vampButton.addActionListener(this);

	ghostButton.setBackground(Color.blue);
	ghostButton.setBackground(new Color(255, 56, 29));
	ghostButton.addActionListener(this);

	buttonPanel.add(vampButton);
	buttonPanel.add(ghostButton);
	buttonPanel.setBorder(new TitledBorder("Monster Buttons"));

	add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	vamp = false;
	if (e.getSource() == vampButton) {
	    vamp = true;
	}
	MonsterFrame moFrame = new MonsterFrame(vamp, this);
	moFrame.pack();
	moFrame.setBounds(250, 250, 300, 300);
	moFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(false);
	moFrame.setVisible(true);
    }

    @Override
    public void activate() {
	setVisible(true);
    }

    public static void main(String[] args) {
	PickMonster mFrame = new PickMonster();
	mFrame.setBounds(50, 50, 200, 200);
	mFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	mFrame.setVisible(true);
    }
}
