package chapter02YDIs;

import java.util.Scanner;

public class ArithmeticDemo3 {
    private static Scanner input;

    public static void main(String[] args) {
	input = new Scanner(System.in);
	int firstNumber;
	int secondNumber;
	int sum;
	int difference;
	double average;
	System.out.print("Please enter an integer >> ");
	firstNumber = input.nextInt();
	System.out.print("Please enter another integer >> ");
	secondNumber = input.nextInt();
	sum = firstNumber + secondNumber;
	difference = firstNumber - secondNumber;
	average = sum / 2.0;
	System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
	System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
	System.out.println("The acerage of " + firstNumber + " and " + secondNumber + " is " + average);

    }

}
