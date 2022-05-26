package chapter13Test;

import java.awt.*;
import java.awt.event.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class DuckyDynasty extends JFrame implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static DuckyDynasty f1;
    final String ID_FORMAT = "000";
    final String NAME_FORMAT = "          ";
    final String COLOR_FORMAT = "         ";
    final String SNACK_FORMAT = "          ";
    final String DELIMITER = ",";
    String fileString = ID_FORMAT + DELIMITER + NAME_FORMAT + DELIMITER + COLOR_FORMAT + DELIMITER + SNACK_FORMAT;
    final int recordSize = fileString.length();
    String duckyID;
    String duckyName;
    String duckyColor;
    String duckySnack;
    JButton submitButton = new JButton("Submit");
    JButton viewDuckiesButton = new JButton("View Duckies");
    JTextField idBox = new JTextField(10);
    JTextField nameBox = new JTextField(10);
    JTextField colorBox = new JTextField(10);
    JTextField snackBox = new JTextField(10);
    JLabel idLabel = new JLabel("Enter ducky ID");
    JLabel nameLabel = new JLabel("Enter ducky name");
    JLabel colorLabel = new JLabel("Enter ducky color");
    JLabel snackLabel = new JLabel("Enter ducky snack");
    JPanel buttonPanel = new JPanel();
    JPanel labelPanel = new JPanel();
    JPanel boxPanel = new JPanel();
    static Path ducksFile = Paths.get("C:\\Java\\Chapter13\\Duckies.txt");
    boolean isValidDuckyID;

    public DuckyDynasty() {
	submitButton.addActionListener(this);
	viewDuckiesButton.addActionListener(this);
	buttonPanel.add(submitButton);
	buttonPanel.add(viewDuckiesButton);
	buttonPanel.setLayout(new GridLayout(1, 2));
	this.add(buttonPanel, BorderLayout.SOUTH);

	boxPanel.add(idBox);
	boxPanel.add(nameBox);
	boxPanel.add(colorBox);
	boxPanel.add(snackBox);
	boxPanel.setLayout(new GridLayout(4, 1));
	this.add(boxPanel, BorderLayout.WEST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	duckyID = idBox.getText();
	duckyName = nameBox.getText();
	duckyColor = colorBox.getText();
	duckySnack = snackBox.getText();

	if (e.getSource() == submitButton) {
	    while (!isValidDuckyID) {
		try {
		    checkDuckyID(duckyID);
		    isValidDuckyID = true;
		    // String fileString = duckyID + DELIMITER + duckyName + DELIMITER + duckyColor
		    // + DELIMITER
		    // + duckySnack;
		} catch (DuplicateIDException ex) {
		    JOptionPane.showMessageDialog(null, ex.getMessage());
		    isValidDuckyID = false;
		}
	    }
	    // byte[] stringData = fileString.getBytes();
	    // ByteBuffer buffer = ByteBuffer.wrap(stringData);
	} else if (e.getSource() == viewDuckiesButton) {
	    JOptionPane.showMessageDialog(null,
		    "ID #" + duckyID + "\nName: " + duckyName + "\nColor: " + duckyColor + "Snack: " + duckySnack);
	}
    }

    public void checkDuckyID(String id) throws DuplicateIDException {
	if (id == "000") {
	    throw new DuplicateIDException();
	}
    }

    public void createNewFile(Path path, String fileString) {
	try {
	    int recordAmount = 100;
	    OutputStream outStream = new BufferedOutputStream(Files.newOutputStream(path, CREATE));
	    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outStream));
	    for (int i = 0; i < recordAmount; i++)
		writer.write(fileString, 0, recordSize);
	    writer.close();
	} catch (Exception ex) {
	    JOptionPane.showMessageDialog(null, ex);
	}
    }

    public static void main(String[] args) {
	try {
	    Files.newOutputStream(ducksFile, CREATE);
	} catch (IOException e) {
	    JOptionPane.showMessageDialog(null, e);
	}
	f1 = new DuckyDynasty();
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setTitle("Input Duckies");
	f1.setBounds(0, 0, 600, 300);
	f1.setVisible(true);
    }

}
