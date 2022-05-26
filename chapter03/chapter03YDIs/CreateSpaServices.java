package chapter03YDIs;

import java.util.Scanner;

public class CreateSpaServices {
    private static Scanner keyboard;

    public static void main(String[] args) {
	SpaService firstService = new SpaService();
	SpaService secondService = new SpaService();
	firstService = getData(firstService);
	secondService = getData(secondService);
	System.out.println("First service details:");
	System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
	System.out.println("Second service details:");
	System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }

    public static SpaService getData(SpaService s) {
	String service;
	double price;
	keyboard = new Scanner(System.in);
	System.out.print("Enter service >> ");
	service = keyboard.nextLine();
	System.out.print("Enter price >> ");
	price = keyboard.nextDouble();
	keyboard.hasNextLine();
	s.setServiceDescription(service);
	s.setPrice(price);
	return s;
    }

}
