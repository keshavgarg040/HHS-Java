/**
 * 
 */
package bpapractice;

import java.util.*;
import java.text.*;

public class GiftCardReloader {
    static Scanner input = new Scanner(System.in);
    static DecimalFormat moneyFormat = new DecimalFormat("$##0.00");

    // helper method
    private static String getUserStringInput() {
	String userStringInput;
	// need to check only one case
	userStringInput = input.nextLine().toLowerCase();
	return userStringInput;
    }

    // helper method
    private static double getUserNumberInput() {
	double amount = 0;

	do {
	    System.out.print("Please enter reload value between $5.00 and $100.00");
	    try {
		amount = input.nextDouble();
		amount = (int) (amount * 100);
		amount = (double) (amount / 100);
	    } catch (InputMismatchException ex) {
		System.out.println("\nPlease enter a valid dollar amount");
	    } finally {
		input.nextLine();
	    }
	} while (amount < 5.00 || amount > 100);
	return amount;
    }

    private static String getReloadMessage(CardHolder c) {
	String reloadMessage;
	reloadMessage = "\n" + c.getFirstName() + " " + c.getLastName() + " reloaded the giftcard with "
		+ moneyFormat.format(c.cBal.getBalance()) + ".\nReload ID: " + c.cBal.getReloadID();
	return reloadMessage;
    }

    private static void consoleCardHolderOutput(CardHolder c) {
	System.out.println("\n" + c.getFirstName() + " " + c.getLastName() + "\n" + c.getAddress() + "\nAge: "
		+ c.getAge() + "\nBalance: " + moneyFormat.format(c.cBal.getBalance()) + "\nReload ID: "
		+ c.cBal.getReloadID());
    }

    private static void setCardHolderReloadRecord(CardHolder c) {
	double reloadAmount;

	System.out.print(
		"\nAll gift card reloads require a reload amount. " + "How much will the cardholder be reloading?\n");
	reloadAmount = getUserNumberInput();
	c.cBal.setBalance(reloadAmount);
	setReloadID(c);
	System.out.println(getReloadMessage(c));
    }

    private static void setReloadID(CardHolder c) {
	char randChar;
	String reloadID = new String();

	reloadID += (int) (Math.random() * 9000000) + 1000000;

	for (int i = 0; i < 4; i++) {
	    do {
		randChar = (char) ((int) (Math.random() * 26) + 'A');
	    } while (randChar == 'O' || randChar == 'I');
	    reloadID += randChar;
	}
	c.cBal.setReloadID(reloadID);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	String userAnswer;
	
	CardHolder cardHolder = new CardHolder("Sally","Smith", "155 Oak Rd. \nHelena, MT 59601",25);
	
	cardHolder.cBal = new CardBalance(25.00);
	
	if(cardHolder != null && cardHolder.cBal != null) {
	    System.out.println("CardHolder successfully created.\n");
	}
	
	do {
	    System.out.print("Do you want to reload this gift card? (Yes/No): ");
	    userAnswer = getUserStringInput();
	    if(userAnswer.equals("yes")) {
		setCardHolderReloadRecord(cardHolder);
	    }
	} while(!userAnswer.equals("yes") && !userAnswer.equals("no"));
	
	do {
	    System.out.print("Do you want to retrieve this gift card information? (Yes/No)");
	    userAnswer = getUserStringInput();
	    if(userAnswer.equals("yes")) {
		consoleCardHolderOutput(cardHolder);
	    } else if(userAnswer.equals("no")) {
		System.out.println("\nGoodbye");
		System.exit(0);
	    }
	} while(!userAnswer.equals("yes") && !userAnswer.equals("no"));
    }

}
