package chapter10Programs;

import java.util.Scanner;

public class DemoIntelComputer {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	IntelComputer iComputer = new IntelComputer();
	System.out.print(
		"Choose which CPU you would like:\nCore i9-9900k\nCore i7-9700k\nCore i5-9600k\nCore i3-9400k\n");
	iComputer.setCPU(keyboard.nextLine());
	System.out.print("Will your computer have a video card: ");
	if (keyboard.nextLine().toLowerCase().equals("yes")) {
	    iComputer.setVideoCard(true);
	} else if (keyboard.nextLine().toLowerCase().equals("no")) {
	    iComputer.setVideoCard(false);
	}
	System.out.print("Enter the amount of RAM: ");
	iComputer.setRAM(keyboard.nextInt());
	System.out.print("Enter the amount of storage: ");
	iComputer.setStorage(keyboard.nextInt());
	System.out.print("Enter the operating system: ");
	keyboard.nextLine();
	iComputer.setOperatingSystem(keyboard.nextLine());
	System.out.print(iComputer.toString());
	keyboard.close();
    }
}
