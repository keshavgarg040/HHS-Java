package chapter02;

import java.util.Scanner;

public class CarlysEventPrice {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	System.out.print("Enter the amount of guests attending: ");
	int amountGuests = input.nextInt();
	int cost = (amountGuests * 35);
	boolean largeEvent = (amountGuests >= 50);
	System.out.println("Number of guests: " + amountGuests);
	System.out.println("The price is $35 per guest");
	System.out.println("Total price: $" + cost);
	System.out.println("Is large event? " + largeEvent);
	System.out.println("*************************************************");
	System.out.println("* Carly's makes the food that makes it a party. *");
	System.out.println("*************************************************");
    }

}
