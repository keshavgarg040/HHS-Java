// Insurance.java
// 3/3/2020
// Cooper Cross

package chapter03;

import java.util.Scanner;

public class Insurance {
    private static Scanner keyboard;

    public static void main(String[] args) {
	keyboard = new Scanner(System.in);
	System.out.print("Enter the current year: ");
	int currentYear = keyboard.nextInt();
	System.out.print("Enter your birth year: ");
	int birthYear = keyboard.nextInt();
	int premium = calculateInsurancePremium(currentYear, birthYear);
	System.out.println("Your total insurance premium is $" + premium);
    }

    public static int calculateInsurancePremium(int cY, int bY) {
	int age = cY - bY;
	int decade = age / 10;
	int premium = (decade + 15) * 20;
	return premium;
    }

}
