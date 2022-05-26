package chapter15Programs;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class JFontSelector extends JFrame implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    static JFontSelector f1;
    JPanel buttonPanel = new JPanel();
    JButton impactButton = new JButton("Impact");
    JButton comicSansButton = new JButton("Comic Sans MS");
    JButton wingdingsButton = new JButton("Wingdings");
    JButton cooperBlackButton = new JButton("Cooper Black");
    JButton ISOCT3_IV50Button = new JButton("ISOCT3_IV50");
    JButton fontUp = new JButton("∧");
    JButton fontDown = new JButton("∨");
    JLabel fontLabel = new JLabel("Select Your Font");
    int fontSize = 12;
    String font;

    public JFontSelector() {
	impactButton.setFont(new Font("Impact", Font.PLAIN, 14));
	comicSansButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
	wingdingsButton.setFont(new Font("Wingdings", Font.PLAIN, 14));
	cooperBlackButton.setFont(new Font("Cooper Black", Font.PLAIN, 14));
	ISOCT3_IV50Button.setFont(new Font("ISOCT3_IV50", Font.PLAIN, 14));
	impactButton.addActionListener(this);
	comicSansButton.addActionListener(this);
	wingdingsButton.addActionListener(this);
	cooperBlackButton.addActionListener(this);
	ISOCT3_IV50Button.addActionListener(this);
	fontUp.addActionListener(this);
	fontDown.addActionListener(this);
	buttonPanel.add(impactButton);
	buttonPanel.add(comicSansButton);
	buttonPanel.add(wingdingsButton);
	buttonPanel.add(cooperBlackButton);
	buttonPanel.add(ISOCT3_IV50Button);
	buttonPanel.add(fontUp);
	buttonPanel.add(fontDown);
	buttonPanel.add(fontLabel);
	add(buttonPanel);
    }

    public void changeFontLabel(String font) {
	fontLabel.setText(font);
	fontLabel.setFont(new Font(font, Font.PLAIN, fontSize));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == impactButton) {
	    font = "Impact";
	    changeFontLabel(font);
	} else if (e.getSource() == comicSansButton) {
	    font = "Comic Sans MS";
	    changeFontLabel(font);
	} else if (e.getSource() == wingdingsButton) {
	    font = "Wingdings";
	    changeFontLabel(font);
	} else if (e.getSource() == cooperBlackButton) {
	    font = "Cooper Black";
	    changeFontLabel(font);
	} else if (e.getSource() == ISOCT3_IV50Button) {
	    font = "ISOCT3_IV50";
	    changeFontLabel(font);
	} else if (e.getSource() == fontUp) {
	    ++fontSize;
	    fontLabel.setFont(new Font(font, Font.PLAIN, fontSize));
	} else if (e.getSource() == fontDown) {
	    --fontSize;
	    fontLabel.setFont(new Font(font, Font.PLAIN, fontSize));
	}

    }

    public static void main(String[] args) {
	f1 = new JFontSelector();
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setTitle("JFontSelector");
	f1.setBounds(0, 0, 600, 300);
	f1.setVisible(true);
    }
}
