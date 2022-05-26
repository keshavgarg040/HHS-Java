package chapter02;

import java.util.Scanner;

public class MadLib {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	System.out.print("Enter a past-tense verb: ");
	String verb = input.next();
	System.out.print("Enter a noun: ");
	String noun = input.next();
	System.out.print("Enter a adverb: ");
	String adverb = input.next();
	System.out.print("Enter another noun: ");
	String nounZero = input.next();
	System.out.print("The " + noun + " " + adverb + " " + verb + " the " + nounZero + ".");
    }

}
