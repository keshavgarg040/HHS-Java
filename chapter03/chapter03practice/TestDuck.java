/*  
 *  TestDuck.java
 *  Cooper Cross
 *  2/25/2020
 */

package chapter03practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TestDuck extends JFrame implements ActionListener, ChangeListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JButton addDuckButton = new JButton("Press to Add a Duck");
    JButton textColorButton = new JButton("Press to Pick Text Color");
    JTextField nameField = new JTextField(20);
    JTextField sizeField = new JTextField(5);
    JLabel nameLabel = new JLabel("Enter Duck's Name: ", JLabel.RIGHT);
    JLabel sizeLabel = new JLabel("Enter Duck's Size: ", JLabel.RIGHT);
    JLabel colorLabel = new JLabel("Enter Duck's Color: ", JLabel.RIGHT);
    Color[] colors = { Color.blue, Color.green, Color.pink, Color.red, Color.yellow };
    String[] colorNames = { "blue", "green", "pink", "red", "yellow" };
    JComboBox<String> colorBox = new JComboBox<String>(colorNames);
    JPanel fieldPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    JPanel colorPanel = new JPanel(new FlowLayout());
    JPanel buttonPanel = new JPanel(new FlowLayout());
    JColorChooser panelColorChooser = new JColorChooser(Color.blue);
    Duck duck1;

    public TestDuck() {
	fieldPanel.add(nameLabel);
	fieldPanel.add(nameField);
	fieldPanel.add(sizeLabel);
	fieldPanel.add(sizeField);
	buttonPanel.add(colorLabel);
	buttonPanel.add(colorBox);
	buttonPanel.add(addDuckButton);
	buttonPanel.add(textColorButton);
	addDuckButton.addActionListener(this);
	textColorButton.addActionListener(this);
	colorBox.addActionListener(this);
	colorPanel.add(panelColorChooser);
	panelColorChooser.getSelectionModel().addChangeListener(this);
	getContentPane().add(fieldPanel, BorderLayout.CENTER);
	getContentPane().add(buttonPanel, BorderLayout.NORTH);
	getContentPane().add(colorPanel, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == addDuckButton) {
	    duck1 = new Duck(nameField.getText(), Color.magenta, Integer.parseInt(sizeField.getText()));
	    nameField.setText("");
	    sizeField.setText("");
	    JOptionPane.showMessageDialog(null,
		    "Name: " + duck1.getName() + "\nColor: " + duck1.getDuckColor() + "\nSize: " + duck1.getSize(),
		    "Duckie Info", JOptionPane.ERROR_MESSAGE);
	} else if (e.getSource() == textColorButton) {
	    Color newColor = JColorChooser.showDialog(null, "Pick text color", Color.red);
	    nameLabel.setForeground(newColor);
	    sizeLabel.setForeground(newColor);
	    colorLabel.setForeground(newColor);
	    addDuckButton.setForeground(newColor);
	    textColorButton.setForeground(newColor);
	} else if (e.getSource() == colorBox) {
	    int index = colorBox.getSelectedIndex();
	    duck1.setDuckColor(colors[index]);
	    JOptionPane.showMessageDialog(null,
		    "Name: " + duck1.getName() + "\nColor " + duck1.getDuckColor() + "\nSize: " + duck1.getSize(),
		    "Duckie Info", JOptionPane.ERROR_MESSAGE);

	}
    }

    public void stateChanged(ChangeEvent e) {
	Color newColor = panelColorChooser.getColor();
	fieldPanel.setBackground(newColor);
	colorPanel.setBackground(newColor);
	buttonPanel.setBackground(newColor);
    }

    public static void main(String[] args) {
	TestDuck f1 = new TestDuck();
	f1.setTitle("Add a Duck");
	f1.setBounds(100, 100, 700, 500);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
    }

}
