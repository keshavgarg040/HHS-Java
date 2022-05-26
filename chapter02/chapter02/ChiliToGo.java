package chapter02;

import java.util.Scanner;

public class ChiliToGo {
    private static Scanner input;

    public static void main(String[] args) {
	input = new Scanner(System.in);
	int numberAdultMeals;
	System.out.print("Amount of adult meals: ");
	numberAdultMeals = input.nextInt();
	int numberChildMeals;
	System.out.print("Amount of kids' meals: ");
	numberChildMeals = input.nextInt();
	int adultMealsPrice = (numberAdultMeals * 7);
	int kidsMealsPrice = (numberChildMeals * 4);
	int totalPrice = (adultMealsPrice + kidsMealsPrice);
	System.out.println("Price of adult meals: " + "$" + adultMealsPrice);
	System.out.println("Price of kids' meals: " + "$" + kidsMealsPrice);
	System.out.println("Total Price: " + "$" + totalPrice);

    }

}
