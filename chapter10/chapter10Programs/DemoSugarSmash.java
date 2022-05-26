/* DemoSugarSmash.java
 * Cooper Cross
 * 9/14/21
 */
package chapter10Programs;

import java.util.Scanner;

public class DemoSugarSmash {
    public static void main(String[] args) {
	int highscore;
	int level;
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Are you a premium player?: ");
	if (keyboard.nextLine().toLowerCase().equals("yes")) {
	    PremiumSugarSmashPlayer pPlayer = new PremiumSugarSmashPlayer();
	    System.out.print("Enter ID Number: ");
	    pPlayer.setIdNumber(keyboard.nextInt());
	    System.out.print("Enter Name: ");
	    keyboard.nextLine();
	    pPlayer.setName(keyboard.nextLine());
	    for (int i = 1; i < pPlayer.scores.length; i++) {
		System.out.print("Enter level: ");
		level = keyboard.nextInt();
		System.out.print("Enter highscore: ");
		highscore = keyboard.nextInt();
		pPlayer.setScore(highscore, level);
	    }
	    display(pPlayer);
	} else if (keyboard.nextLine().toLowerCase().equals("no")) {
	    SugarSmashPlayer player = new SugarSmashPlayer();
	    System.out.print("Enter ID Number: ");
	    player.setIdNumber(keyboard.nextInt());
	    System.out.print("Enter Name: ");
	    keyboard.nextLine();
	    player.setName(keyboard.nextLine());
	    for (int i = 1; i < player.scores.length; i++) {
		System.out.print("Enter level: ");
		level = keyboard.nextInt();
		System.out.print("Enter highscore: ");
		highscore = keyboard.nextInt();
		player.setScore(highscore, level);
		display(player);
	    }
	}
	keyboard.close();
    }

    public static void display(SugarSmashPlayer p) {
	System.out.println("   ID #" + p.getIdNumber() + "  Name: " + p.getName());
	for (int i = 0; i < p.getLevels(); i++)
	    System.out.print("   " + p.getScore(i));
	System.out.println();
    }
}