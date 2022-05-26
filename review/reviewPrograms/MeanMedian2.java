package reviewPrograms;

import java.util.Scanner;

public class MeanMedian2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int[] values = new int[20];
	for (int i = 0; i < 20; i++) {
	    System.out.print("Enter an integer: ");
	    values[i] = keyboard.nextInt();
	}

	final int median = (values[9] + values[10]) / 2;
	int sum = 0;

	for (int x = 0; x < values.length; x++) {
	    sum = sum + values[x];
	}
	final int mean = sum / values.length;

	System.out.print("The values are: ");
	for (int j = 0; j < values.length; j++) {
	    if (j < 19) {
		System.out.print(values[j] + ", ");
	    } else {
		System.out.println("and " + values[j]);
	    }
	}
	System.out.println("The mean is: " + mean);
	System.out.println("The median is: " + median);
    }

}
