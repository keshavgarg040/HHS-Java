package chapter01_02test;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomEvenOdd {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	int randNum = 1 + (int) (Math.random() * 100);
	// System.out.println(randNum);
	System.out.print("Enter a number between 1 and 100 inclusive: ");
	int numberGuess = input.nextInt();

	if (randNum % 2 == 0) {
	    JOptionPane.showMessageDialog(null, "The random number is even.");
	} else {
	    JOptionPane.showMessageDialog(null, "The random number is odd.");
	}

	if (numberGuess == randNum) {
	    JOptionPane.showMessageDialog(null, "You guessed the correct number! The number was " + randNum);
	} else {
	    JOptionPane.showMessageDialog(null, "Your guess was incorrect. The correct number was " + randNum);
	}

    }

}
