// Calculator.java
// Cooper Cross
// 2/9/22

package chapter14Practice;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JButton keys[] = new JButton[17];
    String[] operatorKeys = { "/", "*", "-", "+", "=", ".", "CLEAR" };
    JPanel keypad = new JPanel(new GridLayout(4, 4, 10, 10));
    JTextField lcd = new JTextField(20);
    Font bigFont = new Font("HoboSTD", Font.BOLD, 25);
    Font funFont = new Font("Chiller", Font.BOLD, 30);
    double op1 = 0.0, op2 = 0.0;
    boolean first = true, clearText = true;
    int lastOp = 0;
    DecimalFormat calcPattern = new DecimalFormat("########.#########");

    public Calculator() {
	lcd.setEditable(false);
	lcd.setBackground(Color.WHITE);

	// construct and assign captions to the Buttons
	for (int i = 0; i <= 9; i++)
	    keys[i] = new JButton(String.valueOf(i));

	for (int i = 10; i <= 16; i++)
	    keys[i] = new JButton(operatorKeys[i - 10]);

	for (int i = 7; i <= 10; i++) // 7, 8, 9, and divide
	    keypad.add(keys[i]);

	for (int i = 4; i <= 6; i++) // 4, 5, and 6
	    keypad.add(keys[i]);

	keypad.add(keys[11]);

	for (int i = 1; i <= 3; i++) // 1, 2, and 3
	    keypad.add(keys[i]);

	keypad.add(keys[12]); // subtract
	keypad.add(keys[0]); // 0

	for (int i = 15; i >= 13; i--) // ., =, and +
	    keypad.add(keys[i]);

	for (int i = 0; i < keys.length; i++) {
	    keys[i].setBackground(new Color(245, 245, 235));
	    keys[i].setForeground(new Color(191, 87, 0));
	    keys[i].addActionListener(this);
	    keys[i].setFont(funFont);
	}

	keypad.setBackground(Color.WHITE);
	add(lcd, BorderLayout.NORTH);
	add(keypad, BorderLayout.CENTER);
	add(keys[16], BorderLayout.SOUTH);

    }

    static Calculator f1;

    @Override
    public void actionPerformed(ActionEvent e) {
	// search for clicked key
	for (int i = 0; i < keys.length; i++) {
	    if (e.getSource() == keys[i]) {
		keyAction(i);
		i = keys.length;
	    }
	}
    }

    public void keyAction(int keyNum) {
	switch (keyNum) {
	// number and decimal point buttons
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 15:
	    if (clearText) {
		lcd.setText("");
		clearText = false;
	    }
	    lcd.setText(lcd.getText() + keys[keyNum].getText());
	    break;
	// operator buttons
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	    clearText = true;
	    if (first) { // first operand
		if (lcd.getText().length() == 0) {
		    op1 = 0.0;
		} else {
		    op1 = Double.parseDouble(lcd.getText());
		}
		first = false;
		clearText = true;
		lastOp = keyNum; // save last operator
	    } else { // second operand
		op2 = Double.parseDouble(lcd.getText());
		switch (lastOp) {
		case 10: // divide button
		    op1 /= op2;
		    break;
		case 11: // multiply button
		    op1 *= op2;
		    break;
		case 12: // subtract button
		    op1 -= op2;
		    break;
		case 13: // add button
		    op1 += op2;
		    break;
		}
		lcd.setText(calcPattern.format(op1));
		clearText = true;
		if (keyNum == 14) {
		    first = true; // equal button
		} else {
		    lastOp = 1; // save last operator
		}
	    }
	    break;
	// clear button
	case 16:
	    lcd.setText("");
	    break;
	}
    }

    public static void main(String[] args) {
	f1 = new Calculator();
	f1.setTitle("Calculator");
	f1.setBounds(200, 200, 300, 350);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
	// set image properties and add to frame
	Image icon = Toolkit.getDefaultToolkit().getImage("ecksdee.gif");
	f1.setIconImage(icon);
    }

}
