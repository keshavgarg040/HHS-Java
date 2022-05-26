// CSFrame.java
// Cooper Cross
// 3/4/2022

package chpater14Test;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class CSFrame extends JFrame implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static CSFrame f1;
    static StudentFrame f2;
    static EquipmentFrame f3;
    static ViewFrame f4;
    JButton addStudentButton = new JButton("Add Student");
    JButton addEquipmentButton = new JButton("Add Equipment");
    JButton viewDatabaseButton = new JButton("View Database");
    JPanel addViewPanel = new JPanel(new GridLayout(3, 1));
    static ArrayList<Equipment> equipmentList = new ArrayList<>();
    static ArrayList<Student> studentList = new ArrayList<>();

    public CSFrame() {
	addStudentButton.addActionListener(this);
	addEquipmentButton.addActionListener(this);
	viewDatabaseButton.addActionListener(this);
	addViewPanel.add(addStudentButton);
	addViewPanel.add(addEquipmentButton);
	addViewPanel.add(viewDatabaseButton);
	this.add(addViewPanel);
    }

    public static void main(String[] args) {
	f1 = new CSFrame();
	f1.setTitle("Computer Science Class");
	f1.setBounds(100, 100, 500, 200);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == addStudentButton) {
	    f1.setVisible(false);
	    f2 = new StudentFrame();
	    f2.setTitle("Add Student");
	    f2.setBounds(100, 100, 500, 200);
	    f2.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    f2.setVisible(true);
	} else if (e.getSource() == addEquipmentButton) {
	    f1.setVisible(false);
	    f3 = new EquipmentFrame();
	    f3.setTitle("Add Equipment");
	    f3.setBounds(100, 100, 500, 200);
	    f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    f3.setVisible(true);
	} else if (e.getSource() == viewDatabaseButton) {
	    f1.setVisible(false);
	    f4 = new ViewFrame();
	    f4.setTitle("View Information");
	    f4.setBounds(100, 100, 500, 200);
	    f4.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    f4.setVisible(true);
	}

    }
}
