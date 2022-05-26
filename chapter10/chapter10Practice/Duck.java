/* Duck.java
 * Cooper Cross
 * 9/13/21
 */

package chapter10Practice;

import java.awt.*;

public class Duck {
    // data fields
    private Color duckColor;
    private String name;
    private int size;

    public Duck(Color dColor, String nam, int siz) {
	duckColor = dColor;
	name = nam;
	size = siz;
    }

    public Color getDuckColor() {
	return duckColor;
    }

    public void setDuckColor(Color duckColor) {
	this.duckColor = duckColor;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

}
