// EquipmentFrame.java
// Cooper Cross
// 3/4/2022

package chpater14Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EquipmentFrame extends JFrame implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JButton addEquip = new JButton("Add Equipment");
    JButton mainMenu = new JButton("Main Menu");
    JLabel itemLabel = new JLabel("Item");
    JLabel descLabel = new JLabel("Description");
    JLabel costLabel = new JLabel("Cost");
    JTextField itemField = new JTextField();
    JTextField descField = new JTextField();
    JTextField costField = new JTextField();
    JPanel fieldsPanel = new JPanel(new FlowLayout());

    public EquipmentFrame() {
	addEquip.addActionListener(this);
	mainMenu.addActionListener(this);
	fieldsPanel.add(addEquip);
	fieldsPanel.add(mainMenu);
	fieldsPanel.add(itemLabel);
	fieldsPanel.add(descLabel);
	fieldsPanel.add(costLabel);
	fieldsPanel.add(itemField);
	fieldsPanel.add(descField);
	fieldsPanel.add(costField);
	// this.add(buttonPanel);
	this.add(fieldsPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

    }

}
