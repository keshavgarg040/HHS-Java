/* SugarSmashPlayer.java
 * Cooper Cross
 * 9/14/21
 */
package chapter10Programs;

public class SugarSmashPlayer {
    private int idNumber;
    private String name;
    protected int[] scores;
    private final int MINSCORE = 100;
    private int LEVELS = 10;

    public SugarSmashPlayer() {
	scores = new int[LEVELS];
    }

    public void setIdNumber(int num) {
	idNumber = num;
    }

    public void setName(String player) {
	name = player;
    }

    public void setScore(int score, int level) {
	int i;
	boolean isBadLevel = false;
	if (level < 0 || level > scores.length - 1)
	    System.out.println(level + " is an invalid level number");
	else {
	    for (i = 0; i < level; i++)
		if (scores[i] < MINSCORE)
		    isBadLevel = true;
	    if (isBadLevel)
		System.out.println("A score cannot yet be set for level " + level);
	    else
		scores[level] = score;
	}
    }

    public int getIdNumber() {
	return idNumber;
    }

    public String getName() {
	return name;
    }

    public int getScore(int level) {
	int score = 0;
	if (level < 0 || level > scores.length - 1)
	    System.out.println(level + " is an invalid level number");
	else
	    score = scores[level];
	return score;
    }

    public int getLevels() {
	return LEVELS;
    }
}