package chapter07Test;

import javax.swing.*;

public class StringOptions {
    public static void userPrompt() {
	String string = JOptionPane.showInputDialog(null, "Input a string:");
	String option = JOptionPane.showInputDialog(null,
		"Please select an option:\nA) Add Delimiter\nB) Number of Letters\nC) Number of Whitespace Characters\nD) Remove Duplicates\nE) Replace\nF) Reverse\nG) Substring\nH) Toggle Case\nI) Quit");
	option = option.toLowerCase();
	switch (option) {
	case "a":

	    // userPrompt();
	    break;

	case "b":
	    JOptionPane.showMessageDialog(null, string.length());
	    userPrompt();
	    break;

	case "c":
	    char space = ' ';
	    int number = 0;
	    for (int i = 0; i < string.length(); i++) {
		if (string.charAt(i) == space) {
		    number++;
		}
	    }
	    JOptionPane.showMessageDialog(null, number);
	    userPrompt();
	    break;

	case "d":

	    userPrompt();
	    break;

	case "e":
	    int index = 0;
	    int n = string.length();
	    char stringArray[] = string.toCharArray();

	    for (int i = 0; i < n; i++) {
		{
		    int j;
		    for (j = 0; j < i; j++) {
			if (stringArray[i] == stringArray[j]) {
			    break;
			}
		    }
		    if (j == i) {
			stringArray[index++] = stringArray[i];
		    }
		}
	    }

	    userPrompt();
	    break;

	case "f":

	    userPrompt();
	    break;

	case "g":

	    userPrompt();
	    break;

	case "h":

	    userPrompt();
	    break;

	case "i":

	    break;
	}

    }

    public static void main(String[] args) {
	userPrompt();
    }

}