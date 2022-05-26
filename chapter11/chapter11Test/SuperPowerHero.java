package chapter11Test;

import javax.swing.JOptionPane;

public class SuperPowerHero extends SuperHero {
    private static int MAX = 10;
    private static int MIN = 1;
    private int amountSuperPowers;
    private int superPowerStrength;

    public SuperPowerHero(String nam, int ag) {
	super(nam, ag);
	setTransportation();
	setSuperPower();
    }

    private String superPower;

    public String getSuperPower() {
	return superPower;
    }

    public void setSuperPower() {
	this.superPower = JOptionPane.showInputDialog("Enter hero's superpower: ");
    }

    @Override
    public void setTransportation() {
	if (JOptionPane
		.showInputDialog(
			"Does the hero's super power provide a means to get from one place to another" + " (y/n): ")
		.toLowerCase().equals("y")) {
	    this.transportation = "does";
	} else
	    this.transportation = "does not";
    }

    @Override
    public String getTransportation() {
	return this.transportation;
    }

    @Override
    public void setCoolness() {
	amountSuperPowers = Integer
		.parseInt(JOptionPane.showInputDialog("Enter the amount of super powers your hero has: "));
	superPowerStrength = Integer
		.parseInt(JOptionPane.showInputDialog("Enter the strength of the super powers (1-10): "));
	this.coolness = (amountSuperPowers + superPowerStrength) / 2;
	if (this.coolness > MAX)
	    this.coolness = MAX;
	else if (this.coolness < MIN)
	    this.coolness = MIN;
    }

    @Override
    public String toString() {
	String heroString = getName() + " has " + getSuperPower() + " as a super power and is " + getAge()
		+ " years old; the hero's super " + getTransportation() + " provide a means of transportation.\n"
		+ "This super hero has a coolness ranking of " + getCoolness();
	return heroString;
    }
}
