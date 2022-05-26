/*DuckieFrame.java
 * Cooper Cross
 * 9/13/21
 */

package chapter10Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DuckieFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    Color[] colorsArray = { Color.green, Color.pink, Color.yellow, Color.red, Color.orange };
    String[] colorsStringArray = { "Green", "Pink", "Yellow", "Red", "Orange" };
    JComboBox<String> colorBox = new JComboBox<String>(colorsStringArray);
    JLabel colorLabel = new JLabel("Pick duck color: ", JLabel.RIGHT);
    JLabel nameLabel = new JLabel("Enter duck name: ", JLabel.RIGHT);
    JLabel sizeLabel = new JLabel("Enter duck size: ", JLabel.RIGHT);
    JTextField nameField = new JTextField(25);
    JTextField sizeField = new JTextField();
    JButton duckButton = new JButton("Press for Duck");
    JButton rDuckButton = new JButton("Press for Rubber Duck");
    JButton iDuckButton = new JButton("Press for Inflatable Duck");
    JPanel duckInfoPanel = new JPanel(new GridLayout(3, 2));
    JPanel buttonPanel = new JPanel();
    Duck myDuck;

    public DuckieFrame() {
	duckInfoPanel.add(colorLabel);
	duckInfoPanel.add(colorBox);
	duckInfoPanel.add(nameLabel);
	duckInfoPanel.add(nameField);
	duckInfoPanel.add(sizeLabel);
	duckInfoPanel.add(sizeField);

	duckButton.addActionListener(this);
	rDuckButton.addActionListener(this);
	iDuckButton.addActionListener(this);
	buttonPanel.add(duckButton);
	buttonPanel.add(rDuckButton);
	buttonPanel.add(iDuckButton);

	this.add(duckInfoPanel, BorderLayout.CENTER);
	this.add(buttonPanel, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == rDuckButton) {
	    String material = JOptionPane.showInputDialog("Input the material duck is made of: ");
	    myDuck = new RubberDuck(colorsArray[colorBox.getSelectedIndex()], nameField.getText(),
		    Integer.parseInt(sizeField.getText()), material);
	    JOptionPane.showMessageDialog(null, "Color: " + colorBox.getSelectedItem() + "\nName: " + myDuck.getName()
		    + "\nSize: " + myDuck.getSize() + "\nMaterial: " + ((RubberDuck) myDuck).getMaterial());
	} else if (e.getSource() == iDuckButton) {
	    int airLevel = Integer.parseInt(JOptionPane.showInputDialog("Input the air level: "));
	    myDuck = new InflatableDuck(colorsArray[colorBox.getSelectedIndex()], nameField.getText(),
		    Integer.parseInt(sizeField.getText()), airLevel);
	    JOptionPane.showMessageDialog(null, "Color: " + colorBox.getSelectedItem() + "\nName: " + myDuck.getName()
		    + "\nSize: " + myDuck.getSize() + "\nAir Level: " + ((InflatableDuck) myDuck).getAirLevel());
	} else {
	    myDuck = new Duck(colorsArray[colorBox.getSelectedIndex()], nameField.getText(),
		    Integer.parseInt(sizeField.getText()));
	    JOptionPane.showMessageDialog(null, "Color: " + colorBox.getSelectedItem() + "\nName: " + myDuck.getName()
		    + "\nSize: " + myDuck.getSize());
	}
    }

    public static void main(String[] args) {
	DuckieFrame f1 = new DuckieFrame();
	f1.setTitle("Duck Duck Duck");
	f1.setBounds(100, 100, 500, 200);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
    }
}
