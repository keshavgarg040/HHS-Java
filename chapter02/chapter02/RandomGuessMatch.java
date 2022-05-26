package chapter02;

import java.util.Scanner;

public class RandomGuessMatch {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	int random = 1 + (int) (Math.random() * 5);
	System.out.print("Guess the number: ");
	int guess = input.nextInt();
	int difference = (random - guess);
	boolean tf = (guess == random);
	System.out.println("Your answer was " + tf);
	System.out.println("The difference between your guess and the value was " + difference);
    }

}
