// Duck.java
// Cooper Cross
// 3/11/2020
package chapter3test;

public class Duck {
    private String name;
    private String color;
    private int quantity;
    private double cost;

    public Duck() {
	name = "No Name";
	color = "No Color";
	quantity = 0;
    }

    public void setDuckName(String nam) {
	name = nam;
    }

    public void setDuckColor(String col) {
	color = col;
    }

    public void setDuckQuantity(int quan) {
	quantity = quan;
    }

    public void calculateCost() {
	cost = quantity * 0.5;
    }

    public String getDuckName() {
	return name;
    }

    public String getDuckColor() {
	return color;
    }

    public int getDuckQuantity() {
	return quantity;
    }

    public double getDuckCost() {
	return cost;
    }

}
