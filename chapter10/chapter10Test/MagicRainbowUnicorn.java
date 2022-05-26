/*MagicRainbowUnicorn.java
 * Cooper Cross
 * 10/5/21
 */
package chapter10Test;

public class MagicRainbowUnicorn extends MrsSmithsCreature {
    public MagicRainbowUnicorn(String nam, String col, double pri, boolean wing) {
	super(nam, col, pri);
	this.hasWings = wing;
    }

    public MagicRainbowUnicorn() {
	super("MISSING", "MISSING", 0.00);
    }

    private boolean hasWings;

    public boolean isHasWings() {
	return hasWings;
    }

    public void setHasWings(boolean hasWings) {
	this.hasWings = hasWings;
    }
}
