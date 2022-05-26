package chapter02;

import java.util.Scanner;

public class MinutesConversion {
    private static Scanner input;

    public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.print("Please enter amount of minutes: ");
	double amountMinutes = input.nextInt();
	double amountHours = (amountMinutes / 60);
	double amountDays = (amountHours / 24);
	System.out.println("Amount in Hours: " + amountHours);
	System.out.println("Amount in Days: " + amountDays);
    }

}
