// ViewFrame.java
// Cooper Cross
// 3/4/2022

package chpater14Test;

import java.awt.event.*;
import javax.swing.*;

public class ViewFrame extends JFrame implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JButton viewStudents = new JButton("View Students");
    JButton viewEquip = new JButton("View Equipment");
    JButton mainMenu = new JButton("Main Menu");
    JPanel viewPanel = new JPanel();

    public ViewFrame() {
	viewStudents.addActionListener(this);
	viewEquip.addActionListener(this);
	mainMenu.addActionListener(this);
	viewPanel.add(viewStudents);
	viewPanel.add(viewEquip);
	viewPanel.add(mainMenu);
	this.add(viewPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

    }

}
