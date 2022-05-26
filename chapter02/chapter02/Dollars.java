package chapter02;

import java.util.Scanner;

public class Dollars {
    private static Scanner input;

    public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.print("Enter amount of money: ");
	int dollars = input.nextInt();
	int twenties = (dollars / 20);
	int twentiesRemainder = (dollars % 20);
	int tens = (twentiesRemainder / 10);
	int tensRemainder = (twentiesRemainder % 10);
	int fives = (tensRemainder / 5);
	int fivesRemainder = (tensRemainder % 5);
	int ones = (fivesRemainder / 1);
	System.out.println("Amount of twenties: " + twenties);
	System.out.println("Amount of tens: " + tens);
	System.out.println("Amount of fives: " + fives);
	System.out.println("Amount of ones: " + ones);

    }

}
