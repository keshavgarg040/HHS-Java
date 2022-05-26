/*MrsSmithsCreature.java
 * Cooper Cross
 * 10/5/21
 */
package chapter10Test;

public class MrsSmithsCreature {
    private String name;
    private String color;
    private double price;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public MrsSmithsCreature(String nam, String col, double pri) {
	this.name = nam;
	this.color = col;
	this.price = pri;
    }

    public MrsSmithsCreature() {
	this.name = "MISSING";
	this.color = "MISSING";
	this.price = 0.00;
    }
}
