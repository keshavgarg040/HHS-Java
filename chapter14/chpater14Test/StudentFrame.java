// StudentFrame.java
// Cooper Cross
// 3/4/2022

package chpater14Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentFrame extends JFrame implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JButton addStudent = new JButton("Add Student");
    JButton mainMenu = new JButton("Main Menu");
    JLabel fnLabel = new JLabel("First Name");
    JLabel lnLabel = new JLabel("Last Name");
    JLabel gradeLabel = new JLabel("Grade");
    JTextField fnField = new JTextField();
    JTextField lnField = new JTextField();
    JTextField gradeField = new JTextField();
    JPanel fieldsPanel = new JPanel(new FlowLayout());

    public StudentFrame() {
	addStudent.addActionListener(this);
	mainMenu.addActionListener(this);

	this.add(addStudent);
	this.add(mainMenu);
	fieldsPanel.add(fnLabel);
	fieldsPanel.add(lnLabel);
	fieldsPanel.add(gradeLabel);
	fieldsPanel.add(fnField);
	fieldsPanel.add(lnField);
	fieldsPanel.add(gradeField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

    }

}
