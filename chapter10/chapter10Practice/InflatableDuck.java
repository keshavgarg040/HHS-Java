/* IflatableDuck.java
 * Cooper Cross
 * 9/12/21
 */
package chapter10Practice;

import java.awt.Color;

public class InflatableDuck extends Duck {
    private int airLevel;

    public InflatableDuck(Color dColor, String nam, int siz, int air) {
	super(dColor, nam, siz);
	airLevel = air;
    }

    public int getAirLevel() {
	return airLevel;
    }

    public void setAirLevel(int airLevel) {
	this.airLevel = airLevel;
    }
}
