package chapter03;

import java.util.Scanner;

public class NumbersDemo {
    private static Scanner keyboard;

    public static void main(String[] args) {
	keyboard = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n1 = keyboard.nextInt();
	System.out.print("Enter another number: ");
	int n2 = keyboard.nextInt();
	displayTwiceTheNumber(n1, n2);
	displayNumberPlusFive(n1, n2);
	displayNumberSquared(n1, n2);
    }

    public static void displayTwiceTheNumber(int num1, int num2) {
	int n1 = num1 * 2;
	int n2 = num2 * 2;
	System.out.println("Twice number one is " + n1);
	System.out.println("Twice number two is " + n2);
    }

    public static void displayNumberPlusFive(int num1, int num2) {
	int n1 = num1 + 5;
	int n2 = num2 + 5;
	System.out.println("Number one plus five is " + n1);
	System.out.println("Number two plus five is " + n2);
    }

    public static void displayNumberSquared(int num1, int num2) {
	int n1 = num1 * num1;
	int n2 = num2 * num2;
	System.out.println("Number one squared is " + n1);
	System.out.println("Number two squared is " + n2);
    }

}
