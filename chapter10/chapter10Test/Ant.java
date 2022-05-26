/*Ant.java
 * Cooper Cross
 * 10/5/21
 */
package chapter10Test;

public class Ant extends MrsSmithsCreature {
    public Ant(String nam, String col, double pri, boolean live) {
	super(nam, col, pri);
	this.alive = live;
    }

    public Ant() {
	super("MISSING", "MISSING", 0.00);
    }

    private boolean alive;

    public boolean isAlive() {
	return alive;
    }

    public void setAlive(boolean alive) {
	this.alive = alive;
    }
}
