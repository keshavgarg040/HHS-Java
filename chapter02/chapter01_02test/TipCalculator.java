package chapter01_02test;

import java.util.Scanner;

public class TipCalculator {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	System.out.print("Input the amount of the check: $");
	double checkAmount = input.nextDouble();
	System.out.print("What percentage do you want to tip (15% = .15): ");
	double tipPercentage = input.nextDouble();
	System.out.print("Was your service good or bad: ");
	String serviceQuality = input.next();
	int tipFullPercentage = (int) (tipPercentage * 100);
	double tipCost = (checkAmount * tipPercentage);
	tipCost = (tipCost * 100);
	tipCost = (int) (tipCost);
	tipCost = (double) (tipCost / 100);
	System.out.println("A " + tipFullPercentage + "% tip for a $" + checkAmount + " check is $" + tipCost + "."
		+ " The service was " + serviceQuality + ".");
    }

}
