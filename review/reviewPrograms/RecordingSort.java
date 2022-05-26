package reviewPrograms;

import java.util.Scanner;

public class RecordingSort {
    public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);

	Recording[] recordings = new Recording[5];
	for (int i = 0; i < recordings.length; i++) {
	    System.out.print("Enter song title: ");
	    recordings[i].setSongTitle(keyboard.nextLine());
	    System.out.print("Enter song artist: ");
	    recordings[i].setSongArtist(keyboard.nextLine());
	    System.out.print("Enter song length in seconds: ");
	    recordings[i].setSongLength(keyboard.nextInt());
	}
	System.out.print("Enter the category you would like to sort by: ");
	String promptResponse = keyboard.nextLine().toLowerCase();
	if (promptResponse == "title") {
	    for (int i = 0; i < recordings.length; i++) {
		for (int j = 0; j < recordings.length; j++) {

		}
	    }
	} else if (promptResponse == "artist") {

	} else if (promptResponse == "playing time") {

	}

    }
}
