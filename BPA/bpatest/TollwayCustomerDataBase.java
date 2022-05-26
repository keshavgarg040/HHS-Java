package bpatest;

/**
 *  Contestant 00060151
 */

import java.util.*;
import java.text.DecimalFormat; //You can also use other formatting methodology
import java.util.Locale;
import java.util.Random; //You can also use other random number generation tactics

@SuppressWarnings("unused")
public class TollwayCustomerDataBase {
    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat moneyFormat = new DecimalFormat("$###0.00");

    public static void main(String args[]) {

//Pre loaded Address data: pass these into the Customer constructor
//"Montana","Jose", "Ford", "F150", "ABC-123", 55.00

//Pre loaded Address data: pass these into the MailingAddress constructor, and this object is stored as a field
//in the Customer object
//"3445 Rockhill Rd.", "Santa Fe", "New Mexico", "77777"
	String userAnswer;
	MailingAddress customerAddress = new MailingAddress("3445 Rockhill Rd.", "Santa Fe", "New Mexico", "77777");
	Customer customer = new Customer("Montana", "Jose", "Ford", "F150", "ABC-123", 55.00);

    }

//Prompts the user to submit a deposit: calls other helper methods //////////////////////////////////////
    private static void setDepositCustomerRecord(Customer c) {

    }

//Creates and stores the reference ID (random letters and numbers) //////////////////////////////////////
//helper method
    private static void setReferenceID(Customer c) {
	char randChar = 0;
	String referenceID = new String();

	referenceID += (int) (Math.random() * 9000000) + 1000000;

	for (int i = 0; i < 3; i++) {
	    do {
		randChar += (char) ((int) Math.random() * 26) + 'A';
	    } while (randChar == 'O');
	    referenceID += randChar;
	}
    }

//Displays the message in console after a successful deposit entry //////////////////////////////////////
//helper method
    private static String getDepositMessage(Customer c) {
	String depositString = null;
	return depositString;
    }

//Gets the user input for the yes or no prompts and turns it into LC //////////////////////////////////////
//helper method
    private static String getUserStringInput() {
	String stringUserInput;
	stringUserInput = keyboard.nextLine().toLowerCase();
	return stringUserInput;
    }

//Gets the user input for the deposit prompt //////////////////////////////////////
//helper method
    private static double getUserNumberInput() {
	double doubleUserInput = 0;
	do {
	    System.out.print("Please enter a value between $1.00 and $9,999.99: ");
	    try {
		doubleUserInput = keyboard.nextDouble();
		doubleUserInput = (int) (doubleUserInput * 100);
		doubleUserInput = (double) (doubleUserInput / 100);
	    } catch (InputMismatchException ex) {
		System.out.println("\nPlease enter a valid amount");
	    } finally {
		keyboard.nextLine();
	    }
	} while (doubleUserInput < 1.00 || doubleUserInput > 9999.99);
	return doubleUserInput;
    }

//Prints the final record to the console by using data from the object //////////////////////////////////////
    private static void consoleRecordCheck(Customer c) {
	System.out.print(c.getFN() + " " + c.getLN() + "\n" + c.address.getAdd() + "\n ");
    }
}