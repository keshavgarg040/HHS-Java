package chapter13Programs;

import java.nio.*;
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;
import java.text.*;
import javax.swing.JOptionPane;

public class StudentsStanding {

    final static String ID_FORMAT = "000";
    final static String FIRST_NAME_FORMAT = "          ";
    final static String LAST_NAME_FORMAT = "          ";
    final static int NAME_LENGTH = 10;
    final static String GPA_FORMAT = "0.0";
    final static String delimiter = ",";
    final static String FORMAT_STRING = ID_FORMAT + delimiter + FIRST_NAME_FORMAT + delimiter + LAST_NAME_FORMAT
	    + delimiter + GPA_FORMAT;

    public static void main(String[] args) {
	// creating both empty files
	Path goodStandingFile = Paths.get("C:\\Java\\Chapter13\\goodstanding.txt");
	Path academicProbationFile = Paths.get("C:\\Java\\Chapter13\\academicprobation.txt");
	createEmptyFile(goodStandingFile, FORMAT_STRING);
	createEmptyFile(academicProbationFile, FORMAT_STRING);

	int idNum;
	String firstName;
	String lastName;
	double gpa;
	String recordString;

	idNum = Integer.parseInt(JOptionPane.showInputDialog("Enter student ID number"));
	firstName = JOptionPane.showInputDialog("Enter student first name");
	lastName = JOptionPane.showInputDialog("Enter student last name");
	gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter student GPA"));

	if (gpa >= 2) {
	    try {
		FileChannel goodStandingFC = (FileChannel) Files.newByteChannel(goodStandingFile, CREATE, WRITE);

		// formatting first name input to 10 characters
		StringBuilder fnsb = new StringBuilder(firstName);
		fnsb.setLength(NAME_LENGTH);
		firstName = fnsb.toString();
		// formatting last name input to 10 characters
		StringBuilder lnsb = new StringBuilder(lastName);
		lnsb.setLength(NAME_LENGTH);
		lastName = lnsb.toString();
		// formatting gpa
		DecimalFormat gpadf = new DecimalFormat(GPA_FORMAT);
		gpadf.format(gpa);

		// building record from inputs
		recordString = idNum + delimiter + firstName + delimiter + lastName + delimiter + gpa;

		// turning string into bytes and writing to file
		byte data[] = recordString.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(data);
		goodStandingFC.position(idNum);
		goodStandingFC.write(buffer);

		goodStandingFC.close();
	    } catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
	    }
	} else {
	    try {
		FileChannel academicProbationFC = (FileChannel) Files.newByteChannel(academicProbationFile, CREATE,
			WRITE);

		// formatting first name input to 10 characters
		StringBuilder fnsb = new StringBuilder(firstName);
		fnsb.setLength(NAME_LENGTH);
		firstName = fnsb.toString();
		// formatting last name input to 10 characters
		StringBuilder lnsb = new StringBuilder(lastName);
		lnsb.setLength(NAME_LENGTH);
		lastName = lnsb.toString();
		// formatting gpa
		DecimalFormat gpadf = new DecimalFormat(GPA_FORMAT);
		gpadf.format(gpa);

		// building record from inputs
		recordString = idNum + delimiter + firstName + delimiter + lastName + delimiter + gpa;

		// turning string into bytes and writing to file
		byte data[] = recordString.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(data);
		academicProbationFC.position(idNum);
		academicProbationFC.write(buffer);

		academicProbationFC.close();
	    } catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
	    }
	}
    }

    public static void createEmptyFile(Path file, String s) {
	try {
	    OutputStream outputStr = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
	    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));
	    for (int i = 0; i < 1000; i++) {
		writer.write(s, 0, s.length());
		writer.newLine();
	    }
	    writer.close();
	} catch (Exception e) {
	    System.out.println("Error message: " + e);
	}
    }
}
