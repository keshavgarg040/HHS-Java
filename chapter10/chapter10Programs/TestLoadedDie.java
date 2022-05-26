/* TestLoadedDie.java
 * Cooper Cross
 * 9/30/21
 */
package chapter10Programs;

public class TestLoadedDie {
    static int ITERATIONS = 1000;

    public static void main(String args[]) {
	int die1wins = 0;

	for (int i = 0; i < ITERATIONS; i++) {
	    Die die1 = new Die();
	    Die die2 = new Die();

	    if (die1.getValue() > die2.getValue()) {
		++die1wins;
	    }
	}

	System.out.println("With two normal dice, the first die won " + die1wins + " times out of " + ITERATIONS);

	int normalDieWins = 0;

	for (int i = 0; i < ITERATIONS; i++) {
	    Die die = new Die();
	    LoadedDie ldie = new LoadedDie();

	    if (die.getValue() > ldie.getValue()) {
		++normalDieWins;
	    }
	}

	System.out.println("With one normal die and one loaded die, the normal die won " + normalDieWins
		+ " times out of " + ITERATIONS);
    }
}
