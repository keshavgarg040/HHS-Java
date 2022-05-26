package chapter13Programs;

import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;

public class CreateCustomerFile {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Path file = Paths.get("C:\\Java\\Chapter.13\\Customers.txt");
	String s = "000,      ,00000" + System.getProperty("line.separator");
	String delimiter = ",";
	String[] array = new String[3];
	byte data[] = s.getBytes();
	ByteBuffer buffer = ByteBuffer.wrap(data);
	FileChannel fc = null;
	final int RECSIZE = s.length();
	final int NUMRECS = 1000;
	final String QUIT = "999";
	String customerString;
	int customerNum;
	String name;
	String zipCode;
	String fileNum;
	try {
	    OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
	    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
	    for (int i = 0; i < NUMRECS; i++)
		writer.write(s, 0, s.length());
	    writer.close();
	} catch (Exception e) {
	    System.out.println("Error message: " + e);
	}
	try {
	    fc = (FileChannel) Files.newByteChannel(file, READ, WRITE);

	    System.out.print("Enter customer number or " + QUIT + " to quit: ");
	    customerString = input.nextLine();
	    while (!(customerString.equals(QUIT))) {
		customerNum = Integer.parseInt(customerString);
		buffer = ByteBuffer.wrap(data);
		fc.position(customerNum * RECSIZE);
		fc.read(buffer);
		s = new String(data);
		array = s.split(delimiter);
		fileNum = array[0];
		if (!(fileNum.equals("000")))
		    System.out.println("Sorry - customer " + customerString + " already exists");
		else {
		    System.out.print("Enter name for customer #" + customerNum + ": ");
		    name = input.nextLine();
		    StringBuilder sb = new StringBuilder(name);
		    sb.append("      ");
		    sb.setLength(6);
		    name = sb.toString();
		    System.out.print("Enter zip code: ");
		    zipCode = input.nextLine();
		    s = customerString + delimiter + name + delimiter + zipCode + System.getProperty("line.separator");
		    data = s.getBytes();
		    buffer = ByteBuffer.wrap(data);
		    fc.position(customerNum * RECSIZE);
		    fc.write(buffer);
		}

		System.out.print("Enter next customer number or " + QUIT + " to quit: ");
		customerString = input.nextLine();
	    }
	    fc.close();
	} catch (Exception e) {
	    System.out.println("Error message: " + e);
	}

	input.close();
    }
}