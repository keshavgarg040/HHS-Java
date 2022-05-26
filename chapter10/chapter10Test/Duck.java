/*Duck.java
 * Cooper Cross
 * 10/5/21
 */
package chapter10Test;

public class Duck extends MrsSmithsCreature {
    public Duck(String nam, String col, double pri, boolean noi) {
	super(nam, col, pri);
	this.noise = noi;
    }

    public Duck() {
	super("MISSING", "MISSING", 0.00);
    }

    private boolean noise;

    public boolean isNoise() {
	return noise;
    }

    public void setNoise(boolean noise) {
	this.noise = noise;
    }
}
