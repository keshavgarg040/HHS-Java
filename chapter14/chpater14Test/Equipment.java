package chpater14Test;

public class Equipment {
    String item;
    String description;
    double cost;

    public Equipment(String itm, String desc, double cst) {
	setItem(itm);
	setDescription(desc);
	setCost(cst);
    }

    public String getItem() {
	return item;
    }

    public void setItem(String item) {
	this.item = item;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public double getCost() {
	return cost;
    }

    public void setCost(double cost) {
	this.cost = cost;
    }
}
