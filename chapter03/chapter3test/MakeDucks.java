// MakeDucks.java
// Cooper Cross
// 3/11/2020
package chapter3test;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MakeDucks {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	Duck duck1 = new Duck();
	duckInfo(duck1);

	Duck duck2 = new Duck();
	duck2.setDuckName("Giraffe");
	duck2.setDuckColor("Yellow and Brown");
	duck2.setDuckQuantity(3);
	duck2.calculateCost();
	duckInfo(duck2);

	Duck duck3 = new Duck();
	duck3.setDuckName("Square Ducky");
	duck3.setDuckColor("Green, Pink, Yellow & Blue");
	duck3.setDuckQuantity(20);
	duck3.calculateCost();
	duckInfo(duck3);

	Duck duck4 = new Duck();
	System.out.print("Enter duck's name: ");
	String duckName = keyboard.nextLine();
	System.out.print("Enter duck's color: ");
	String duckColor = keyboard.nextLine();
	System.out.print("Enter duck's quantity: ");
	int duckQuantity = keyboard.nextInt();

	duck4.setDuckName(duckName);
	duck4.setDuckColor(duckColor);
	duck4.setDuckQuantity(duckQuantity);
	duck4.calculateCost();
	duckInfo(duck4);
    }

    public static void duckInfo(Duck duck) {
	JOptionPane.showMessageDialog(null,
		"Duck's name is " + duck.getDuckName() + "\nDuck's color is " + duck.getDuckColor()
			+ "\nDuck's quantity is " + duck.getDuckQuantity() + "\nDuck's cost is $" + duck.getDuckCost());
    }

}
