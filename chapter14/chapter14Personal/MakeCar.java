// MakeCar.java
// Cooper Cross
// 2/16/22

package chapter14Personal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MakeCar extends JFrame implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static MakeCar f1;
    ButtonGroup typeGroup = new ButtonGroup();
    JCheckBox muscleBox = new JCheckBox();
    JCheckBox sportsBox = new JCheckBox();
    JCheckBox superBox = new JCheckBox();
    JCheckBox hyperBox = new JCheckBox();
    JPanel typePanel = new JPanel(new GridBagLayout());
    JLabel muscleLabel = new JLabel("Muscle Car");
    JLabel sportsLabel = new JLabel("Sports Car");
    JLabel superLabel = new JLabel("Supercar");
    JLabel hyperLabel = new JLabel("Hypercar");
    JButton nextButton = new JButton("Next");
    Boolean typeIsSelected = false;

    public MakeCar() {
	typeGroup.add(hyperBox);
	typeGroup.add(muscleBox);
	typeGroup.add(sportsBox);
	typeGroup.add(superBox);
	typePanel.add(muscleLabel);
	typePanel.add(sportsLabel);
	typePanel.add(superLabel);
	typePanel.add(hyperLabel);
	typePanel.add(hyperBox);
	typePanel.add(muscleBox);
	typePanel.add(sportsBox);
	typePanel.add(superBox);
	typePanel.add(nextButton);
	this.add(typePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

    }

    public static void main(String[] args) {
	f1 = new MakeCar();
	f1.setTitle("Make Your Car");
	f1.setBounds(100, 100, 500, 200);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
	System.out.println(isEven(2));
	System.out.println(isEven(3));
    }

    public static boolean isEven(int num) {
	if (num % 2 == 0)
	    return true;
	else
	    return false;
    }

}
