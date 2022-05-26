/* PremiumSugarSmashPlayer.java
 * Cooper Cross
 * 9/14/21
 */
package chapter10Programs;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    private int LEVELS = 50;

    public PremiumSugarSmashPlayer() {
	scores = new int[LEVELS];
    }

    @Override
    public int getLevels() {
	return LEVELS;
    }
}