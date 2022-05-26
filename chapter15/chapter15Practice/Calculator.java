/*
 * Calculator.java
 * Cooper Cross
 * 2/15/22
 */
package chapter15Practice;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JButton keys[] = new JButton[17];
    String[] operatorKeys = { "/", "*", "-", "+", "=", ".", "CLEAR" };
    JPanel keypad = new JPanel(new GridLayout(4, 4, 10, 10));
    JTextField lcd = new JTextField(20);
    Font bigFont = new Font("HoboSTD", Font.BOLD, 25);
    Font funFont = new Font("Chiller", Font.BOLD, 30);
    double op1 = 0.0, op2 = 0.0;
    boolean first = true, clearText = true, rightClickFlag = false;
    int lastOp = 0;
    DecimalFormat calcPattern = new DecimalFormat("########.########");
    JMenuBar mBar;
    JMenu mFile, mEdit, mAbout;
    static Calculator f1;

    public Calculator() {
	// create an instance of the menubar
	mBar = new JMenuBar();
	setJMenuBar(mBar);
	// construct and populate the File menu
	mFile = new JMenu("File", true);
	mBar.add(mFile);
	JMenuItem mFileExit = new JMenuItem("Exit");
	mFile.add(mFileExit);
	// construct and populate the Edit menu
	mEdit = new JMenu("Edit", true);
	mBar.add(mEdit);
	JMenuItem mEditClear = new JMenuItem("Clear");
	mEdit.add(mEditClear);
	mEdit.insertSeparator(1);
	JMenuItem mEditCopy = new JMenuItem("Copy");
	mEdit.add(mEditCopy);
	JMenuItem mEditPaste = new JMenuItem("Paste");
	mEdit.add(mEditPaste);
	mEdit.insertSeparator(4);
	JMenu mEditTextColor = new JMenu("Color");
	mEdit.add(mEditTextColor);
	JMenuItem mEditTextColorRed = new JMenuItem("Red");
	mEditTextColor.add(mEditTextColorRed);
	JMenuItem mEditTextColorGreen = new JMenuItem("Green");
	mEditTextColor.add(mEditTextColorGreen);
	JMenuItem mEditTextColorMagenta = new JMenuItem("Magenta");
	mEditTextColor.add(mEditTextColorMagenta);
	// construct and populate the About menu
	mAbout = new JMenu("About", true);
	mBar.add(mAbout);
	JMenuItem mAboutCalculator = new JMenuItem("About Calculator");
	mAbout.add(mAboutCalculator);
	// add the ActionListener to each menu item
	mFileExit.addActionListener(this);
	mEditClear.addActionListener(this);
	mEditCopy.addActionListener(this);
	mEditPaste.addActionListener(this);
	mEditTextColorRed.addActionListener(this);
	mEditTextColorGreen.addActionListener(this);
	mEditTextColorMagenta.addActionListener(this);
	mAboutCalculator.addActionListener(this);
	// set ActionCommand for each menu item
	mFileExit.setActionCommand("Exit");
	mEditClear.setActionCommand("Clear");
	mEditCopy.setActionCommand("Copy");
	mEditPaste.setActionCommand("Paste");
	mEditTextColorRed.setActionCommand("Red");
	mEditTextColorGreen.setActionCommand("Green");
	mEditTextColorMagenta.setActionCommand("Magenta");
	mAboutCalculator.setActionCommand("About");
	// set Mnemonic for each menu and menu item
	mFile.setMnemonic('F');
	mFileExit.setMnemonic('X');
	mEdit.setMnemonic('E');
	mEditClear.setMnemonic('L');
	mEditCopy.setMnemonic('C');
	mEditPaste.setMnemonic('P');
	mEditTextColor.setMnemonic('O');
	mEditTextColorRed.setMnemonic('R');
	mEditTextColorGreen.setMnemonic('G');
	mEditTextColorMagenta.setMnemonic('M');
	mAbout.setMnemonic('A');
	mAboutCalculator.setMnemonic('B');
	lcd.setEditable(false);
	lcd.setBackground(Color.white);
	// construct and assign captions to the Buttons
	for (int i = 0; i <= 9; i++) {
	    keys[i] = new JButton(String.valueOf(i));
	}
	for (int i = 10; i <= 16; i++) {
	    keys[i] = new JButton(operatorKeys[i - 10]);
	}
	for (int i = 7; i <= 10; i++) // 7, 8, 9, divide
	{
	    keypad.add(keys[i]);
	}
	for (int i = 4; i <= 6; i++) // 4, 5, 6
	{
	    keypad.add(keys[i]);
	}
	keypad.add(keys[11]); // multiply
	for (int i = 1; i <= 3; i++) // 1, 2, 3
	{
	    keypad.add(keys[i]);
	}
	keypad.add(keys[12]); // subtract
	keypad.add(keys[0]); // 0 key
	for (int i = 15; i >= 13; i--) // decimal point, =, and (+) keys
	{
	    keypad.add(keys[i]);
	}
	for (int i = 0; i < keys.length; i++) {
	    keys[i].setBackground(new Color(135, 144, 233));
	    keys[i].setForeground(Color.white);
	    keys[i].addActionListener(this);
	    keys[i].setFocusable(false);
	}
	mBar.setBackground(new Color(135, 144, 233));
	lcd.setFocusable(false);
	keypad.setBackground(Color.black);
	add(lcd, BorderLayout.NORTH);
	add(keypad, BorderLayout.CENTER);
	add(keys[16], BorderLayout.SOUTH);
	lcd.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		rightClickFlag = false;
		if (e.getButton() == MouseEvent.BUTTON1) {
		    JOptionPane.showMessageDialog(null, "You can not edit this with the mouse!");
		} else if (e.getButton() == MouseEvent.BUTTON2) {
		    Image icon = Toolkit.getDefaultToolkit().getImage("duck.png");
		    f1.setIconImage(icon);
		} else if (e.getButton() == MouseEvent.BUTTON3) {
		    changeFont(funFont);
		    rightClickFlag = true;
		}
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
		changeColor(new Color(145, 23, 134));
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
		if (!rightClickFlag) {
		    changeFont(bigFont);
		} else {
		    rightClickFlag = false;
		}
	    }
	    // @Override
	    // public void mousePressed(MouseEvent e) {}
	    // @Override
	    // public void mouseReleased(MouseEvent e) {}
	});
	addKeyListener(new KeyAdapter() {
	    public void keyPressed(KeyEvent e) {
		String keyString = new String();
		int key = 0;
		int keyCode = e.getKeyCode();
		int keyLocation = e.getKeyLocation();
		if (keyCode == KeyEvent.VK_EQUALS) {
		    key = 14;
		    keyAction(key);
		} else if (keyLocation == KeyEvent.KEY_LOCATION_NUMPAD && keyCode != KeyEvent.VK_ENTER) {
		    if (keyCode >= KeyEvent.VK_NUMPAD0 && keyCode <= KeyEvent.VK_NUMPAD9) {
			key = Integer.parseInt(keyString + e.getKeyChar());
		    } else {
			switch (keyCode) {
			case KeyEvent.VK_DIVIDE:
			    key = 10;
			    break;
			case KeyEvent.VK_MULTIPLY:
			    key = 11;
			    break;
			case KeyEvent.VK_SUBTRACT:
			    key = 12;
			    break;
			case KeyEvent.VK_ADD:
			    key = 13;
			    break;
			case KeyEvent.VK_DECIMAL:
			    key = 15;
			    break;
			}
		    }
		    keyAction(key);
		}
	    }
	});
	this.setFocusable(true);
    } // end of constructor

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
	    if (lcd.getText().length() != 0) // to stop from pressing operators without numbers
	    {
		clearText = true;
		if (first) // first operand
		{
		    op1 = Double.parseDouble(lcd.getText());
		    first = false;
		    lastOp = keyNum;
		} else // second operand
		{
		    op2 = Double.parseDouble(lcd.getText());
		    switch (lastOp) {
		    case 10: // divide key
			op1 /= op2;
			break;
		    case 11: // multiply key
			op1 *= op2;
			break;
		    case 12: // minus key
			op1 -= op2;
			break;
		    case 13: // plus key
			op1 += op2;
			break;
		    } // end of switch(lastOp)
		    lcd.setText(calcPattern.format(op1));
		    if (keyNum == 14) // = key
		    {
			first = true;
		    } else {
			lastOp = keyNum; // save last operator
		    }
		} // end else
	    } // end of outer if
	    break;
	case 16:
	    lcd.setText("");
	    first = true;
	    break;
	}// end of switch(keyNum)
    }

    public void changeFont(Font newFont) {
	lcd.setFont(newFont);
	for (int i = 0; i < keys.length; i++) {
	    keys[i].setFont(newFont);
	}
	mFile.setFont(newFont);
	mEdit.setFont(newFont);
	mAbout.setFont(newFont);
    }

    public void changeColor(Color newColor) {
	Color menuTextColor;
	lcd.setForeground(newColor);
	for (int i = 0; i < keys.length; i++) {
	    keys[i].setForeground(newColor);
	}
	mBar.setBackground(newColor);
	menuTextColor = new Color(255 - newColor.getRed(), 255 - newColor.getGreen(), 255 - newColor.getBlue());
	mFile.setForeground(menuTextColor);
	mEdit.setForeground(menuTextColor);
	mAbout.setForeground(menuTextColor);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	// test for menu item clicks
	String arg = e.getActionCommand();
	if (arg == "Exit") {
	    System.exit(0);
	} else if (arg == "Clear") {
	    clearText = true;
	    first = true;
	    op1 = 0.0;
	    lcd.setText("");
	    lcd.requestFocus();
	} else if (arg == "Copy") {
	    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	    StringSelection contents = new StringSelection(lcd.getText());
	    cb.setContents(contents, null);
	} else if (arg == "Paste") {
	    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	    Transferable content = cb.getContents(this);
	    try {
		String s = (String) content.getTransferData(DataFlavor.stringFlavor);
		lcd.setText(calcPattern.format(Double.parseDouble(s)));
	    } catch (Throwable exc) {
		lcd.setText("");
	    }
	} else if (arg == "About") {
	    String message = "Calculator ver. 1.0\nOpenExhibitSoftware\nCopyright 2022\nAll rights reserved";
	    JOptionPane.showMessageDialog(null, message, "About Calculator", JOptionPane.INFORMATION_MESSAGE);
	} else if (arg == "Red") {
	    changeColor(Color.red);
	} else if (arg == "Green") {
	    changeColor(Color.green);
	} else if (arg == "Magenta") {
	    changeColor(Color.magenta);
	} else {
	    // search for the clicked key
	    for (int i = 0; i < keys.length; i++) {
		if (e.getSource() == keys[i]) {
		    keyAction(i);
		    i = keys.length;
		} // end of if
	    } // end of for
	} // end of else
    } // end of actionPerformed

    public static void main(String[] args) {
	f1 = new Calculator();
	f1.setTitle("Calculator");
	f1.setBounds(200, 200, 300, 350);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
	// set image properties and add to frame
	Image icon = Toolkit.getDefaultToolkit().getImage("heart.png");
	f1.setIconImage(icon);
    }
}