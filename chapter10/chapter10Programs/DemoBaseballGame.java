/* DemoBaseballGame.java
 * Cooper Cross
 * 9/17/21
 */
package chapter10Programs;

import java.util.*;

public class DemoBaseballGame {
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	BaseballGame game = new BaseballGame();

	System.out.print("Enter team 1 name: ");
	String team1Name = keyboard.nextLine();
	System.out.print("Enter team 2 name: ");
	String team2Name = keyboard.nextLine();
	game.setNames(team1Name, team2Name);
	for (int i = 0; i < 2; i++)
	    for (int j = 0; j <= 9; j++) {
		System.out.print("Enter score for team " + (i + 1) + " inning " + (j + 1) + ": ");
		game.setScore(i, j, keyboard.nextInt());
	    }
	display(game);
	keyboard.close();
    }

    public static void display(BaseballGame b) {
	int[] total = { 0, 0 };
	boolean areInningsLeft = false;
	int score;
	System.out.println("Game between " + b.getNames());
	for (int t = 0; t < 2; ++t) {
	    for (int i = 0; i < b.getInnings(); ++i) {
		score = b.getScore(t, i);
		if (score != BaseballGame.UNPLAYED) {
		    if (i == 0)
			System.out.print("Team " + t + ": ");
		    System.out.print(score + " ");
		    total[t] += score;
		} else
		    areInningsLeft = true;
	    }
	    System.out.println();
	}
	if (b.getScore(0, 0) == BaseballGame.UNPLAYED && b.getScore(1, 0) == BaseballGame.UNPLAYED)
	    System.out.println("No innings played yet.");
	if (!areInningsLeft) {
	    if (total[0] > total[1])
		System.out.println(b.getName(0) + " win");
	    else if (total[0] < total[1])
		System.out.println(b.getName(1) + " win");
	    else
		System.out.println("Tie Game!");
	}
    }
}