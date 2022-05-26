package chapter11Test;

import javax.swing.JOptionPane;

public class SuperWeaponHero extends SuperHero {
    private int amountWeapons;
    private int weaponStrength;
    public static int MAX = 20;
    public static int MIN = 5;

    public SuperWeaponHero(String nam, int ag) {
	super(nam, ag);
	setTransportation();
	setWeapon();
    }

    private String weapon;

    public String getWeapon() {
	return weapon;
    }

    public void setWeapon() {
	this.weapon = JOptionPane.showInputDialog("Enter hero's weapon: ");
    }

    @Override
    public void setTransportation() {
	this.transportation = JOptionPane.showInputDialog("Enter how the hero gets from one place to another: ");
    }

    @Override
    public String getTransportation() {
	return this.transportation;
    }

    @Override
    public void setCoolness() {
	amountWeapons = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of weapons: "));
	weaponStrength = Integer.parseInt(JOptionPane.showInputDialog("Enter the strength of the weapons (1-10): "));
	this.coolness = (amountWeapons + weaponStrength) * 2;
	if (this.coolness > MAX)
	    this.coolness = MAX;
	else if (this.coolness < MIN)
	    this.coolness = MIN;
    }

    public String toString() {
	String heroString = getName() + " has " + getWeapon() + " as a super power and is " + getAge()
		+ " years old; the hero's super " + getTransportation() + " provide a means of transportation.\n"
		+ "This super hero has a coolness ranking of " + getCoolness();
	return heroString;
    }
}
