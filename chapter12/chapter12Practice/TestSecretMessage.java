// TestSecretMessage.java
// Cooper Cross
// 11/9/21

package chapter12Practice;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TestSecretMessage extends JFrame implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    JLabel emLabel = new JLabel("Your encrypted/decrypted message: ");
    JTextArea messArea = new JTextArea();
    JButton eButton = new JButton("Encrypt");
    JButton enButton = new JButton("Store Encrypted Message");
    JButton dButton = new JButton("Decrypt");
    JButton deButton = new JButton("Decrypt Stored Message");
    JButton viewButton = new JButton("View Message");
    JPanel messPanel = new JPanel(new GridLayout(1, 2));
    JPanel buttonPanel = new JPanel();
    SecretMessage[] messArray;
    int messNum = 0, enNum = 0, viewNum = 0;
    boolean found;
    String deMess, enMess, codedMess = new String();

    public TestSecretMessage() {
	this.setLayout(new BorderLayout());
	messPanel.add(emLabel);
	emLabel.setForeground(Color.yellow);
	messPanel.add(messArea);
	messPanel.setBackground(new Color(133, 75, 255));

	buttonPanel.setLayout(new GridLayout(1, 5));
	eButton.addActionListener(this);
	enButton.addActionListener(this);
	dButton.addActionListener(this);
	deButton.addActionListener(this);
	viewButton.addActionListener(this);

	eButton.setBackground(Color.red);
	enButton.setBackground(Color.orange);
	dButton.setBackground(Color.yellow);
	deButton.setBackground(Color.green);
	viewButton.setBackground(Color.blue);

	eButton.setForeground(Color.yellow);
	enButton.setForeground(Color.green);
	dButton.setForeground(Color.blue);
	deButton.setForeground(Color.red);
	viewButton.setForeground(Color.orange);

	buttonPanel.add(eButton);
	buttonPanel.add(enButton);
	buttonPanel.add(dButton);
	buttonPanel.add(deButton);
	buttonPanel.add(viewButton);

	this.add(buttonPanel, BorderLayout.NORTH);
	this.add(messPanel, BorderLayout.CENTER);

	getMessageNumber();
    }

    public void getMessageNumber() {
	try {
	    messArray = new SecretMessage[Integer
		    .parseInt(JOptionPane.showInputDialog("How many messages do you want to store: "))];
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Please input a valid number.", "Number Error",
		    JOptionPane.ERROR_MESSAGE);
	    getMessageNumber();
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	codedMess = new String();
	if (e.getSource() == eButton) {
	    try {
		enMess = JOptionPane.showInputDialog("Input your message:");
		enNum = Integer.parseInt(JOptionPane.showInputDialog("What number do you want to use to encrypt: "));
		for (int i = 0; i < enMess.length(); i++) {
		    codedMess += (char) (enMess.charAt(i) + enNum);
		}
		messArea.setText(codedMess);
	    } catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(null, "Please input a valid number.");
	    }
	} else if (e.getSource() == enButton) {
	    try {
		messArray[messNum] = new SecretMessage(JOptionPane.showInputDialog("Input your message"),
			Integer.parseInt(JOptionPane.showInputDialog("What number do you wan to use to encrypt")));
		messArray[messNum].setCodedMess();
		messArea.setText(messArray[messNum].getCodedMess());
		messNum++;
	    } catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(null, "Please input a void number.", "Number Error",
			JOptionPane.ERROR_MESSAGE);
	    } catch (ArrayIndexOutOfBoundsException ex) {
		JOptionPane.showMessageDialog(null, "You exceeded your number of messages.", "Message Error",
			JOptionPane.ERROR_MESSAGE);
		enButton.setEnabled(false);
	    }
	} else if (e.getSource() == dButton) {
	    try {
		deMess = JOptionPane.showInputDialog("Input the message to decrypt:");
		enNum = Integer.parseInt(JOptionPane.showInputDialog("What number do you want to use to decrypt:"));
		for (int i = 0; i < deMess.length(); i++) {
		    codedMess += (char) (deMess.charAt(i) - enNum);
		}
		messArea.setText(codedMess);
	    } catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(null, "Please input a valid number.", "Number Error",
			JOptionPane.ERROR_MESSAGE);
	    }
	} else if (e.getSource() == deButton) {
	    try {
		found = false;
		deMess = JOptionPane.showInputDialog("Input the message to decrypt: ");
		for (int i = 0; i < messArray.length; i++) {
		    if (messArray[i].getCodedMess().equals(deMess)) {
			messArea.setText(messArray[i].getOrigMess());
			found = true;
			i = messArray.length;
		    }
		}
		if (!found) {
		    throw new NullPointerException();
		}
	    } catch (NullPointerException ex) {
		JOptionPane.showMessageDialog(null, "Message not found.");
	    }
	} else if (e.getSource() == viewButton) {
	    try {
		viewNum = Integer.parseInt(JOptionPane.showInputDialog("Input number of messages to view: ")) - 1;
	    } catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(null, "Please input a valid number.");
	    } catch (NullPointerException ex) {
		JOptionPane.showMessageDialog(null, "Please input a valid message number.");
	    } catch (ArrayIndexOutOfBoundsException ex) {
		JOptionPane.showMessageDialog(null,
			"You picked a number higher than the number of" + " secret messages avaliable.");
	    }
	}
    }

    public static void main(String[] args) {
	TestSecretMessage f1 = new TestSecretMessage();
	f1.setTitle("Message Encoder");
	f1.setBounds(5, 5, 950, 100);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
    }
}