/*MakeCretures.java
 * Cooper Cross
 * 10/5/21
 */
package chapter10Test;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class MakeCreatures extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JFrame addInfoFrame;
    JPanel buttonPanel = new JPanel();
    JPanel createButtonPanel = new JPanel();
    JPanel infoPanel = new JPanel();
    JPanel addInfoPanel = new JPanel();
    JButton antButton = new JButton("Ant");
    JButton duckButton = new JButton("Duck");
    JButton unicornButton = new JButton("Unicorn");
    JButton createCreature = new JButton("Create Creature");
    JCheckBox optionBox = new JCheckBox();
    JLabel nameLabel = new JLabel("Enter name: ");
    JLabel colorLabel = new JLabel("Enter color: ");
    JLabel priceLabel = new JLabel("Enter price: ");
    JTextField nameField = new JTextField(5);
    JTextField colorField = new JTextField(5);
    JTextField priceField = new JTextField(5);
    static MakeCreatures f1;
    String creature;

    public MakeCreatures() {
	antButton.addActionListener(this);
	duckButton.addActionListener(this);
	unicornButton.addActionListener(this);
	buttonPanel.add(antButton, BorderLayout.NORTH);
	buttonPanel.add(duckButton, BorderLayout.CENTER);
	buttonPanel.add(unicornButton, BorderLayout.SOUTH);
	this.add(buttonPanel);

	createButtonPanel.add(createCreature);
	createCreature.addActionListener(this);
	infoPanel.add(nameLabel, BorderLayout.NORTH);
	infoPanel.add(colorLabel, BorderLayout.CENTER);
	infoPanel.add(priceLabel, BorderLayout.SOUTH);
	addInfoPanel.add(nameField, BorderLayout.NORTH);
	addInfoPanel.add(colorField, BorderLayout.CENTER);
	addInfoPanel.add(priceField, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == antButton) {
	    creature = "ant";
	    optionBox.setText("Alive");
	    f1.setVisible(false);
	    addInfoFrame = new JFrame();
	    addInfoFrame.setTitle("Ant");
	    addInfoFrame.setBounds(200, 200, 450, 300);
	    addInfoFrame.getContentPane().add(infoPanel, BorderLayout.WEST);
	    addInfoFrame.getContentPane().add(addInfoPanel, BorderLayout.EAST);
	    addInfoFrame.getContentPane().add(createButtonPanel, BorderLayout.NORTH);
	    addInfoFrame.setVisible(true);
	} else if (e.getSource() == duckButton) {
	    creature = "duck";
	    optionBox.setText("Noise");
	    f1.setVisible(false);
	    addInfoFrame = new JFrame();
	    addInfoFrame.setTitle("Duck");
	    addInfoFrame.setBounds(200, 200, 450, 300);
	    addInfoFrame.getContentPane().add(infoPanel, BorderLayout.WEST);
	    addInfoFrame.getContentPane().add(addInfoPanel, BorderLayout.EAST);
	    addInfoFrame.getContentPane().add(createButtonPanel, BorderLayout.NORTH);
	    addInfoFrame.setVisible(true);
	} else if (e.getSource() == unicornButton) {
	    creature = "unicorn";
	    optionBox.setText("Has wings");
	    f1.setVisible(false);
	    addInfoFrame = new JFrame();
	    addInfoFrame.setTitle("Unicorn");
	    addInfoFrame.setBounds(200, 200, 450, 300);
	    addInfoFrame.getContentPane().add(infoPanel, BorderLayout.WEST);
	    addInfoFrame.getContentPane().add(addInfoPanel, BorderLayout.EAST);
	    addInfoFrame.getContentPane().add(createButtonPanel, BorderLayout.NORTH);
	    addInfoFrame.setVisible(true);
	} else if (e.getSource() == createCreature) {
	    addInfoFrame.setVisible(false);

	    if (creature == "ant") {
		Ant smithsAnt = new Ant();
		smithsAnt.setName(nameField.getText());
		smithsAnt.setColor(colorField.getText());
		smithsAnt.setPrice(Double.parseDouble(priceField.getText()));
	    } else if (creature == "duck") {

	    } else if (creature == "unicorn") {

	    }
	}
    }

    public static void main(String[] args) {
	f1 = new MakeCreatures();
	f1.setTitle("Mrs. Smith's Creatures");
	f1.setBounds(100, 100, 500, 200);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);

    }
}
