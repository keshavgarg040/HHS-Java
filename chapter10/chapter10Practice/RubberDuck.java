/* RubberDuck.java
 * Cooper Cross
 * 9/13/21
 */

package chapter10Practice;

import java.awt.Color;

public class RubberDuck extends Duck {
    private String material;

    public RubberDuck(Color dColor, String nam, int siz, String mater) {
	super(dColor, nam, siz);
	material = mater;
    }

    public String getMaterial() {
	return material;
    }

    public void setMaterial(String material) {
	this.material = material;
    }
}
