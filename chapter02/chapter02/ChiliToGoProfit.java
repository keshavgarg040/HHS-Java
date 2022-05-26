package chapter02;

import java.util.Scanner;

public class ChiliToGoProfit {
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
	// int totalPrice = (adultMealsPrice + kidsMealsPrice);
	float costAdultMeals = (float) (numberAdultMeals * 4.35);
	float costKidsMeals = (float) (numberChildMeals * 3.10);
	float profitAdultMeals = (adultMealsPrice - costAdultMeals);
	float profitKidsMeals = (kidsMealsPrice - costKidsMeals);
	profitKidsMeals = (int) (profitKidsMeals * 100);
	profitKidsMeals = (float) (profitKidsMeals / 100);
	float totalProfit = (profitAdultMeals + profitKidsMeals);
	totalProfit = (int) (totalProfit * 100);
	totalProfit = (float) (totalProfit / 100);
	System.out.println("Profit of adult meals: " + "$" + profitAdultMeals);
	System.out.println("Profit of kids' meals: " + "$" + profitKidsMeals);
	System.out.println("Total Profit: " + "$" + totalProfit);

    }

}
