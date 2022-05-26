package chapter13Practice;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingSecretPhrase extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    int numCorrect = 0, phraseNum, incorrectAttempts = 0;
    JButton[] letterArray = new JButton[26];
    JButton resetButton = new JButton("Reset");
    JLabel attemptsLabel = new JLabel("Attempts: " + incorrectAttempts);
    JPanel letterPanel = new JPanel(new GridLayout(2, 13, 5, 5));
    JPanel phrasePanel = new JPanel();
    JPanel resetPanel = new JPanel();
    Font buttonFont = new Font("HoboSTD", Font.BOLD, 24);
    String phrase;
    ArrayList<Object> inputList = new ArrayList<Object>();
    ArrayList<String> phraseList = new ArrayList<String>();
    String fileName, s;
    boolean found;
    static SwingSecretPhrase f1;

    public SwingSecretPhrase() {
	fileName = "U:\\from laptop\\Documents\\Eclipse Workspaces\\newjavaworkspace\\Chapter13\\Phrases.txt";
	Path file = Paths.get(fileName);
	try {
	    InputStream iStream = new BufferedInputStream(Files.newInputStream(file));
	    BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
	    s = reader.readLine();
	    while (s != null) {
		phraseList.add(s);
		s = reader.readLine();
	    }
	    reader.close();
	    phraseNum = (int) (Math.random() * phraseList.size());
	    phrase = phraseList.get(phraseNum);
	    this.setLayout(new GridLayout(3, 1, 10, 10));
	    this.getContentPane().setBackground(Color.black);
	    resetPanel.setLayout(null);
	    resetPanel.setBackground(Color.black);
	    resetButton.addActionListener(this);
	    resetButton.setFont(buttonFont);
	    resetButton.setBackground(new Color(255, 153, 153));
	    resetButton.setBounds(50, 10, 150, 75);
	    resetPanel.add(resetButton);
	    attemptsLabel.setBounds(250, 10, 200, 75);
	    attemptsLabel.setForeground(new Color(255, 153, 153));
	    attemptsLabel.setFont(buttonFont);
	    resetPanel.add(attemptsLabel);
	    add(resetPanel);
	    phrasePanel.setBackground(Color.BLACK);
	    phrasePanel.setLayout(new GridLayout(1, phrase.length(), 5, 20));
	    for (int tfNum = 0; tfNum < phrase.length(); tfNum++) {
		if (phrase.charAt(tfNum) != ' ') {
		    inputList.add(new JTextField());
		    ((JTextField) inputList.get(tfNum)).setFont(buttonFont);
		    ((JTextField) inputList.get(tfNum)).setEnabled(false);
		    ((JTextField) inputList.get(tfNum)).setBackground(new Color(87, 87, 255));
		    ((JTextField) inputList.get(tfNum)).setHorizontalAlignment(JTextField.CENTER);
		    ((JTextField) inputList.get(tfNum)).setDisabledTextColor(Color.black);
		} else {
		    inputList.add(new JLabel(" "));
		    numCorrect++;
		}
		phrasePanel.add((Component) inputList.get(tfNum));
	    }
	    add(phrasePanel);
	    letterPanel.setBackground(Color.black);
	    for (int j = 0; j < letterArray.length; j++) {
		letterArray[j] = new JButton(Character.toString((char) (j + 65)));
		letterPanel.add(letterArray[j]);
		letterArray[j].addActionListener(this);
		letterArray[j].setBackground(Color.MAGENTA);
		letterArray[j].setFont(buttonFont);
	    }
	    add(letterPanel);
	} catch (IOException e) {
	    System.out.println("Message: " + e);
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	found = false;
	if (e.getSource() == resetButton) {
	    f1.dispose();
	    f1 = new SwingSecretPhrase();
	    f1.setTitle("Secret Phrase");
	    f1.setBounds(200, 200, 900, 300);
	    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f1.setVisible(true);
	} else {
	    for (int i = 0; i < letterArray.length; i++) {
		if (e.getSource() == letterArray[i]) {
		    char letter = letterArray[i].getText().charAt(0);
		    letterArray[i].setEnabled(false);
		    for (int j = 0; j < phrase.length(); j++) {
			if (Character.toUpperCase(phrase.charAt(j)) == letter) {
			    ((JTextField) inputList.get(j)).setText(Character.toString(letter));
			    numCorrect++;
			    found = true;
			}
		    }
		}
	    }
	    if (found == false) {
		incorrectAttempts++;
		attemptsLabel.setText("Attempts: " + incorrectAttempts);
	    }
	    if (numCorrect == phrase.length()) {
		for (int j = 0; j < letterArray.length; j++) {
		    letterArray[j].setEnabled(false);
		}
		JOptionPane.showMessageDialog(null, "You Uncovered the Secret Phrase", "Success!",
			JOptionPane.INFORMATION_MESSAGE);
	    }
	}
    }

    public static void main(String[] args) {
	f1 = new SwingSecretPhrase();
	f1.setTitle("Secret Phrase");
	f1.setBounds(200, 200, 900, 300);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f1.setVisible(true);
    }
}